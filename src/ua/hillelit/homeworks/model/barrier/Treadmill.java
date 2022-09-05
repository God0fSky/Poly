package ua.hillelit.homeworks.model.barrier;

public class Treadmill extends Barrier {

    public Treadmill(String name) {
        super(name);
    }

    @Override
    public void overcome() {
        System.out.println("Беговая дорожка пройдена");
    }

}
