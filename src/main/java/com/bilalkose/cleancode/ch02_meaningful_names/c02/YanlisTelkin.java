package main.java.com.bilalkose.cleancode.ch02_meaningful_names.c02;

public class YanlisTelkin {
    //Yanlış Telkinden Kaçın

    static int O = 0;
    static int l = 1;

    // O ve 0. biri o ve biri sıfır
    //1 ve l.
    //böyle birbirine benzer şeyleri kullanmamaya özen gösterilmeli!

    String accountList = ""; //string kullanılacaksa neden list'ten bahsediliyor? kafa karıştırmaya gerek yok!
    //bunlar kafa karıştırıcı ve yanlış kullanımdır

    public static void main(String[] args){


        {
            int a = l;
            if(O == l)
                a = 1;
            else
                l = 01;
        }

    }
}
