package chapter9.ex18;

/**
 * Created by pyvov on 08.01.2017.
 */
interface Cycle {
    void ride();
}

class Unicycle implements Cycle {
    public void ride() {
        System.out.println("Unicycle.ride()");
    }
}

class Bicycle implements Cycle {
    public void ride() {
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle implements Cycle {
    public void ride() {
        System.out.println("Tricycle.ride()");
    }
}

interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Main {
    public static void cycleConsumer(CycleFactory f) {
        Cycle c = f.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        cycleConsumer(new TricycleFactory());
    }
}
