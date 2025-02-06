package DependencyInversion;

public class Switch {
    private Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void press(){
        device.toggle();
    }
}
