package DesignPatterns.Factory.database.MySQL;

import DesignPatterns.Factory.database.DatabaseFactory;
import DesignPatterns.Factory.database.Query;
import DesignPatterns.Factory.database.Transaction;

public class MySQLDatabaseFactory implements DatabaseFactory {

    @Override
    public Query createQuery(String query) {
        return new MySQLQuery(query);
    }

    @Override
    public Transaction createTransaction() {
        return new MySQLTransaction();
    }
}