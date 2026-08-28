package DesignPatterns.Adapter;

import DesignPatterns.Adapter.yesbank.YesBankAPI;

public class PhonePe {
//    private double amount;
//    private String customer;
//    private String account;
//    private String toAccount;
//
//    YesBankAPI yesBankAPI;
//
//    public PhonePe(YesBankAPI yesBankAPI) {
//        this.yesBankAPI = yesBankAPI;
//    }
//
//    void makePayment(){
//        yesBankAPI.yesPayment(amount, account, "NEFT");
//    }
//
//    void transferAmount(){
//        yesBankAPI.yesTransferInternal(account, toAccount, amount, "IMPS");
//    }
//
//    void checkBalance(){
//        yesBankAPI.yesCheckBalance(account, "SAVINGS");
//    }
    BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    void makePayment(double amount, String account){
        bankAPI.pay(amount, account);
    }

    void getBalance(String account){
        bankAPI.checkBalance(account);
    }

    void transfer(String from, String to, double amount){
        bankAPI.transferFunds(from, to, amount);
    }
}
