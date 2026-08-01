package ProducerConsumer.Semaphores;

public class Producer implements Runnable{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store){
                if(store.getItems().size()< store.getMaxSize()){ // P3- 2, P4- 2
                    store.addItem(new Object());
                }
            }
        }
    }
}
