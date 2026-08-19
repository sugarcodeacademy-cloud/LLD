package Singleton;

import javax.xml.crypto.Data;

public class Database {
    private static volatile Database instance = null;
    //private static final Database instance = new Database(); db connection is created initially even if connection is not required
    private Database(){

    }
    //lazy initialisation
    public synchronized static Database createInstance(){
        if(instance == null){
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
