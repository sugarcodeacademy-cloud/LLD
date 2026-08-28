package DesignPatterns.Factory.database.MongoDatabase;

import DesignPatterns.Factory.database.DatabaseFactory;
import DesignPatterns.Factory.database.Query;
import DesignPatterns.Factory.database.Transaction;

public class MongoDatabaseFactory implements DatabaseFactory {

    @Override
    public Query createQuery(String query) {
        return new MongoQuery(query);
    }

    @Override
    public Transaction createTransaction() {
        return new MongoTransaction();
    }
}
