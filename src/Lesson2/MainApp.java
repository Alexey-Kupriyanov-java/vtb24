package Lesson2;

import Lesson2.obstacle.Track;
import Lesson2.obstacle.Wall;
import Lesson2.participant.Cat;
import Lesson2.participant.Human;
import Lesson2.participant.Participant;
import Lesson2.participant.Robot;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Preparing..");
        Competition competition = createAndPreparingCompetition();

        System.out.println("Starting..");
        competition.startCompetition();

        System.out.println("End of competition. Winners: ");
        for (Participant participant :
                competition.getWinners()) {
            System.out.println(participant);
        }
    }

    private static Competition createAndPreparingCompetition() {
        Participant human = new Human("Alexey", 500, 50);
        Participant cat = new Cat("Barsik", 1500, 200);
        Participant robot = new Robot("R2D2", 5000, 150);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(300));
        Track track = new Track(random.nextInt(2000));

        Competition competition = new Competition("Olimpic games");
        competition.setParticipants(human, cat, robot);
        competition.setObstacles(wall, track);

        return competition;
    }
}
