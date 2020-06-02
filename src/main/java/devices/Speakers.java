package devices;

public class Speakers implements IConnect {
    private String make;
    private String model;

    public Speakers(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String connect(Stereo stereo) {
        return "Connected to: " + stereo.getName();
    }
}
