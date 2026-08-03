package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();

        //insert
        studentScore.put("Rahul", 89);
        studentScore.put("Priya", 92);
        studentScore.put("xyz", 34);
        studentScore.put("xyz", 21);

        //get by key - O(1)
        System.out.println(studentScore.get("Priya"));//92

        //check if the key exists
        System.out.println(studentScore.containsKey("Priya"));

        //Overwite exisiting key
        studentScore.put("Rahul", 92); //updates to 92

        //Iterate over entries
        for(Map.Entry<String, Integer> entry: studentScore.entrySet()){
            System.out.println(entry.getKey()+" --> "+ entry.getValue());
        }

        System.out.println(studentScore.keySet()); //returns all the keys in the array
        System.out.println(studentScore.values()); //returns all the value in the array

    }
}
