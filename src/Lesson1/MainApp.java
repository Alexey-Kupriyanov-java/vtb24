package Lesson1;

import Lesson1.Animals.*;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Bobik", 600, 500),
                new HouseCat("Barsik", 200),
                new Tiger("Sher-Khan", 600, 600)
        };

        for (Animal animal: animals) {
            animal.run(400);
            animal.swim(550);
        }

        System.out.println("Animals count: " + Animal.count);
        System.out.println("Dogs count: " + Dog.count);
        System.out.println("Cats count: " + Cat.count);
        System.out.println("House cats count: " + HouseCat.count);
        System.out.println("Tigers count: " + Tiger.count);
    }

}
