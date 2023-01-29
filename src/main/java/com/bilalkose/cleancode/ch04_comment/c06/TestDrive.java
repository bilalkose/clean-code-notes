package main.java.com.bilalkose.cleancode.ch04_comment.c06;

public class TestDrive{

    /*
    public void testConcurrentAddWidgets() throws Exception{
        WidgetBuilder widgetBuilder = new WidgetBuilder(new Class[]{BoldWidget.class});
        String text = "'''bold text'''";
        ParentWidget parent = new BoldWidget(new MockWidgetRoot(), "'''bold text'''");
        AtomicBoolean failFlag = new AtomicBoolean();
        failFlag.set(false);


        //mantıklı -> problem için en iyi çözüm olduğunu kendince belirtmek için (metodu açıklamak anlamında değil)
        //This is our best attempt to get a race condition
        //by creating large number of threads.
        for(int i = 0; i < 25000; i++){
            WidgetBuilderThread widgetBuilderThread = new WidgetBuilderThread(widgetBuilder, text, parent, failFlag);
            Thread thread = new Thread(widgetBuilderThread);
            thread.start();
        }
        assertEquals(false, failFlag.get());
    }
     */

}
