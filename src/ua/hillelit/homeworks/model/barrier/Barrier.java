package ua.hillelit.homeworks.model.barrier;

public abstract class Barrier {

    protected String name;

    public Barrier(String name) {
        this.name = name;
    }

    public abstract void overcome();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
