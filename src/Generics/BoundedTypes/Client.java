package Generics.BoundedTypes;

import Generics.BoundedTypes.Utility;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();


        Animal animal = new Animal();
//        animal.feedAnimals(dogs); List of dogs is not list of animals because we can add a cat in list of animals


        Utility utility = new Utility();
        utility.feedAnimals(dogs);

        utility.addDogs(animals);

    }
}
