package DesignPatterns.Factory.database.MongoDatabase;

import DesignPatterns.Factory.database.Database;
import DesignPatterns.Factory.database.DatabaseFactory;
import DesignPatterns.Factory.database.Query;

public class MongoDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("[Mongo] Connected to MongoDB cluster");
    }

    @Override
    public void changePoolSize(int size) {
        System.out.println("[Mongo] Connection pool resized to " + size);
    }

    @Override
    public String getVersion() {
        return "MongoDB 7.0";
    }

    @Override
//    public Query createQuery(String query){
//        return new MongoQuery(query);
//    }

    public DatabaseFactory createDatabaseFactory(){
        return new MongoDatabaseFactory();
    }
}