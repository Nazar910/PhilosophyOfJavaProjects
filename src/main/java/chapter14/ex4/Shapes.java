package chapter14.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pyvov on 17.01.2017.
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<Shape>(Arrays.asList(
                new Rhomboid()
        ));
        System.out.println(shapeList.get(0) instanceof Rhomboid ?
                (Rhomboid) shapeList.get(0) : shapeList.get(0));
    }
}
