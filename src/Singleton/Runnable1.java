package Singleton;

public class Runnable1 implements Runnable{
    @Override
    public void run() {
        Database db = Database.createInstance();
    }
}
