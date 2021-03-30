package main.java.com.sergeev.pattern.abstract_factory.factory;

import main.java.com.sergeev.pattern.abstract_factory.button.Button;
import main.java.com.sergeev.pattern.abstract_factory.button.MacOSButton;
import main.java.com.sergeev.pattern.abstract_factory.checkbox.Checkbox;
import main.java.com.sergeev.pattern.abstract_factory.checkbox.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
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
