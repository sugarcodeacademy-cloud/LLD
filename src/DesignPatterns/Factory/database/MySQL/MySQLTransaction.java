package DesignPatterns.Factory.database.MySQL;

import DesignPatterns.Factory.database.Transaction;

public class MySQLTransaction implements Transaction {

    @Override
    public void begin() {
        System.out.println("[MySQL] Starting session and transaction");
    }

    @Override
    public void commit() {
        System.out.println("[MySQL] Committing transaction");
    }

    @Override
    public void rollback() {
        System.out.println("[MySQL] Aborting transaction");
    }
}