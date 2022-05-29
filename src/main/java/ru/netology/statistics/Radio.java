package ru.netology.statistics;

public class Radio {

    public int currentRadioStationNumber;
    public int soundVolume;

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        this.currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        int newNextRadioStationNumber = currentRadioStationNumber + 1;
        if (newNextRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        //this.currentRadioStationNumber = newNextRadioStationNumber;
        setCurrentRadioStationNumber (currentRadioStationNumber);
    }

    public void prevRadioStationNumber() {
        int newPrevRadioStationNumber = currentRadioStationNumber - 1;
        if (newPrevRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
        } else {
            newPrevRadioStationNumber = currentRadioStationNumber - 1;
        }
        //this.currentRadioStationNumber = newPrevRadioStationNumber;
        setCurrentRadioStationNumber (newPrevRadioStationNumber);
    }
}