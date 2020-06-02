package components;

public class RecordDeck implements IPlay {

    int playSpeed;

    public RecordDeck(int playSpeed) {
        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return this.playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }

    public String play() {
        return "Now playing at: " + this.playSpeed + " play speed";
    }
}
