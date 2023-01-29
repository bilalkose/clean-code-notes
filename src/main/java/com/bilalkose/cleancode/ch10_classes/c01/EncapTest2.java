package main.java.com.bilalkose.cleancode.ch10_classes.c01;

public class EncapTest2 {

    //get-set ilgili metotların birbirine yakın-alt alta olması daha okunaklıdır

    private String name;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
