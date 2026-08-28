package DesignPatterns.Factory.database.MySQL;

import DesignPatterns.Factory.database.Query;

public class MySQLQuery implements Query {
    private final String queryString;

    public MySQLQuery(String queryString) {
        this.queryString = queryString;
    }

    @Override
    public void execute() {
        System.out.println("[MySQL] Executing SQL query: " + queryString);
    }

    @Override
    public String getQueryString() {
        return queryString;
    }
}
