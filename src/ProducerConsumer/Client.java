package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        Semaphore producerSemaphore = new Semaphore(10);
        Semaphore consumerSemaphore = new Semaphore(0);

        //Hire  8 producers
        for(int i=0; i<8; i++){
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore, i);
            new Thread(producer , "Producer- "+ i).start();
        }

        //Open door for 20 customers
        for(int i =0; i< 20; i++){
            Consumer consumer = new Consumer(store, consumerSemaphore, producerSemaphore, i);
            new Thread(consumer, "Consumer - "+ i).start();
        }
    }
}
