package chapter11.ex28;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by pyvov on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(rand.nextDouble());
        }
        System.out.println(priorityQueue);
        while (priorityQueue.peek() != null) {
            System.out.print(priorityQueue.poll()+ " ");
        }
        System.out.println();
    }
}
