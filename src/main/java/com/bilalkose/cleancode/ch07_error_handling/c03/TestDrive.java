package main.java.com.bilalkose.cleancode.ch07_error_handling.c03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {
    //Dont return null - Dont pass null

    //null kullanmak yerine en kötü ihtimalle Collections.emptyList kullanabiliriz.
    //getInStockCheeses metodunda if'i null döndürürsek bu metodu kullandığımız her yerde null check kontrolü yapmamız gerekecekti

    private static final List<Cheese> cheesesInStock = new ArrayList<>();

    /**
     * @return a list containing all of the cheeses in the shop,
     *     or null if no cheeses are available for purchase.
     */
    public static List<Cheese> getInStockCheeses() { // Look main method
        return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
    }

    public static void main(String[] args){

        List<Cheese> cheeses = getInStockCheeses();

        if (cheeses != null && cheeses.contains(Cheese.CHEDDAR)) { // You need to check null
            System.out.println("We have cheese in stock");
        }

    }

}
