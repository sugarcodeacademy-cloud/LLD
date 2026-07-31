package Generics.BoundedTypes;

import java.util.List;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
    //This only accepts List<Animal>, List<Dogs> List<Cat>
    public void feedAnimals(List<Animal> animals){
        for (Animal a : animals){
            a.eat();
        }
    }

}
