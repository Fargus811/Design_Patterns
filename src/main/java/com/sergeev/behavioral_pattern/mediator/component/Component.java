package main.java.com.sergeev.behavioral_pattern.mediator.component;

import main.java.com.sergeev.behavioral_pattern.mediator.example_mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {

    void setMediator(Mediator mediator);
    String getName();
}