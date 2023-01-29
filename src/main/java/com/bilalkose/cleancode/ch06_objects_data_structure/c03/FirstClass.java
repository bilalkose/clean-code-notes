package main.java.com.bilalkose.cleancode.ch06_objects_data_structure.c03;

public class FirstClass {
    Team team;

    public void makeUp1(){
        team.performance.member.goal.shoot();
    }


    //bu şekilde yani sıra sıra haberleşerek gitmek daha doğru bir koddur.
    public void getItDone(){
        team.increasePerform();
    }

}
