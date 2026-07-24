package PrintNumberUsingThreads;

public class PrintNumber implements Runnable{
    int numToPrint;

    PrintNumber(int x){
        this.numToPrint = x;

    }

    @Override
    public void run() {
        System.out.println("Number = "+ this.numToPrint + "in thread : "+ Thread.currentThread().getName());
    }
}
