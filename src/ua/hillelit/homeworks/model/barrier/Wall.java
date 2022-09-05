package ua.hillelit.homeworks.model.barrier;

public class Wall extends Barrier {

    public Wall(String name) {
        super(name);
    }

    @Override
    public void overcome() {
        System.out.println("Стена преодолена");
    }
}
