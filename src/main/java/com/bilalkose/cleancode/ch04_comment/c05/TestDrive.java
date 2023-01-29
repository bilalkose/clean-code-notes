package main.java.com.bilalkose.cleancode.ch04_comment.c05;

import java.util.regex.Pattern;

public class TestDrive{
    //mantıklı. regex açıklamaları için
    // format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");

}
