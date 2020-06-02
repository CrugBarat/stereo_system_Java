import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony","RD10928", 102.5);
    }

    @Test
    public void canGetFrequency() {
        assertEquals(102.5, radio.getFrequency(), 0.01);
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("RD10928", radio.getModel());
    }

    @Test
    public void canSetFrequency() {
        radio.setFrequency(106.1);
        assertEquals(106.1, radio.getFrequency(), 0.01);
    }

    @Test
    public void canTune() {
        assertEquals("components.Radio 1", radio.tune("components.Radio 1"));
    }

    @Test
    public void canPlay() {
        assertEquals("Now playing on: 102.5 frequency", radio.play());
    }
}
