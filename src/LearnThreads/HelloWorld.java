package LearnThreads;

public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World Thread " + Thread.currentThread().getName());
    }
}
