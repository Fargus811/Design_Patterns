package main.java.com.sergeev.behavioral_pattern.visitor.example_visitor;

import main.java.com.sergeev.behavioral_pattern.visitor.shape.Circle;
import main.java.com.sergeev.behavioral_pattern.visitor.shape.CompoundShape;
import main.java.com.sergeev.behavioral_pattern.visitor.shape.Dot;
import main.java.com.sergeev.behavioral_pattern.visitor.shape.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
