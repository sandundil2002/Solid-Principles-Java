package LiskovSubstitution;

public class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Penguin can fly");
    }
}
