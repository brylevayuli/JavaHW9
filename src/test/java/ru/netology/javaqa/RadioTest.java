package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetQuantityStations() {
        Radio rad = new Radio();

        rad.setQuantityStations();

        int expected = 10;
        int actual = rad.setQuantityStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(15);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.nextCurrentStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(3);
        rad.prevCurrentStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAbove_9() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationUnder_0() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);

        int expected = 15;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);
        rad.increaseVolume();

        int expected = 12;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);
        rad.reduceVolume();

        int expected = 11;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAbove_100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(112);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnder_0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
