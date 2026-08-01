package Executors;

public class NumberPrinter implements Runnable{
    int numToPrint;
    NumberPrinter(int x){
        this.numToPrint = x;
    }

    @Override
    public void run() {
        System.out.println("Printing "+ this.numToPrint+ " in thread "+ Thread.currentThread().getName());
    }
}
