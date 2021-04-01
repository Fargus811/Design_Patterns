package main.java.com.sergeev.behavioral_pattern.observer.listener;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
