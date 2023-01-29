package main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.factories;

import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.buttons.Button;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.buttons.WindowsButton;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.checkboxes.Checkbox;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
