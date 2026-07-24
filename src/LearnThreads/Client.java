package LearnThreads;

public class Client {
    static void doSomething(){
        System.out.println("Do something Thread " + Thread.currentThread().getName()) ;
    }
    public static void main(String[] args) {

        Runnable h = new HelloWorld();
        Thread t = new Thread(h);
        t.start();
        doSomething();
        System.out.println("current thread: " + Thread.currentThread().getName());
    }
}
