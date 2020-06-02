package components;

public class Radio extends Component implements IPlay {

    private double frequency;

    public Radio(String make, String model,double frequency) {
        super(make, model);
        this.frequency = frequency;
    }

    public double getFrequency() {
        return this.frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String tune(String station){
        return station;
    }

    public String play() {
        return "Now playing on: " + this.frequency + " frequency";
    }
}
