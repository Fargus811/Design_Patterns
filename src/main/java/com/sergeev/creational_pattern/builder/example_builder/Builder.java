package main.java.com.sergeev.creational_pattern.builder.example_builder;

import main.java.com.sergeev.creational_pattern.builder.car.CarType;
import main.java.com.sergeev.creational_pattern.builder.component.Engine;
import main.java.com.sergeev.creational_pattern.builder.component.GPSNavigator;
import main.java.com.sergeev.creational_pattern.builder.component.Transmission;
import main.java.com.sergeev.creational_pattern.builder.component.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
