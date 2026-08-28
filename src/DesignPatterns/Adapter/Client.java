package DesignPatterns.Adapter;

import DesignPatterns.Adapter.razorpay.RazorPayAdaptor;
import DesignPatterns.Adapter.razorpay.RazorpayAPI;
import DesignPatterns.Adapter.yesbank.YesBankAPI;
import DesignPatterns.Adapter.yesbank.YesBankAdapter;

public class Client {

    public static void main(String[] args) {

        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 1: Adapter Pattern");
        System.out.println("         (PhonePe + Yes Bank)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Using Yes Bank ──
        System.out.println("--- Yes Bank ---");
        YesBankAPI yesBankAPI = new YesBankAPI();
        YesBankAdapter yesBankAdapter = new YesBankAdapter(yesBankAPI);
        PhonePe phonePe = new PhonePe(yesBankAdapter);
        phonePe.makePayment(500, "ACC-001");


        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 2: Adapter Pattern");
        System.out.println("         (PhonePe + Razorpay)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Switch to Razorpay — ZERO changes to PhonePe! ──
        RazorpayAPI razorpayAPI = new RazorpayAPI();
        RazorPayAdaptor razorPayAdaptor = new RazorPayAdaptor(razorpayAPI);
        PhonePe phonePe1 = new PhonePe(razorPayAdaptor);
        phonePe1.makePayment(500, "ACC-002");


        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  KEY TAKEAWAY");
        System.out.println("════════════════════════════════════════");
        System.out.println();
        System.out.println("PhonePe class was IDENTICAL in both demos.");
        System.out.println("Only the adapter (and its adaptee) changed.");
        System.out.println("Adding a new bank = adding a new adapter.");
        System.out.println("Zero changes to PhonePe or BankAPI.");
    }
}