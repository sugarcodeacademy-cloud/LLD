package DesignPatterns.Factory.database.MySQL;

import DesignPatterns.Factory.database.Database;
import DesignPatterns.Factory.database.DatabaseFactory;
import DesignPatterns.Factory.database.MongoDatabase.MongoQuery;
import DesignPatterns.Factory.database.Query;

public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("[MySQL] Connected to MySQL database");
    }

    @Override
    public void changePoolSize(int size) {
        System.out.println("[MySQL] Pool size changed to " + size);
    }

    @Override
    public String getVersion() {
        return "MySQL 8.0";
    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySQLDatabaseFactory();
    }


    // This is in itself a factory method
//    @Override
//    public Query createQuery(String query){
//        return new MySQLQuery(query);
//    }



}