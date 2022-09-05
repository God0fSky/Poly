package ua.hillelit.homeworks.model.participant;

public class Cat extends Participant {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " бежит...");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " прыгает...");
    }
}
