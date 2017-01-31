package chapter11.ex27;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Command {
    private String str;

    public Command(String str) {
        this.str = str;
    }

    public void operation() {
        System.out.println(this.str);
    }
}
