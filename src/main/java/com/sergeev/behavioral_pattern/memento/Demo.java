package main.java.com.sergeev.behavioral_pattern.memento;

import main.java.com.sergeev.behavioral_pattern.memento.editor.Editor;
import main.java.com.sergeev.behavioral_pattern.memento.shape.Circle;
import main.java.com.sergeev.behavioral_pattern.memento.shape.CompoundShape;
import main.java.com.sergeev.behavioral_pattern.memento.shape.Dot;
import main.java.com.sergeev.behavioral_pattern.memento.shape.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
