package ua.hillelit.homeworks.model.barrier;

import ua.hillelit.homeworks.model.participant.Participant;

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        if (participant.getMaxJumpHeight() >= height) {
            System.out.println("Стена " + name + " Преодолена");
            return true;
        } else {
            System.out.println(participant.getName() + " не прошел препятсвтие "
                    + name);
            return false;
        }
    }


    public int getHeight() {
        return height;
    }

}
