package chapter12.exceptions;

/**
 * Created by pyvov on 14.01.2017.
 */
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}
    public void atBat() throws PopFoul {

    }

    public void rainHard() throws RainedOut {

    }

    @Override
    public void event() {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul ex) {
            System.err.println("Pop foul");
        } catch (RainedOut rainedOut) {
            System.err.println("Rained out");
        } catch (BaseballException e) {
            System.err.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.err.println("Strike");
        } catch (Foul e) {
            System.err.println("Foul");
        } catch (RainedOut rainedOut) {
            System.err.println("Rained out");
        } catch (BaseballException e) {
            System.err.println("Baseball exception");
        }
    }
}
