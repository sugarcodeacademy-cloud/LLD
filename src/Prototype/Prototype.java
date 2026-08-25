package Prototype;

//Any class that wants to create a copy/clones must implement this interface
public interface Prototype<T> {
    T cloneObject();
}

