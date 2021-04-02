package main.java.com.sergeev.behavioral_pattern.visitor.shape;

import main.java.com.sergeev.behavioral_pattern.visitor.example_visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
