package main.java.com.bilalkose.cleancode.ch14_successive_refinement.c01.templatetwo;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }
}
