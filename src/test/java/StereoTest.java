import components.CDPlayer;
import components.Radio;
import components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;


    @Before
    public void before() {
        radio = new Radio("Sony","RD10928", 102.5);
        cdPlayer = new CDPlayer("Sony", "XD12345", 4);
        recordDeck = new RecordDeck("Sony","RP98278", 6);
        stereo = new Stereo("Sony SoundSystem", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canGetName() {
        assertEquals("Sony SoundSystem", stereo.getName());
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Station playing: Radio 1", stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canPlayRadio() {
        assertEquals("Now playing on: 102.5 frequency", stereo.playRadio());
    }

    @Test
    public void canPlayCDPlayer() {
        assertEquals("Now playing one of: 4 CDs", stereo.playCD());
    }

    @Test
    public void canPlayRecordDeck() {
        assertEquals("Now playing at: 6 play speed", stereo.playRecord());
    }
}
