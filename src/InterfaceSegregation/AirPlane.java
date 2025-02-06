package InterfaceSegregation;

public class AirPlane extends Vehicle implements FlayingVehicle{
    @Override
    public void startEngine() {
        System.out.println("AirPlane started");
    }

    @Override
    public void move() {
        System.out.println("AirPlane move");
    }

    @Override
    public void fly() {
        System.out.println("AirPlane fly");
    }
}
