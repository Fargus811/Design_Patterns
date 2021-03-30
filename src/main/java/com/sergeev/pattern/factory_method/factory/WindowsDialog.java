package main.java.com.sergeev.pattern.factory_method.factory;

import main.java.com.sergeev.pattern.factory_method.button.Button;
import main.java.com.sergeev.pattern.factory_method.button.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}