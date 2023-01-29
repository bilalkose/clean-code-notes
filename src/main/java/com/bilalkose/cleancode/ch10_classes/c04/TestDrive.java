package main.java.com.bilalkose.cleancode.ch10_classes.c04;

public class TestDrive {
    //Open-Closed -> Modifikasyona kapalı, genişlemeye açık.

    public void calculate(CalculatorOperation operation) {
        operation.operation();
    }
}
