package DesignPatterns.Factory.database.MongoDatabase;

import DesignPatterns.Factory.database.Query;

public class MongoQuery implements Query {
    private final String queryString;

    public MongoQuery(String queryString) {
        this.queryString = queryString;
    }

    @Override
    public void execute() {
        System.out.println("[Mongo] Executing SQL query: " + queryString);
    }

    @Override
    public String getQueryString() {
        return queryString;
    }
}