package ua.hillelit.homeworks.model.barrier;

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public void overcome() {
        System.out.println("Стена " + name + " преодолена");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
