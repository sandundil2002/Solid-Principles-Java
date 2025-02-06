package DependencyInversion;

public class Fan implements Device {
    private boolean isOn = false;

    @Override
    public void toggle() {
        isOn = !isOn;

        if (isOn) {
            System.out.println("Fan is on");
        } else {
            System.out.println("Fan is off");
        }
    }
}