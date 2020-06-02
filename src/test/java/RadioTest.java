import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio(102.5);
    }

    @Test
    public void canGetFrequency() {
        assertEquals(102.5, radio.getFrequency(), 0.01);
    }

    @Test
    public void canSetFrequency() {
        radio.setFrequency(106.1);
        assertEquals(106.1, radio.getFrequency(), 0.01);
    }

    @Test
    public void canTune() {
        assertEquals("Radio 1", radio.tune("Radio 1"));
    }
}
