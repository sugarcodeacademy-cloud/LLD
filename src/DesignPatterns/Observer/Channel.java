package DesignPatterns.Observer;

public interface Channel {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifyUsers();
}
