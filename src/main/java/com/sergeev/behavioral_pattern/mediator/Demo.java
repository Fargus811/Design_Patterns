package main.java.com.sergeev.behavioral_pattern.mediator;

import main.java.com.sergeev.behavioral_pattern.mediator.component.*;
import main.java.com.sergeev.behavioral_pattern.mediator.example_mediator.Editor;
import main.java.com.sergeev.behavioral_pattern.mediator.example_mediator.Mediator;

import javax.swing.*;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
