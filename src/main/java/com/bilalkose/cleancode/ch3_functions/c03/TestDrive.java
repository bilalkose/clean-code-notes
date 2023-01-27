package main.java.com.bilalkose.cleancode.ch3_functions.c03;

import java.util.List;

public class TestDrive {
    //S OLID

    //Functions should do one thing. they should do it well. they should do it only

    private List<Passenger> passengerList;
    String state;

    public void addPassenger(Passenger p){
        //add in dışında state güncelleme operasyonu da var. bir metot bir iş yapması lazım. o yüzden if leri ayrı bir metoda daha alman gerekir.
        //c303.png
        this.passengerList.add(p);
        if(passengerList.size() < 10)
            this.state = "Empty";
        else if(passengerList.size() <30)
            this.state = "Half";
        else if(passengerList.size() >= 30)
            this.state = "Full";
    }
}

