package chapter12.ex28;

/**
 * Created by pyvov on 14.01.2017.
 */
public class MyException extends RuntimeException {
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
