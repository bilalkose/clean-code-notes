package main.java.com.bilalkose.cleancode.ch3_functions.c02;

public class GoodExample {

    private HelperClass helperClass;

    // Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı??
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (!checkNlpNeed(channelRequest)){
            helperClass.getButtonAnswer();
        }
        getAnswerWithNlpEngine(channelRequest);

        //göründüğü gibi fonksiyonlar parçalandı. hepsi tek bir iş yaptı ve metottaki kodlar kısalmış oldu.

    }

    public boolean checkNlpNeed(ChannelRequest channelRequest) {
        if (channelRequest.isEarlyControl() && channelRequest.isPostback()) {
            return false;
        }
        return true;
    }

    public void getAnswerWithoutNlpEngine(ChannelRequest channelRequest) {
        helperClass.getEarlyAnswer();
    }

    public void getAnswerWithNlpEngine(ChannelRequest channelRequest) {
        String nlpResult = helperClass.nlpEngine();
        helperClass.getAnswer(nlpResult);
    }

}
