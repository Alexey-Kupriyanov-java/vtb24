package Lesson2.participant;

public class Human implements Participant {
    private String name;
    private int maxRunLength;
    private int maxJumpHeight;

    public Human(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run() {
        System.out.printf("Human %s runs on distance %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Human %s jumps on height %d%n", name, maxJumpHeight);
        return maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", maxRunLength=" + maxRunLength +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}
