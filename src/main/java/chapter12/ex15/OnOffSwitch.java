package chapter12.ex15;

/**
 * Created by pyvov on 14.01.2017.
 */
class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            throw new RuntimeException();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
        } finally {
            sw.off();
        }
    }
}

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}
