package chapter12.ex19;

/**
 * Created by pyvov on 14.01.2017.
 */
class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "Very important exception!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "Ho hum exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException e) {
                    System.err.println(e);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
