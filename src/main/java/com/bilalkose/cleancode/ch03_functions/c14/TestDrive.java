package main.java.com.bilalkose.cleancode.ch03_functions.c14;

public class TestDrive{
    //Try-Catch'leri ayırın

    //hata mekanizmasıyla ana mekanizmayı birbirinden ayırıp esnek hale getirmek

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        //registry.deleteReference(page.name);
        //configKeys.deleteKey(page.name.makeKey());
    }


    private void logError(Exception e) {
        System.out.println("Log error!");
    }


    public void deletePage(Page page){

    }


}
