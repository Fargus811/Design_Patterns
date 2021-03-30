package main.java.com.sergeev.pattern.abstract_factory.factory;

import main.java.com.sergeev.pattern.abstract_factory.button.Button;
import main.java.com.sergeev.pattern.abstract_factory.button.WindowsButton;
import main.java.com.sergeev.pattern.abstract_factory.checkbox.Checkbox;
import main.java.com.sergeev.pattern.abstract_factory.checkbox.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
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
