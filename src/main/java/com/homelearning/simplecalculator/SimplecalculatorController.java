package com.homelearning.simplecalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplecalculatorController {

    @GetMapping(path = "/calculator")
    public String welcome() {
        return null;
    }
}
