package main.java.com.bilalkose.cleancode.ch02_meaningful_names.c05;

public class KotuOrnek {
    //Aranabilir İsimlendirme Yap

    private String m_dsc; //the textual description

    void setName(String name){
        m_dsc = name; // böyle bir kullanımdan uzak durulmalı. iyi ornekteki gibi yapılması daha doğrudur.
    }
    int s;
    int[] t; //arandığında bulunacak tarzda bir isim değil.
    {
        for(int j=0; j<34; j++){
            s+= (t[j]*4)/5;
        }
    }
}
