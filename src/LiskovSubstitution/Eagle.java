package LiskovSubstitution;

public class Eagle extends Bird implements FlyingBird{
    @Override
    public void eat() {
        System.out.println("Eagle can eat");
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
