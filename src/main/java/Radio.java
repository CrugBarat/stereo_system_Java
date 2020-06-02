public class Radio implements IPlay {

    double frequency;

    public Radio(double frequency) {
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

    public void play() {

    }
}
