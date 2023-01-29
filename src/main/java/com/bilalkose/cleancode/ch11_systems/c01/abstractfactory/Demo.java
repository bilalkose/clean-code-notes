package main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory;

import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.factories.GUIFactory;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.factories.MacOSFactory;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.factories.WindowsFactory;

public class Demo {
    //Abstract Factory

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        osName = "mac";
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
