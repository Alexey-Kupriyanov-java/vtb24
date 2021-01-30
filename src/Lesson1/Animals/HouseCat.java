package Lesson1.Animals;

public class HouseCat extends Cat {
    public static int count;

    public HouseCat(String name, int maxRunDistance) {
        super("house cat", name, maxRunDistance, 0);
        count++;
    }
}
