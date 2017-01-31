package chapter8.polym.methods;

/**
 * Created by pyvov on 02.01.2017.
 */
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int r) {
        this.radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private long a = 1;
    private long b = 1;

    RectangularGlyph(long a, long b) {
        this.a = a;
        this.b = b;
        System.out.println("RectangularGlyph.RectangularGlyph(), a = " + a + ", b = " + b);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw(), a = " + a + ", b = " + b);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph(5,6);
    }
}
