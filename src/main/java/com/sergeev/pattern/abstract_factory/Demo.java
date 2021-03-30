package main.java.com.sergeev.pattern.abstract_factory;

import main.java.com.sergeev.pattern.abstract_factory.app.Application;
import main.java.com.sergeev.pattern.abstract_factory.factory.GUIFactory;
import main.java.com.sergeev.pattern.abstract_factory.factory.MacOSFactory;
import main.java.com.sergeev.pattern.abstract_factory.factory.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
