package main.java.com.sergeev.pattern.abstract_factory.app;

import main.java.com.sergeev.pattern.abstract_factory.button.Button;
import main.java.com.sergeev.pattern.abstract_factory.checkbox.Checkbox;
import main.java.com.sergeev.pattern.abstract_factory.factory.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}