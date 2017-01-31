package chapter11.holding;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by pyvov on 13.01.2017.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Integer> list =
                new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(list);
        //equals
        System.out.println("list.getFirst(): " + list.getFirst());
        System.out.println("list.element(): " + list.element());
        //not equals only for empty list
        System.out.println("list.peek(): " + list.peek());
        //Equals; removing and returning first element
        System.out.println("list.remove(): " + list.remove());
        System.out.println("list.removeFirst(): " + list.removeFirst());
        //different when list is empty
        System.out.println("list.poll(): " + list.poll());
        System.out.println(list);
        list.addFirst(3);
        System.out.println("After addFirst(): " + list);
        list.offer(7);
        System.out.println("After offer(): " + list);
        list.add(8);
        System.out.println("After add(): " + list);
        list.addLast(9);
        System.out.println("After addLast(): " + list);
        System.out.println("list.removeLast(): " + list.removeLast());
    }
}
