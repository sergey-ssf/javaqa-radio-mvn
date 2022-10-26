package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}