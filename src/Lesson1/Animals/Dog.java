package Lesson1.Animals;

public class Dog extends Animal {
    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super("dog", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
