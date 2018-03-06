package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    public double sub(double a, double b) {
        double result2 = a - b;
        display.displayValue(result2);
        return result2;
    }

    public double mul (double a, double b) {
        double result3 = a * b;
        display.displayValue(result3);
        return result3;
    }

    public  double div ( double a, double b) {
        double result4 = a / b;
        display.displayValue(result4);
        return result4;
    }
}
