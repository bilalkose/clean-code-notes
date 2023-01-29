package main.java.com.bilalkose.cleancode.ch05_formatting.c03;

public class TestDrive{
    int lineCount;
    int totalChars;

    private void measureLine(String line){
        lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
    }

}
