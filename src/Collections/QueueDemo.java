package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(); //FIFO


        //insert
        queue.offer("Alok");
        queue.offer("Priya");
        queue.offer("Arjun");

        System.out.println(queue.poll()); //can be removed only from front

        Deque<String> deque = new ArrayDeque<>(); // Deque as queue

        deque.offer("Alok");
        deque.offer("Priya");

        System.out.println(deque.poll());
        Deque<String> stack = new ArrayDeque<>(); //Deque as stack

        stack.push("Vinod");
        stack.push("Arjun");

        System.out.println(stack.pop());

    }


}
