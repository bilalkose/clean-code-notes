package main.java.com.bilalkose.cleancode.ch04_comment.c12;

public class TestDrive{

    boolean closed;
    // Utility method that returns when this.closed is true. Throws an exception
    // if the timeout is reached.
    public synchronized void waitForClose(final long timeoutMillis) throws Exception{
        if(!closed){
            wait(timeoutMillis);
            if(!closed)
                throw new Exception("MockResponseSender could not be closed");
        }
    }

}
