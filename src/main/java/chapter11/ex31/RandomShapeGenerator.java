package chapter11.ex31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by pyvov on 13.01.2017.
 */
public class RandomShapeGenerator implements Iterable<Shape> {
    private ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();
    private Random rand = new Random();

    public RandomShapeGenerator(int n) {
        for (int i = 0; i < n; i++) {
            shapeArrayList.add(getRandomShape());
        }
    }

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(5);
        for (Shape s : rsg) {
            System.out.print(s + " ");
        }
    }

    private Shape getRandomShape() {
        int k = rand.nextInt(3);
        switch (k) {
            case 0:
                return new Circus();
            case 1:
                return new Rectangular();
            case 2:
                return new Square();
            default:
                return new Shape();
        }
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            public boolean hasNext() {
                return index < shapeArrayList.size();
            }

            public Shape next() {
                return shapeArrayList.get(index++);
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

class Shape {
    @Override
    public String toString() {
        return "Shape";
    }
}

class Circus extends Shape {
    @Override
    public String toString() {
        return "Circus";
    }
}

class Rectangular extends Shape {
    @Override
    public String toString() {
        return "Rectangular";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}
