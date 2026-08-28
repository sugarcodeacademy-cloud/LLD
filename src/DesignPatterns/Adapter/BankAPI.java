package DesignPatterns.Adapter;

//Indian Charger
public interface BankAPI {
    //Register a bank account
    void addBankAccount(String accountNumber, String holderName);

    //Make a payment
    void pay(double amount, String account);

    //Check Balance
    void checkBalance(String account);

    //Transfer funds from one account to another
    void transferFunds(String sourceAccount, String destinationAccount, double amount);
}
