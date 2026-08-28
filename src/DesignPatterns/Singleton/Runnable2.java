package DesignPatterns.Singleton;

public class Runnable2 implements Runnable{
    @Override
    public void run() {
        Database db = Database.createInstance();
    }
}
