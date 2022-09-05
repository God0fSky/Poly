package ua.hillelit.homeworks.service;

import ua.hillelit.homeworks.model.barrier.Barrier;
import ua.hillelit.homeworks.model.barrier.Treadmill;
import ua.hillelit.homeworks.model.barrier.Wall;
import ua.hillelit.homeworks.model.participant.Cat;
import ua.hillelit.homeworks.model.participant.Human;
import ua.hillelit.homeworks.model.participant.Participant;
import ua.hillelit.homeworks.model.participant.Robot;

public class RouteCreator {
    public static void main(String[] args) {

        Human human = new Human("Human");
        Cat cat  = new Cat("Cat");
        Robot robot = new Robot("Robot");

        Treadmill treadmill1 = new Treadmill("Treadmill 1");
        Wall wall1 = new Wall("Wall 1");
        Treadmill treadmill2 = new Treadmill("Treadmill 2");
        Wall wall2 = new Wall("Wall 2");

        Participant[] participants = {human, cat, robot};
        Barrier[] barriers = {treadmill1, treadmill2, wall1, wall2};

        passage(participants, barriers);
    }

    private static void passage(Participant[] participants, Barrier[] barriers) {
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {

                if(barriers[j] instanceof Treadmill) {
                    participants[i].run();
                    barriers[j].overcome();

                } else {
                    participants[i].jump();
                    barriers[j].overcome();
                }

            }
        }
    }

}
