package main.java.com.bilalkose.cleancode.ch10_classes.c03;

import main.java.com.bilalkose.cleancode.ch10_classes.c03.helper.SomeObject;

public class HighCohesion {
    SomeObject someObject = new SomeObject(); //high cohesion (kullanılma oranı fazla)
    //open-closed prensibine uygun

    public void method1(){
        someObject.helloItsMe();;
    }
}
