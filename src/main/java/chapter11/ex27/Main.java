package chapter11.ex27;

import java.util.Queue;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        QueueFiller filler = new QueueFiller();
        filler.add(new Command("First"));
        filler.add(new Command("Second"));
        filler.add(new Command("Third"));
        printq(filler.getQueue());
    }

    public static void printq(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.remove().operation();
        }
    }
}
