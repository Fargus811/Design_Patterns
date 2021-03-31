package main.java.com.sergeev.structural_pattern.bridge;

import main.java.com.sergeev.structural_pattern.bridge.device.Device;
import main.java.com.sergeev.structural_pattern.bridge.device.Radio;
import main.java.com.sergeev.structural_pattern.bridge.device.Tv;
import main.java.com.sergeev.structural_pattern.bridge.remote.AdvancedRemote;
import main.java.com.sergeev.structural_pattern.bridge.remote.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
