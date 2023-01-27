package main.java.com.bilalkose.cleancode.ch3_functions.c04.solution;

import main.java.com.bilalkose.cleancode.ch3_functions.c04.Money;

public class SalariedEmployee extends Employee {
    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
