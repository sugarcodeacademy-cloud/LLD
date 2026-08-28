package DesignPatterns.Factory.database;

import DesignPatterns.Factory.database.MongoDatabase.MongoDatabase;
import DesignPatterns.Factory.database.MongoDatabase.MongoDatabaseFactory;
import DesignPatterns.Factory.database.MySQL.MySQLDatabase;

public class Client {
    public static void main(String[] args) {
//        //using MYSQL
//        Database mySqlDb = new MySQLDatabase();
//        //I will connect to my SQLServer
//        DatabaseFactory mongoDbFactory = new MongoDatabaseFactory();
//        //create a mongo query and mongo transaction
//        mySqlDb.connect(); //mySQL server is connected
//        UserService mysqlService = new UserService(mySqlDb, mongoDbFactory);
//        mysqlService.createUser("Vinod", "vinod@sugarcode.com"); //creates a mongoQuery and mongoTransaction

        //using MYSQL
        Database mySqlDb = new MySQLDatabase();
        //Create a mysql database and database factory
        mySqlDb.connect(); //mySQL server is connected
        UserService mysqlService = new UserService(mySqlDb);
        mysqlService.createUser("Vinod", "vinod@sugarcode.com"); //creates a mysqlQuery and mysqlTransaction

        //Switch to Mongo
        Database mongoDb = new MongoDatabase();
        mongoDb.connect();
        UserService mongoService = new UserService(mongoDb);
        mongoService.createUser("Priya", "priya@sugarcode.com");
    }
}
