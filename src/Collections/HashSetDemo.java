package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Priya");
        names.add("Dhruv");
        names.add("Priya"); //Duplicate - silently ignored

        System.out.println(names.size()); // 2, not 3;

        //Fast lookup - O(1)
        System.out.println(names.contains("Dhruv")); //true


        //45, 67, 34, 24, 87, 25

        //5, 7, ,4, 4, 7, 5

        //45, 25 --> inside 5 bucket
        //34, 24 --> inside 4 bucket
        //87, 67 --> inside 7 bucket

        //search for 67 --> 7 -->

        //Best for: add/searching --> O(1) , no duplicates


    }
}
