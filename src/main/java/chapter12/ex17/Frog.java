package chapter12.ex17;


/**
 * Created by pyvov on 14.01.2017.
 */
class Charasteristic {
    private String s;

    public Charasteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("Finishing Characteristic " + s);
    }
}

class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

    protected void dispose() {
        System.out.println("Finishing Description " + s);
    }
}

class LivingCreature {
    private Charasteristic p = new Charasteristic("living creature");
    private Description t = new Description("just a living creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("dispose() in LivingCreature ");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Charasteristic p = new Charasteristic("has a heart");
    private Description t = new Description("animal, not a plant");

    public Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose() in Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Charasteristic p = new Charasteristic("can live in the water");
    private Description t = new Description("both in the water and on the ground");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose() in Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian {
    private Charasteristic p = new Charasteristic("quacks");
    private Description t = new Description("eats bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("finishing in Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = null;
        try {
            frog = new Frog();
            return;
        } finally {
            System.out.println("Bye!");
            frog.dispose();
        }
    }
}























