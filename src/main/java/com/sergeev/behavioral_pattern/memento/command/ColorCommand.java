package main.java.com.sergeev.behavioral_pattern.memento.command;

import main.java.com.sergeev.behavioral_pattern.memento.editor.Editor;
import main.java.com.sergeev.behavioral_pattern.memento.shape.Shape;

import java.awt.*;


public class ColorCommand implements Command {

    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
