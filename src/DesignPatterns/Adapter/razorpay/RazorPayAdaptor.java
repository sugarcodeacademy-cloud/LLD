package DesignPatterns.Adapter.razorpay;

import DesignPatterns.Adapter.BankAPI;

public class RazorPayAdaptor implements BankAPI {
    private RazorpayAPI razorpayAPI;

    public RazorPayAdaptor(RazorpayAPI razorpayAPI) {
        this.razorpayAPI = razorpayAPI;
    }


    @Override
    public void addBankAccount(String accountNumber, String holderName) {

    }

    @Override
    public void pay(double amount, String account) {

    }

    @Override
    public void checkBalance(String account) {

    }

    @Override
    public void transferFunds(String sourceAccount, String destinationAccount, double amount) {

    }
}
