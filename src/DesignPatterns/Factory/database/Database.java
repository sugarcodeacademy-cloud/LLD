package DesignPatterns.Factory.database;

import DesignPatterns.Factory.database.MongoDatabase.MongoQuery;

public interface Database {
    //connect to the database
    void connect();

    //Change the connection pool size
    void changePoolSize(int size);

    //Get the database version
    String getVersion();



//    Query createQuery(String sql); //single factory method

    DatabaseFactory createDatabaseFactory();


}
