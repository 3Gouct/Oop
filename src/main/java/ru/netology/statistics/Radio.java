package ru.netology.statistics;

public class Radio {

    public int currentStation;
    public int nextStation;
    public int prevStation;
    public int maxStation;
    public int minStation;
    public int currentVolume;
    public int nextVolume;
    public int prevVolume;

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

    public void setNextStation(int newNextStation) {
        if (newNextStation < 9) {
            newNextStation = newNextStation + 1;
        } else {
            return;
        }
        this.nextStation = newNextStation;
    }


    public int getNextStation() {

        return nextStation;
    }

    public void setPrevStation(int newPrevStation) {
        if (newPrevStation > 0) {
            newPrevStation = newPrevStation - 1;
        } else {
            return;
        }
        this.prevStation = newPrevStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setMaxStation(int newMaxStation) {
        if (newMaxStation > 9) {
            newMaxStation = 0;
        } else {
            return;
        }
        this.maxStation = newMaxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMinStation(int newMinStation) {
        if (newMinStation < 0) {
            newMinStation = 9;
        } else {
            return;
        }
        this.minStation = newMinStation;
    }

    public int getMinStation() {
        return minStation;
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

    public void setNextVolume(int newNextVolume) {
        if (newNextVolume < 10) {
            newNextVolume = newNextVolume + 1;
        } else {
            newNextVolume = 10;
        }
        this.nextVolume = newNextVolume;
    }

    public int getNextVolume() {
        return nextVolume;
    }

    public void setPrevVolume(int newPrevVolume) {
        if (newPrevVolume > 0) {
            newPrevVolume = newPrevVolume - 1;
        } else {
            newPrevVolume = 0;
        }
        this.prevVolume = newPrevVolume;
    }

    public int getPrevVolume() {
        return prevVolume;
    }
}