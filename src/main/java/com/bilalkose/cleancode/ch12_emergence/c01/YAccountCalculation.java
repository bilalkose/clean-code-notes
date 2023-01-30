package main.java.com.bilalkose.cleancode.ch12_emergence.c01;

public class YAccountCalculation {

    private final int rate;

    public YAccountCalculation(int rate) {
        this.rate = rate;
    }

    public double calculate(int rate, int userInput) {

        int result = 0;
        result = rate*userInput+19293;

        return AccountUtil.finalizeAmount(result);
    }

}
