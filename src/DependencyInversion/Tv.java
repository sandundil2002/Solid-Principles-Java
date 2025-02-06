package DependencyInversion;

public class Tv implements Device {
    private boolean isTvOn = false;

    @Override
    public void toggle() {
        isTvOn = !isTvOn;

        if (isTvOn) {
            System.out.println("Tv is on");
        } else {
            System.out.println("Tv is off");
        }
    }
}
