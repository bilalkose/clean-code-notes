package main.java.com.bilalkose.cleancode.ch3_functions.c06;

public class TestDrive {

    public static void main(String[] args) {

        // *********
        // Common Monadic Forms

        // boolean fileExists("myFile")
        // InputStream fileOpen("myFile")

        // verilmesi gereken yerlerde argüman verilmelidir

        // *********

        String file = "file";
        //yanlış kullanım. argüman olarak böyle bir flag gördüğünde sorun olduğunu anlamalısın. single responsibility'e uymuyor
        FlagMethod.save(file, true);


        //doğru kullanım
        FlagMethod.isVersionIncrement(file);
        FlagMethod.saveNew(file);



    }

}
