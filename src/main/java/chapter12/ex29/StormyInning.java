package chapter12.ex29;

/**
 * Created by pyvov on 14.01.2017.
 */
class BaseballException extends RuntimeException {}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

abstract class Inning {
    public Inning()  {}
    public void event()  {}
    public abstract void atBat() ;
    public void walk() {}
}

class StormException extends RuntimeException {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm {
    public void event();
    public void rainHard();
}

public class StormyInning extends Inning implements Storm {
    public StormyInning() {}
    public StormyInning(String s) {}
    public void atBat() {

    }

    public void rainHard()  {
        throw new Foul();
    }

    @Override
    public void event() {
    }

    public static void main(String[] args) {
            StormyInning si = new StormyInning();
            si.atBat();

            Inning i = new StormyInning();
            i.atBat();

    }
}
