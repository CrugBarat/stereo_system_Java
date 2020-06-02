import components.CDPlayer;
import components.Radio;
import components.RecordDeck;
import devices.Speakers;
import devices.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeakersTest {
    Speakers speakers;
    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;


    @Before
    public void before() {
        speakers = new Speakers("Sony", "SP192837");
        radio = new Radio("Sony","RD10928", 102.5);
        cdPlayer = new CDPlayer("Sony", "XD12345", 4);
        recordDeck = new RecordDeck("Sony","RP98278", 6);
        stereo = new Stereo("Sony SoundSystem", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", speakers.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("SP192837", speakers.getModel());
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Connected to: Sony SoundSystem",  speakers.connect(stereo));
    }

}
