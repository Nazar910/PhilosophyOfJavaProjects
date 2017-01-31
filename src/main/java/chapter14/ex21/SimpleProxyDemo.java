package chapter14.ex21;

import java.util.logging.Logger;

/**
 * Created by pyvov on 23.01.2017.
 */
interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        System.out.println("doSomething");
    }

    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    private Logger log = Logger.getLogger(SimpleProxyDemo.class.getName());

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        log.severe("SimpleProxy doSomething");
        proxied.doSomething();
    }

    public void somethingElse(String arg) {
        log.severe("SimpleProxy somethingElse");
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
