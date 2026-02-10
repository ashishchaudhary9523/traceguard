package com.tresless.demo.exception;

import java.time.Instant;

public record ApiErrorResponse(
        String error ,
        String message ,
        String reason ,
        String path ,
        Instant timestamp
) {
}
