package chapter12.ex4;

/**
 * Created by pyvov on 14.01.2017.
 */
public class MyException extends Exception {
    private String message;
    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
