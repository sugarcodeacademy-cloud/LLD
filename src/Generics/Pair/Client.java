package Generics.Pair;

public class Client {

    public static void main(String[] args) {

        //Pair<T, V>
        Pair<String,Integer> studentData = new Pair<>("Priya", 24);
        Pair<Integer, Integer> number = new Pair<>(24, 55);



//        String name = studentData.getFirst(); //typecastng --> Object is the return type
//        //we cannot store object in string

        String name = studentData.getFirst();

        System.out.println(name);

    }


}
