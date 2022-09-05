package ua.hillelit.homeworks.model.participant;

public class Robot extends Participant {

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " бежит...");
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " прыгает...");
    }
}
