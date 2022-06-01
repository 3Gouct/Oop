package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setCurrentRadioStationNumber() {
        Radio rad = new Radio ();

        rad.setCurrentStation (5);

        int actual = rad.getCurrentStation ();
        int expected = 5;

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

        rad.setNextStation (8);

        int actual = rad.getNextStation ();
        int expected = 9;

        assertEquals (expected, actual);
    }

    @Test
    void setNextSt() {
        Radio rad = new Radio ();

        rad.setNextStation (10);

        int actual = rad.getNextStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevStation() {
        Radio rad = new Radio ();

        rad.setPrevStation (5);

        int actual = rad.getPrevStation ();
        int expected = 4;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevSt() {
        Radio rad = new Radio ();

        rad.setPrevStation (-1);

        int actual = rad.getPrevStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setMaxStation() {
        Radio rad = new Radio ();

        rad.setMaxStation (10);

        int actual = rad.getMaxStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setMaxSt() {
        Radio rad = new Radio ();

        rad.setMaxStation (8);

        int actual = rad.getMaxStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setMinStation() {
        Radio rad = new Radio ();

        rad.setMinStation (-1);

        int actual = rad.getMinStation ();
        int expected = 9;

        assertEquals (expected, actual);
    }

    @Test
    void setMinSt() {
        Radio rad = new Radio ();

        rad.setMinStation (1);

        int actual = rad.getMinStation ();
        int expected = 0;

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
    void setCurrVolume() {
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

        rad.setNextVolume (5);

        int actual = rad.getNextVolume ();
        int expected = 6;

        assertEquals (expected, actual);
    }

    @Test
    void setNextVol() {
        Radio rad = new Radio ();

        rad.setNextVolume (11);

        int actual = rad.getNextVolume ();
        int expected = 10;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevVolume() {
        Radio rad = new Radio ();

        rad.setPrevVolume (2);

        int actual = rad.getPrevVolume ();
        int expected = 1;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevVol() {
        Radio rad = new Radio ();

        rad.setPrevVolume (-1);

        int actual = rad.getPrevVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }
}