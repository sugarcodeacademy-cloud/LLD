package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private Queue<Object> items;

    public Store() {
        this.items = new ConcurrentLinkedDeque<>();
    }


    public Queue<Object> getItems() {
        return items;
    }

    public void addItem(int id){
        items.add(new Object());
        System.out.println("Producer added item. Current size" + items.size() + "By Producer:  " + id);
    }

    public void removeItem(int id){
        items.remove(items.size()-1);
        System.out.println("Consumer removed item. Current size" + items.size() + "By Consumer: " + id);
    }
}
