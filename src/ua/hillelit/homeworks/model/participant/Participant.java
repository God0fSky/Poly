package ua.hillelit.homeworks.model.participant;

import ua.hillelit.homeworks.model.barrier.Barrier;
import ua.hillelit.homeworks.model.barrier.Treadmill;
import ua.hillelit.homeworks.model.barrier.Wall;

public abstract class Participant {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public abstract void run();

    public abstract void jump();

    public static void passage(Participant[] participants, Barrier[] barriers) {
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {

                if (barriers[j] instanceof Treadmill) {
                    if (checkOfRunDistance(participants[i], barriers[j]) == false) break;
                } else {
                    if (checkOfJumpHeight(participants[i], barriers[j]) == false) break;
                }
            }
            System.out.println();
        }
    }

    private static boolean checkOfRunDistance(Participant participant, Barrier barrier) {
        participant.run();
        if (participant.getMaxRunDistance() >= ((Treadmill) barrier).getLength()) {
            barrier.overcome();
        } else {
            System.out.println(participant.getName() + " не прошел препятсвтие "
                    + barrier.getName());
            return false;
        }
        return true;
    }

    private static boolean checkOfJumpHeight(Participant participant, Barrier barrier) {
        participant.jump();
        if (participant.getMaxJumpHeight() >= ((Wall) barrier).getHeight()) {
            barrier.overcome();
        } else {
            System.out.println(participant.getName() + " не прошел препятсвтие "
                    + barrier.getName());
            return false;
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

}
