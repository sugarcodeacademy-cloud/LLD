package DesignPatterns.Factory.database;

import DesignPatterns.Factory.database.MongoDatabase.MongoDatabase;

public class UserService {
    private final Database db;
    private final DatabaseFactory dbf;

    public UserService(Database db){
        this.db = db;
        this.dbf = db.createDatabaseFactory();
    }

    public void createUser(String name, String email){
        Query q = dbf.createQuery("INSERT INTO users VALUES ('" + name + "', '" + email + "')");
        q.execute();

        System.out.println("User created: " + name);
    }

    public void updateUserEmail(String name, String newEmail) {
        Transaction txn = dbf.createTransaction();
        txn.begin();

        Query q = dbf.createQuery("UPDATE users SET email = '" + newEmail + "' WHERE name='" + name + "'");
        q.execute();
        txn.commit();

        System.out.println("User updated: " + name + " -> " + newEmail);
    }
}
