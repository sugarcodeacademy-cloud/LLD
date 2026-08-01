package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private int id;

    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore, int id) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.id = id;
    }
    //P = 10, C= 0
    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire(); //Wait for an empty slot
                store.addItem(id);
                consumerSemaphore.release();// P = 9, C= 1
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
