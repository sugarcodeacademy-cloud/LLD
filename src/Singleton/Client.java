package Singleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
//        Database db1 = new Database();
//        Database db2 = new Database();

//        Database db1 = Database.createInstance();
//        Database db2 = Database.createInstance();


        //TODO use callable and return created db object and check if it has same reference or not
        Runnable r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        System.out.println("check");
    }
}
