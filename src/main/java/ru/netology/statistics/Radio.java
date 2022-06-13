package ru.netology.statistics;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;

    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setNextStation() {
        int newCurrentStation = currentStation + 1;
        setCurrentStation (newCurrentStation);
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        this.currentStation = newCurrentStation;
    }

    public void setPrevStation() {
        int newCurrentStation = currentStation - 1;
        setCurrentStation (newCurrentStation);
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        this.currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume (newCurrentVolume);
        if (newCurrentVolume > 10) {
            newCurrentVolume = currentVolume;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void setPrevVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume (newCurrentVolume);
        if (newCurrentVolume < 0) {
            newCurrentVolume = currentVolume;
        }
        this.currentVolume = newCurrentVolume;
    }
}