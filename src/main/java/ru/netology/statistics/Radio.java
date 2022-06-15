package ru.netology.statistics;

import jdk.jfr.DataAmount;


public class Radio {

    private int amountStation = 10;

    private int maxStation = 9;

    private int minStation = 0;

    private int currentStation;

    private int minVolume = 0;

    private int maxVolume = 100;

    private int currentVolume;

    public Radio(int amountStation, int minStation, int maxStation) {

        this.amountStation = amountStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public Radio() {

    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int amountStation) {
        this.amountStation = amountStation;
    }

    public void setNextStation() {
        int newCurrentStation = currentStation + 1;
        setCurrentStation (newCurrentStation);
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        this.currentStation = newCurrentStation;
    }

    public void setPrevStation() {
        int newCurrentStation = currentStation - 1;
        setCurrentStation (newCurrentStation);
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        this.currentStation = newCurrentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
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
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = currentVolume;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void setPrevVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume (newCurrentVolume);
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = currentVolume;
        }
        this.currentVolume = newCurrentVolume;
    }
}