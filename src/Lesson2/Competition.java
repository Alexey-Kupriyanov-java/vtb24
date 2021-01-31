package Lesson2;

import Lesson2.obstacle.Obstacle;
import Lesson2.participant.Participant;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private Obstacle[] obstacles;
    private Participant[] participants;
    String competitionTitle;

    private List<Participant> winners = new ArrayList<>();

    public List<Participant> getWinners() {
        return winners;
    }

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        System.out.println("Beginning of the competition " + competitionTitle);
        winners.clear();

        for (Participant participant:
             participants) {
            boolean success = passAllObstacle(participant);
            if (!success) {
                System.out.println("Participant " + participant + " left competition");
            } else {
                winners.add(participant);
            }
        }
    }

    private boolean passAllObstacle(Participant participant) {
        for (Obstacle obstacle:
             obstacles) {
            if (!obstacle.passObstacleBy(participant)) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
