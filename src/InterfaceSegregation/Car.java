package InterfaceSegregation;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car is stared");
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }
}