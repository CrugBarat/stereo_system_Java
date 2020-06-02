import components.CDPlayer;
import components.Radio;
import components.RecordDeck;
import devices.Headphones;
import devices.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadphonesTest {
    Headphones headphones;
    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;


    @Before
    public void before() {
        headphones = new Headphones("Apple", "Airpods");
        radio = new Radio("Sony","RD10928", 102.5);
        cdPlayer = new CDPlayer("Sony", "XD12345", 4);
        recordDeck = new RecordDeck("Sony","RP98278", 6);
        stereo = new Stereo("Sony SoundSystem", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", headphones.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Airpods", headphones.getModel());
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Connected to: Sony SoundSystem",  headphones.connect(stereo));
    }

}

