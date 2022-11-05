package ru.netology.radio;

public class Radio {
    private int stationsQuantity = 10;
    private int currentStation;
    private int currentVolume;

    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public Radio() {
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public void setStationsQuantity(int newStationsQuantity) {
        if (newStationsQuantity > 10) {
            stationsQuantity = newStationsQuantity;
        }
        return;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= stationsQuantity) {
            newCurrentStation = stationsQuantity - 1;
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
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == stationsQuantity - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = stationsQuantity - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}