package DesignPatterns.Adapter.yesbank;

import DesignPatterns.Adapter.BankAPI;

//Wall Socket is yes bank, laptop charger
public class YesBankAdapter implements BankAPI {
    private final YesBankAPI yesBankAPI;

    public YesBankAdapter(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }

    @Override
    public void addBankAccount(String accountNumber, String holderName) {
        yesBankAPI.yesRegister(accountNumber, holderName, "MAIN" );

    }

    @Override
    public void pay(double amount, String account) {
        yesBankAPI.yesPayment(amount, account, "NEFT");
    }

    @Override
    public void checkBalance(String account) {
        yesBankAPI.yesCheckBalance(account, "SAVINGS");
    }

    @Override
    public void transferFunds(String sourceAccount, String destinationAccount, double amount) {
        yesBankAPI.yesTransferInternal(sourceAccount, destinationAccount, amount, "IMPS");
    }
}
