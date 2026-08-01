package ProducerConsumer.Semaphores;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10);

        //Hire  8 producers
        for(int i=0; i<8; i++){
            Producer producer = new Producer(store);
            new Thread(producer).start();
        }

        //Open door for 20 customers
        for(int i =0; i< 20; i++){
            Consumer consumer = new Consumer(store);
            new Thread(consumer).start();
        }
    }
}
