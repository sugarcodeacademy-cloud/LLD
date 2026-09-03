package DesignPatterns.Observer.Amazon;

public class AnalyticsService implements OrderPlaceSubscriber{

    public void recordSale(String item, double price) {
        System.out.println("[Analytics] Sale recorded: " + item + " for ₹" + price);
    }

    public void recordCancellation(String item, double price) {
        System.out.println("[Analytics] Cancellation recorded: " + item + " for ₹" + price);
    }

    @Override
    public void OrderPlaced(String orderId) {
        System.out.println("new order has been placed "+orderId + "AnalyticsService is called" );
    }
}
