package main.java.com.bilalkose.cleancode.ch12_emergence.c01;

public final class AccountUtil {

    private AccountUtil () {

    }

    public static double finalizeAmount(double input) {
        return input = Math.round(input * 100.0) / 100.0;
    }
}
