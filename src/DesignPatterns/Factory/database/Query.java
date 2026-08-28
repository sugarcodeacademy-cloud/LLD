package DesignPatterns.Factory.database;

public interface Query {

    void execute();

    String getQueryString();
}
