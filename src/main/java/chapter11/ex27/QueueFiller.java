package chapter11.ex27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by pyvov on 13.01.2017.
 */
public class QueueFiller {
    private Queue<Command> queue = new LinkedList<Command>();

    public void add(Command command) {
        queue.add(command);
    }

    public Queue<Command> getQueue() {
        return this.queue;
    }
}
