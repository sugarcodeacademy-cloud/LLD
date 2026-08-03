package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        //Insert elements
        tasks.add("Task A");
        tasks.add("Task B");

        //Insertion at first
        tasks.addFirst("Urgent task");

        //Insert at last
        tasks.addLast("last task");

        //remove first
        String first = tasks.removeFirst();


    }
}

/*
* Internally implemented using a Doubly Linked List
* Best for : insert/delete from both ends
* */