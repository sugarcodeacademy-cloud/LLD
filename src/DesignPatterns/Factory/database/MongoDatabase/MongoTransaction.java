package DesignPatterns.Factory.database.MongoDatabase;

import DesignPatterns.Factory.database.Transaction;

public class MongoTransaction implements Transaction {

    @Override
    public void begin() {
        System.out.println("[Mongo] Starting session and transaction");
    }

    @Override
    public void commit() {
        System.out.println("[Mongo] Committing transaction");
    }

    @Override
    public void rollback() {
        System.out.println("[Mongo] Aborting transaction");
    }


}
