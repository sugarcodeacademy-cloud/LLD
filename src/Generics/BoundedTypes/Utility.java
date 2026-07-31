package Generics.BoundedTypes;

import java.util.List;

public class Utility {
    void eat(){
        System.out.println("Eating");
    }
    //? extends T -> (Upper Bound WildCard)
    //This accepts any child class of Animal and Animal
    public void feedAnimals(List<? extends Animal> animals){
        for (Animal a : animals){
            a.eat();
        }
    }

    //? super T -> (Lower Bound WildCard)
    //This accepts any parent class of Dog
    public void addDogs(List<? super Dog> list){
        list.add(new Dog());
    }
}
