package DesignPatterns.Facade;

import DesignPatterns.Facade.subsystems.*;

public class Client {

    public static void main(String[] args) {

        //All the service and facade comes from Spring
        // ── Create subsystem services ──
        AnalyticsService analyticsService = new AnalyticsService();
        InventoryService inventoryService = new InventoryService();
        LogisticsService logisticsService = new LogisticsService();
        NotificationService notificationService = new NotificationService();
        PaymentService paymentService = new PaymentService();



        // ── Create Facade — hides all subsystem complexity ──
        OrderFacade orderFacade = new OrderFacade(paymentService, inventoryService, logisticsService, notificationService, analyticsService);


        // ── Create Controller — knows nothing about subsystems ──
        OrderController orderController = new OrderController(orderFacade);


        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 1: Facade Pattern");
        System.out.println("         (Place Order)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Place an order — 7 steps, ONE method call ──
        orderController.handlePlaceOrder("Macbook Pro", 200000, "vinod@gmail.com");


        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 2: Facade Pattern");
        System.out.println("         (Cancel Order)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Cancel an order — 5 reversal steps, ONE method call ──

        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  DEMO 3: Facade Reuse");
        System.out.println("         (Another Order from Different Entry Point)");
        System.out.println("════════════════════════════════════════");
        System.out.println();

        // ── Demonstrate reuse — any client can use the same Facade ──
        System.out.println("(Simulating a bulk order endpoint reusing the same Facade)");
        System.out.println();

        System.out.println();
        System.out.println("════════════════════════════════════════");
        System.out.println("  KEY TAKEAWAY");
        System.out.println("════════════════════════════════════════");
        System.out.println();
        System.out.println("OrderController has 1 dependency (OrderFacade)");
        System.out.println("  instead of 5 (Inventory, Payment, Notification, Logistics, Analytics).");
        System.out.println("The 7-step workflow lives in ONE place and is reusable.");
        System.out.println("Complexity isn't eliminated — it's organized.");

        /*
        Desktop

        1.turn on the cpu
        2.turn on the monitor
        3.Connect hardware // keyboard mouse
        4.Computer starts

        LAPTOP
        1.Turn on the power button

         */
    }
}
