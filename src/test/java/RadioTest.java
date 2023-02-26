import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void Test() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void nextTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void soundLevelTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.soundLevel();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void VolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
