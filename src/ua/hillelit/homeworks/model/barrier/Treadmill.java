package ua.hillelit.homeworks.model.barrier;

public class Treadmill extends Barrier {

    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public void overcome() {
        System.out.println("Беговая дорожка " + name + " пройдена");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
