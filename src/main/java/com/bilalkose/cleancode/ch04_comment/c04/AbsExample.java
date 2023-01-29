package main.java.com.bilalkose.cleancode.ch04_comment.c04;

public abstract class AbsExample{

    //mantıklı -> abstract metodun ne iş yaptığını açıklamak için. çünkü abstract metotlarda body olmaz.

    // Returns an instance of the Responder being tested.
    protected abstract Responder responderInstance();


    //ya da bunun yerine daha açıklayıcı bir isim. ama üstteki de güzel bir kullanımdır.
    // responderBeingTested

}
