package com.tresless.demo.handler;

import com.tresless.core.ai.ErrorExplainer;
import com.tresless.core.error.ErrorContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final ErrorExplainer errorExplainer;

    public GlobalExceptionHandler(ErrorExplainer errorExplainer) {
        this.errorExplainer = errorExplainer;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleException(Exception ex) {

        ErrorContext context = new ErrorContext(
                "tresless-demo-app",
                "HTTP_REQUEST",
                ex
        );

        String explanation = errorExplainer.explain(context);

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of(
                        "error", ex.getClass().getSimpleName(),
                        "message", ex.getMessage(),
                        "explanation", explanation
                ));
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNoHandlerFoundException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of(
                        "error" , "NOT_FOUND" ,
                        "message" , "No such API exists",
                        "explanation" , "The requested endpoint does not exist. Please check the url"
                ));
    }

}