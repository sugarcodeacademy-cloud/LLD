package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        for(int i=0; i< 10000; i++){
            NumberPrinter task = new NumberPrinter(i);
            ex.submit(task);
            if(i == 8000){
                System.out.println("Debug point");
            }
        }

    }
}
