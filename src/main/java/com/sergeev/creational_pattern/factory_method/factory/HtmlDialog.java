package main.java.com.sergeev.creational_pattern.factory_method.factory;

import main.java.com.sergeev.creational_pattern.factory_method.button.Button;
import main.java.com.sergeev.creational_pattern.factory_method.button.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
