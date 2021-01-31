package Lesson2.obstacle;

import Lesson2.participant.Participant;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public boolean passObstacleBy(Participant participant) {
        if (height <= participant.jump()) {
            System.out.println("Participant " + participant + " jumped wall succesfully");
            return true;
        } else {
            System.out.println("Participant " + participant + " coudn't jump wall");
            return false;
        }
    }
}
