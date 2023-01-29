package main.java.com.bilalkose.cleancode.ch07_error_handling.c02;

import java.io.IOException;

public class TestDrive {
    //Unchecked (try-catch'e zorlamayacak) exceptionları tercih edin.


    /*
        Checked exception atan bir yapıyı lambdalar ile kullanamayız.
     */

    static void stringConverter() throws RuntimeException {
        String test = null;
        test.toString();
    }


    public static void main(String[] args) {


        stringConverter();
        System.out.println("Hello");

    }

}
