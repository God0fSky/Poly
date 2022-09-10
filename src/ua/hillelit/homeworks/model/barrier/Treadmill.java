package ua.hillelit.homeworks.model.barrier;

import ua.hillelit.homeworks.model.participant.Participant;

public class Treadmill extends Barrier {

    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (participant.getMaxRunDistance() >= length) {
            System.out.println("Беговая дорожка " + name + " пройдена");
            return true;
        } else {
            System.out.println(participant.getName() + " не прошел препятсвтие "
                    + name);
            return false;
        }
    }


    public int getLength() {
        return length;
    }


}
