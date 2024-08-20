package com.ebay;

public class DivideOperator implements ArithmeticOperator {
    public double apply(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}