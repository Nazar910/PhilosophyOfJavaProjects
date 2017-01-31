package chapter12.ex18;

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

class ThirdPartyException extends Exception {
    @Override
    public String toString() {
        return "third party exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void g() throws ThirdPartyException {
        throw new ThirdPartyException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {

                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.g();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
