package DependencyInversion;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Switch fanSwitch = new Switch(fan);

        fanSwitch.press();
        fanSwitch.press();

        Tv tv = new Tv();
        Switch tvSwitch = new Switch(tv);

        tvSwitch.press();
        tvSwitch.press();
    }
}
