package chapter14.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pyvov on 17.01.2017.
 */
abstract class Shape {
    protected boolean bold = false;

    void draw() {
        System.out.println(this + ".draw()");
    }

    void setBold() {
        bold = true;
    }

    void resetBold() {
        bold = false;
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle " + bold;
    }
}

class Square extends Shape {
    public String toString() {
        return "Square " + bold;
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle " + bold;
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid " + bold;
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<Shape>(Arrays.asList(
                new Rhomboid(), new Circle(), new Triangle(), new Square()
        ));
        for (Shape shape : shapeList) {
            if (shape instanceof Rhomboid) {
                shape.setBold();
            }
        }
        System.out.println(shapeList);
    }
}
