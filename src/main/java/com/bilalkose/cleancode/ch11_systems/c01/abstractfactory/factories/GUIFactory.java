package main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.factories;

import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.buttons.Button;
import main.java.com.bilalkose.cleancode.ch11_systems.c01.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
