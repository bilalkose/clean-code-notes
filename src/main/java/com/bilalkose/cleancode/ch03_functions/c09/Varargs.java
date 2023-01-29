package main.java.com.bilalkose.cleancode.ch03_functions.c09;

public class Varargs {

    public static int sum(int... args) {
        int sum = 0;
        for (int i : args)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        sum(1,2,3,4,5);


    }

}
