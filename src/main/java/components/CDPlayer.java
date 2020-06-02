package components;

public class CDPlayer implements IPlay {

    int numberOfCDs;

    public CDPlayer(int numberOfCDs) {
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return this.numberOfCDs;
    }

    public void setNumberOfCDs(int numberOfCDs) {
        this.numberOfCDs = numberOfCDs;
    }

    public String play() {
        return "Now playing one of: " + this.numberOfCDs + " CDs";
    }
}
