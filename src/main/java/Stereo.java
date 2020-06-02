import components.CDPlayer;
import components.Radio;
import components.RecordDeck;

public class Stereo {

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;
    private int volume;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck) {
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.volume = 0;
    }

    public String getName() {
        return this.name;
    }

    public String tuneRadio(String station) {
        return "Station playing: " +  radio.tune(station);
    }

    public String playRadio() {
        return radio.play();
    }

    public String playCD() {
        return cdPlayer.play();
    }

    public String playRecord() {
        return recordDeck.play();
    }

}
