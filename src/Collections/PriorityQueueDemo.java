package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        //Min heap by default - smallest element has highest priority
        PriorityQueue<Integer> minheap= new PriorityQueue<>();

        minheap.add(30);
        minheap.add(10);
        minheap.add(20);

        System.out.println(minheap.poll());

        //Max heap
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        maxheap.add(-10);
        maxheap.add(40);
        maxheap.add(20);

        System.out.println(maxheap.poll());





    }
}
