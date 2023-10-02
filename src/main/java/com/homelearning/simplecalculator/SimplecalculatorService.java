package com.homelearning.simplecalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class SimplecalculatorService implements ISimplecalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtraction(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplication(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String division(int num1, int num2) {
        if (num2 == 0)
            return "На ноль делить нельзя";
        else
            return num1 + " / " + num2 + " = " + (num1 / (float) num2);
    }

}
