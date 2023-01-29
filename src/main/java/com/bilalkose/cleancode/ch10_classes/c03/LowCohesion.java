package main.java.com.bilalkose.cleancode.ch10_classes.c03;

import main.java.com.bilalkose.cleancode.ch10_classes.c03.helper.SomeObject;

public class LowCohesion {
    SomeObject someObject = new SomeObject(); //low cohesion (kullanılma oranı az)
    SomeObject someOtherObject = new SomeObject(); //low cohesion
    SomeObject someOtherOtherObject = new SomeObject(); //low cohesion

    public void method1(){
        someObject.helloItsMe();;
    }

    public void method2(){
        someOtherObject.helloItsMe();;
    }

    public void method3(){
        someOtherOtherObject.helloItsMe();;
    }
}
