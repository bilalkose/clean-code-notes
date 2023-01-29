package main.java.com.bilalkose.cleancode.ch02_meaningful_names.c03;

import java.math.BigDecimal;

public class TestDrive {
    //Anlamlı Ayrımlandırmalar Yap
    public static void main(String[] args) {

        //Effective: parasal işlemlerde her zaman BigDecimal kullanılmalı!

        BigDecimal money;
        BigDecimal moneyAmount; //ayırt edici değil. manası yok. ilk bakışta "money" değişkeni ile aynı anlama geldiğini düşünülür.
        BigDecimal moneyBigDecimal; //ayırt edici değil. manası yok

        String nameString; //ayırt edici değil. manası yok

        Customer c = new Customer();
        CustomerObject c2 = new CustomerObject(); //ayırt edici değil. manası yok. ikisi arasındaki fark belli değil. daha ayırt edici isimlendirmeler yapılması gerek
    }
}
