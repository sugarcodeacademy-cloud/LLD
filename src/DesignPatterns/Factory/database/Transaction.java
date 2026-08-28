package DesignPatterns.Factory.database;

public interface Transaction {
    void begin();
    void commit();
    void rollback();
}
