package main.java.com.bilalkose.cleancode.ch03_functions.c02;

public class BadExample {

    private HelperClass helperClass;

    // Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı??
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (channelRequest.isPostback() && channelRequest.isEarlyControl()){ // Ne anlatıyor?. burada bir işlem var.
            /*

             */
            helperClass.getButtonAnswer();
        }
        String nlpResult = helperClass.nlpEngine();
        /*
            Uzayabilir... Burada işlemler yapılabileceği çok açık.
         */
        helperClass.getAnswer(nlpResult);
    }

}
