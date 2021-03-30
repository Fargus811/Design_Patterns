package main.java.com.sergeev.pattern.abstract_factory.factory;

import main.java.com.sergeev.pattern.abstract_factory.button.Button;
import main.java.com.sergeev.pattern.abstract_factory.checkbox.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}