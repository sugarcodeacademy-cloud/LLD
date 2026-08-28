package DesignPatterns.Factory.database;

public interface DatabaseFactory {
    //create a query object for the database
    Query createQuery(String sql);

    //create a transaction object for the database
    Transaction createTransaction();
}
