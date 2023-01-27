package main.java.com.bilalkose.cleancode.ch3_functions.c10;

public class UserValidator{
    private Cryptographer cryptographer;

    public boolean checkPasswordAndInitializeSession(String userName, String password){
        User user = UserGateway.findByName(userName);
        if(user != User.NULL){
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if("Valid Password".equals(phrase)){
                Session.initialize(); //burada bu olduğu için checkPassword olan metodun ismini checkPasswordAndInitializeSession olarak güncellendi.
                // (Normalde güncellemek yerine ayrı bir yere almak daha iyidir ama ne olursa olsun ayrılamadığı senaryoya göre düşünülürse)
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        UserValidator us = new UserValidator();

        us.checkPasswordAndInitializeSession("Furkan","furkan123");

    }

}

