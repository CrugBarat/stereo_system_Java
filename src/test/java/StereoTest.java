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
}
