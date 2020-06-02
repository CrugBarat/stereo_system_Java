import components.CDPlayer;
import components.Radio;
import components.RecordDeck;
import devices.MP3Player;
import devices.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {
    MP3Player mp3Player;
    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;


    @Before
    public void before() {
        mp3Player = new MP3Player("Apple", "IPod");
        radio = new Radio("Sony","RD10928", 102.5);
        cdPlayer = new CDPlayer("Sony", "XD12345", 4);
        recordDeck = new RecordDeck("Sony","RP98278", 6);
        stereo = new Stereo("Sony SoundSystem", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", mp3Player.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("IPod", mp3Player.getModel());
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Connected to: Sony SoundSystem",  mp3Player.connect(stereo));
    }

}
