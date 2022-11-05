package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetStationsQuantityTo10() {

        radio.setStationsQuantity(9);

        int expected = 10;
        int actual = radio.getStationsQuantity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsQuantityTo11() {

        radio.setStationsQuantity(11);

        int expected = 11;
        int actual = radio.getStationsQuantity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationQuantityTo10() {

        radio.setStationsQuantity(9);

        int expected = 10;
        int actual = radio.getStationsQuantity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationTo9() {

        radio.setCurrentStation(15);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationTo0() {

        radio.setCurrentStation(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolumeTo100() {

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeTo0() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {

        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationTo0() {

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPreviousStationTo9() {

        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStation() {

        radio.setCurrentStation(1);

        radio.previousStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLeaveIncreaseVolumeOn100() {

        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {

        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLeaveDecreaseVolumeOn0() {

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVoluntaryStationsQuantity() {

        radio.setStationsQuantity(50);

        int expected = 50;
        int actual = radio.getStationsQuantity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMyStationAmongVoluntaryStationsQuantity() {

        radio.setStationsQuantity(50);
        radio.setCurrentStation(33);

        int expected = 33;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationTo0IfStations50() {

        radio.setStationsQuantity(50);
        radio.setCurrentStation(49);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberStation() {

        radio.setStationsQuantity(50);
        radio.setCurrentStation(51);

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevousStationtoStationsQuantity() {

        radio.setStationsQuantity(50);
        radio.setCurrentStation(0);
        radio.previousStation();

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
