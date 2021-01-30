package Lesson1.Animals;

public abstract class Animal {
    public static int count;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;

        count++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " ran distance " + distance + "m");
        } else {
            System.out.println(type + " " + name + " coudn't run distance " + distance + "m");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " can't swim");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " swam distance " + distance + "m");
        } else {
            System.out.println(type + " " + name + " couldn't swam distance " + distance + "m");
        }
    }
}
