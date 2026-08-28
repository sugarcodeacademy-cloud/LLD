package DesignPatterns.Facade;

import DesignPatterns.Facade.subsystems.*;

public class OrderController {
//    private final PaymentService paymentService;
//    private final InventoryService inventoryService;
//    private final LogisticsService logisticsService;
//    private final NotificationService notificationService;
//    private final AnalyticsService analyticsService;

//    public OrderController(PaymentService paymentService, InventoryService inventoryService, LogisticsService logisticsService, NotificationService notificationService, AnalyticsService analyticsService) {
//        this.paymentService = paymentService;
//        this.inventoryService = inventoryService;
//        this.logisticsService = logisticsService;
//        this.notificationService = notificationService;
//        this.analyticsService = analyticsService;
//    }

//    public boolean placeOrder(String item, double price, String customer){
//        System.out.println("╔══════════════════════════════════╗");
//        System.out.println("║     Processing Order...          ║");
//        System.out.println("╚══════════════════════════════════╝");
//
//        //Step1: Check inventory
//        if(!inventoryService.checkStock(item)){
//            System.out.println(" order failed: Item out of stock");
//            return false;
//        }
//
//        //Step2: Process Payment
//        if(!paymentService.processPayment(customer, price)){
//            System.out.println("order failed: Payment declined");
//            return false;
//        }
//
//        //Step 3: Update inventory
//        inventoryService.reduceStock(item, 1);
//
//        //step 4: notify seller
//        notificationService.notifySeller(item, customer);
//
//        //Step 5: Schedule delivery
//        logisticsService.scheduleDelivery(item, customer);
//
//        //Step 6: Send confirmation to user
//        notificationService.sendConfirmation(customer, item);
//
//        //Step 7: Record analytics
//        analyticsService.recordSale(item, price);
//
//        System.out.println("Order placed successfully");
//        return true;
//
//    }
    //public boolean smallOrder(){}

    //public boolean bulOrder(){}

    private final OrderFacade orderFacade;

    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    void handlePlaceOrder(String item, double price, String customer){
        boolean success = orderFacade.placeOrder(item, price, customer);
        if(success){
            System.out.println("Returning HTTP 200 to client");
        }
        else{
            System.out.println("Returning HTTP 400 Bad request to the client");
        }
    }

    //Facade -- front face of the building

    //steps:
    //1.The facade class
    //2.The subsystem services
}
