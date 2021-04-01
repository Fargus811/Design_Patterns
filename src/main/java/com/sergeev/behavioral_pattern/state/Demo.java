package main.java.com.sergeev.behavioral_pattern.state;

import main.java.com.sergeev.behavioral_pattern.state.ui.Player;
import main.java.com.sergeev.behavioral_pattern.state.ui.UI;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
