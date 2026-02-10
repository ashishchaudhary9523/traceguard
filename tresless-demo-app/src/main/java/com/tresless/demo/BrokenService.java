package com.tresless.demo;

import com.tresless.demo.exception.InternalServiceException;
import org.springframework.stereotype.Service;

@Service
public class BrokenService {
    public String doSomethingRisky() {
        throw new InternalServiceException("Simulated service failure");
    }
}
