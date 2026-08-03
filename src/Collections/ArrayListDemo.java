package Collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();


        //Add elements
        students.add("Priya");
        students.add("Vinod");
        students.add("Rahul");
        students.add("Arjun");
        students.add("Priya"); // Duplicates are allowed

        //Indexed access - O(1)
        System.out.println(students.get(0));

        //size
        System.out.println(students.size());

        //remove by index
        students.remove(0); // Remove priya

        //Iterate
        for(String s: students){
            System.out.println(s);
        }

//        List<String> vector = new Vector<>();

        List<String> studentSync = Collections.synchronizedList(students);

        List<String> normalList = new ArrayList<>(studentSync);
    }
}

//best for random access, dynamic sizing, insert/delete at end