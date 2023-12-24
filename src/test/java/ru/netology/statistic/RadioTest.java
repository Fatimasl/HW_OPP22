package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "8, 8",
            "9, 9",
            "10, 0"
    })
    public void shouldSetNumberOfStation(int newNumber, int expected) {
        Radio radio = new Radio();

        radio.setNumberOfStation(newNumber);

        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "8, 9",
            "9, 0"
    })
    public void shouldSetNextNumberOfStation(int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setNumberOfStation(currentNumber);

        radio.setNextStation();

        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9, 8",
            "8, 7",
            "1, 0",
            "0, 9"
    })
    public void shouldSetPrevNumberOfStation(int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setNumberOfStation(currentNumber);

        radio.setPrevStation();

        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "99, 99",
            "100, 100",
            "101, 0"
    })
    public void shouldSetVolume(int newVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(newVolume);

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "99, 100",
            "100, 100"
    })
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);

        radio.increaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 99",
            "99, 98",
            "1, 0",
            "0, 0"
    })
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);

        radio.decreaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}


