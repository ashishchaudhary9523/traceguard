package com.tresless.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final BrokenService brokenService;

    public DemoController(BrokenService brokenService) {
        this.brokenService = brokenService;
    }

    @GetMapping("/fail")
    public String fail() {
        brokenService.doSomethingRisky();

        return "OK";
    }
}
