package Lesson2.participant;

public class Robot implements Participant {
    private String model;
    private int maxRunLength;
    private int maxJumpHeight;

    public Robot(String model, int maxRunLength, int maxJumpHeight) {
        this.model = model;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run() {
        System.out.printf("Robot %s runs on distance %d%n", model, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Robot %s jumps on height %d%n", model, maxJumpHeight);
        return maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + model + '\'' +
                ", maxRunLength=" + maxRunLength +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}
