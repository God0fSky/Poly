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

        Human human = new Human("Human", 100, 2);
        Cat cat = new Cat("Cat", 150, 1);
        Robot robot = new Robot("Robot", 1000000000, 100000000);

        Treadmill treadmill1 = new Treadmill("Treadmill1", 90);
        Wall wall1 = new Wall("Wall1", 1);
        Treadmill treadmill2 = new Treadmill("Treadmill2", 140);
        Wall wall2 = new Wall("Wall2", 2);
        Treadmill treadmill3 = new Treadmill("Treadmill3", 500);
        Wall wall3 = new Wall("Wall3", 5);

        Participant[] participants = {human, cat, robot};
        Barrier[] barriers = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3};

        Participant.passage(participants, barriers);
    }


}
