package main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.factories;

import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.buttons.Button;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.buttons.MacOSButton;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.checkboxes.Checkbox;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
