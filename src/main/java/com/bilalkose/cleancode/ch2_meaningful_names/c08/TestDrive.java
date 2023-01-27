package main.java.com.bilalkose.cleancode.ch2_meaningful_names.c08;

public class TestDrive {
    //Anlam Bütünlüğü ve Metot Parçalama

    //Address bilgileri context'ine bağlanılabildi bu değişkenlere bakılarak. Ama tek kullanılan yerler de olduğu için (örneğin state, zipCode) bunlara ortak bir şey eklemekte fayda vardır
    //    String zipCode;
    //    String firstName;
    //    String lastLame;
    //    String state;
    //    String street;

    //yerine;

    String addrZipCode;
    String firstName;
    String lastLame;
    String addrState;
    String street;

    public static void main(String[] args) {

    }
}

//daha anlaşılabilir ve parçalanmış metotlar halinde olması işi çok kolaylaştırır.
//bir metot parçalanabilecek kadar parçalanırsa okunması daha kolay olur -> Chapter 3