package DesignPatterns.Singleton;

public class Database {
    private static Database instance = null;
    //private static final Database instance = new Database(); db connection is created initially even if connection is not required
    private Database(){

    }
    //lazy initialisation
    public synchronized static Database createInstance(){
//        if(instance == null){
//            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
//            }
//        }
        System.out.println("Instance has been created : " + instance);
        return instance;
    }
    public static void resetInstance(){
        instance = null;
    }
}
