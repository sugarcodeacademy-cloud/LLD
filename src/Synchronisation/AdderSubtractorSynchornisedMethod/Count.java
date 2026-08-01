package Synchronisation.AdderSubtractorSynchornisedMethod;

public class Count {
    private long value = 0;

    public synchronized void incrementBy(int amount){
        this.value += amount;
    }

    public synchronized void decrementBy(int amount){
        this.value -= amount;
    }

    public  long getValue() {
        return this.value;
    }
}
