package ua.hillelit.homeworks.model.barrier;

import ua.hillelit.homeworks.model.participant.Participant;

public abstract class Barrier {

    protected String name;

    public Barrier(String name) {
        this.name = name;
    }

    public abstract boolean overcome(Participant participant);

    public String getName() {
        return name;
    }


}
