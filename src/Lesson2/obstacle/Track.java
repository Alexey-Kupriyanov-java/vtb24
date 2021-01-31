package Lesson2.obstacle;

import Lesson2.participant.Participant;

public class Track implements Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }


    @Override
    public boolean passObstacleBy(Participant participant) {
        if (length <= participant.run()) {
            System.out.println("Participant " + participant + " ran distance succesfully");
            return true;
        } else {
            System.out.println("Participant " + participant + " coudn't run track");
            return false;
        }
    }
}
