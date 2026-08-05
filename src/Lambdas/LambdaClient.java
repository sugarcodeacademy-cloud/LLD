package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class LambdaClient {
    public static void main(String[] args) {
//            Thread t = new Thread(){
//                @Override
//                public void run() {
//                    System.out.println("Hello World");
//                    walk();
//                }
//                public void walk(){
//                    System.out.println("Walking...");
//                }
//            };

//            Runnable task = new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("Hello World Priya");
//                }
//            };
//            Thread t = new Thread(task);
//            t.start();

//            Runnable priya = new HelloWorldName("Priya");
//            Runnable vinod = new HelloWorldName("Vinod");
//
//            Thread t = new Thread(priya);
//            Thread t2 = new Thread(vinod);
//            t.start();
//            t2.start();
//            //Callable

           Runnable task = () -> {
                System.out.println("Hello  World Baby Boss");
                System.out.println("Welcome to Lambdas");
            };

           Thread t = new Thread(task);
           t.start();
            //() -> the parameters of the method run()
            //-> tha lambda arrow , reads as "goes to"
            //{ body } --> the implementation

        //1.No params
        Runnable r = () -> {
            System.out.println("Hello");
        };

        //2.Return
        Callable<Integer> c = () -> {
            System.out.println("Callable");
            return 1;
        };

        //3.parameters with multi line
        Comparator<Integer> comp = (a,b) -> {
            if(a>b) return 1;
            else if(a<b) return -1;
            return 0;
        };

        //4.parameters with single line
        Comparator<Integer>  comp2 = (a,b) -> a-b; //{} and return are not required

        //single expression body
        Comparator<Integer> comp3 = Integer::compare; // TODO

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(45);
        list.add(5);
        list.add(67);
        list.add(6);

        //even first, then descending each group  12, 6, 67, 45, 13, 5
//        Collections.sort(list, (a,b) -> {
//            if(a%2 == b%2) return b-a;
//            else if(a % 2 == 0) return -1;
//            else return 1;
//        });

//        Collections.sort(list, comp);
        //+ve --> swap
        //-ve -> no swap

        Collections.sort(list, new LIstComparator());

        System.out.println(list);
        //TODO implement bubble sort for a list
    }
}


