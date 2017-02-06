package chapter15.ex19;

import chapter15.generics.Generator;
import chapter15.generics.Generators;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nazar on 02/02/17.
 */
class Item {
    private final long id;
    private String description;
    private double price;

    public Item(long id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Item> generator =
            new Generator<Item>() {
                private Random rand = new Random(47);

                public Item next() {
                    return new Item(rand.nextInt(1000), "Test",
                            Math.round(rand.nextDouble() * 1000.0) + 0.99);
                }
            };
}

class Container extends ArrayList<Item> {
    public Container(int nItems) {
        Generators.fill(this, Item.generator, nItems);
    }
}

public class Ship extends ArrayList<Container> {
    public Ship(int nContainers, int nItems) {
        for (int i = 0; i < nContainers; i++) {
            add(new Container(nItems));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Container c : this) {
                for (Item i : c) {
                    result.append(i);
                    result.append("\n");
                }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Ship(10, 2));
    }
}
