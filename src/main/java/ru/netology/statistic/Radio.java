package ru.netology.statistic;

public class Radio {
    private int numberOfStation;
    private int volume;

    public void setNumberOfStation(int newNumberOfStation) {
        if (newNumberOfStation > 9) {
            return;
        }
        if (newNumberOfStation < 0) {
            return;
        }
        numberOfStation = newNumberOfStation;
    }

    public int getCurrentNumberOfStation() {
        return numberOfStation;
    }

    public void setNextStation() {
        int currentNumber = getCurrentNumberOfStation();
        if (currentNumber == 9) {
            setNumberOfStation(0);
        } else {
            setNumberOfStation(currentNumber + 1);
        }

    }

    public void setPrevStation() {
        int currentNumber = getCurrentNumberOfStation();
        if (currentNumber == 0) {
            setNumberOfStation(9);
        } else {
            setNumberOfStation(currentNumber - 1);
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
