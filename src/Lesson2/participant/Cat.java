package Lesson2.participant;

public class Cat implements Participant {
    private String name;
    private int maxRunLength;
    private int maxJumpHeight;

    public Cat(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run() {
        System.out.printf("Cat %s runs on distance %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Cat %s jumps on height %d%n", name, maxJumpHeight);
        return maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxRunLength=" + maxRunLength +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}
