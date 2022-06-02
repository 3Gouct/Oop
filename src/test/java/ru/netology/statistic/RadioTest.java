package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setCurrentRadioStationNumber() {
        Radio rad = new Radio ();

        rad.setCurrentStation (9);

        int actual = rad.getCurrentStation ();
        int expected = 9;

        assertEquals (expected, actual);
    }


    @Test
    void setCurrRadStNum() {
        Radio rad = new Radio ();

        rad.setCurrentStation (10);

        int actual = rad.getCurrentStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setCurSt() {
        Radio rad = new Radio ();

        rad.setCurrentStation (-1);

        int actual = rad.getCurrentStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setNextStation() {
        Radio rad = new Radio ();
        rad.setCurrentStation (7);
        rad.setNextStation ();

        int actual = rad.getCurrentStation ();
        int expected = 8;

        assertEquals (expected, actual);
    }

    @Test
    void setNextSt() {
        Radio rad = new Radio ();
        rad.setCurrentStation (9);
        rad.setNextStation ();

        int actual = rad.getCurrentStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevStation() {
        Radio rad = new Radio ();
        rad.setCurrentStation (2);
        rad.setPrevStation ();

        int actual = rad.getCurrentStation ();
        int expected = 1;

        assertEquals (expected, actual);

    }

    @Test
    void setPrevSt() {
        Radio rad = new Radio ();
        rad.setCurrentStation (0);
        rad.setPrevStation ();

        int actual = rad.getCurrentStation ();
        int expected = 9;

        assertEquals (expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (7);

        int actual = rad.getCurrentVolume ();
        int expected = 7;

        assertEquals (expected, actual);
    }

    @Test
    void setCurrentVol() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (-1);

        int actual = rad.getCurrentVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setCurVol() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (11);

        int actual = rad.getCurrentVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setNextVolume() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (3);
        rad.setNextVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 4;

        assertEquals (expected, actual);
    }

    @Test
    void setNextVol() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (10);
        rad.setNextVolume ();

        int actuual = rad.getCurrentVolume ();
        int expected = 10;

        assertEquals (expected, actuual);
    }

    @Test
    void setPrevVolume() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (5);
        rad.setPrevVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 4;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevVol() {
        Radio rad = new Radio ();
        rad.setCurrentVolume (0);
        rad.setPrevVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }
}