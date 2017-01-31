package chapter7.reusing;

/**
 * Created by pyvov on 14.01.2017.
 */
class Shape {
    Shape(int i) {
        System.out.println("Constructor Shape");
    }

    void dispose() {
        System.out.println("Disposing Shape");
    }
}

class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Drawing a Circle");
    }

    void dispose() {
        System.out.println("Disposing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Drawing a Triangle");
    }

    void dispose() {
        System.out.println("Disposing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing a Line: " + start + ", " + end);
    }

    void dispose() {
        System.out.println("Disposing Line");
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }

    void dispose() {
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i > -1; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            System.out.println("try");
            return;
        } finally {
            x.dispose();
        }
    }
}
