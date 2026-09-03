package DesignPatterns.Observer.Amazon;

public interface OrderPublisher {
    public void register(OrderPlaceSubscriber subscriber);
    public void deregister(OrderPlaceSubscriber subscriber);
    public void handlePlaceOrder(String orderId);
}
