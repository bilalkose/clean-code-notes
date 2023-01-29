package main.java.com.bilalkose.cleancode.ch08_boundaries.c01;

import java.util.HashMap;
import java.util.Map;

public class TestDrive {

    public static void main(String[] args){

        Map map = new HashMap();

        Sensors sensors = new Sensors();
        sensors.getById("1"); //direkt map içindeki metotları gizlemiş oldum


    }
}
