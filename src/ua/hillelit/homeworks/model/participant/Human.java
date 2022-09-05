package ua.hillelit.homeworks.model.participant;

public class Human extends Participant {

    public Human(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " бежит...");
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгает...");
    }


}
