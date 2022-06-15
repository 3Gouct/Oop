package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setRadio() {
        Radio rad1 = new Radio (24,0, 25);
        rad1.setAmountStation (24);
        rad1.setCurrentStation (13);

        assertEquals (13, rad1.getCurrentStation ());
    }

    Radio rad = new Radio ();

    @Test
    void setRadio1() {

        assertEquals (10, rad.getAmountStation ());
    }

    @Test
    void setNextStation() {
        rad.setCurrentStation (7);
        rad.setNextStation ();

        int actual = rad.getCurrentStation ();
        int expected = 8;

        assertEquals (expected, actual);
    }

    @Test
    void setNextSt() {
        rad.setCurrentStation (9);
        rad.setNextStation ();

        int actual = rad.getCurrentStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevStation() {
        rad.setCurrentStation (2);
        rad.setPrevStation ();

        int actual = rad.getCurrentStation ();
        int expected = 1;

        assertEquals (expected, actual);

    }

    @Test
    void setPrevSt() {
        rad.setCurrentStation (0);
        rad.setPrevStation ();

        int actual = rad.getCurrentStation ();
        int expected = 9;

        assertEquals (expected, actual);
    }

    @Test
    void currentStation() {
        rad.setCurrentStation (7);

        int actual = rad.getCurrentStation ();
        int expected = 7;

        assertEquals (expected, actual);
    }

    @Test
    void setCurrRadStNum() {
        rad.setCurrentStation (10);
        int actual = rad.getCurrentStation ();
        int expected = 0;

        assertEquals (expected, actual);
    }

        @Test
        void setCurSt () {
            rad.setCurrentStation (-1);

            int actual = rad.getCurrentStation ();
            int expected = 0;

            assertEquals (expected, actual);
        }

    @Test
    void setCurrentVolume() {
        rad.setCurrentVolume (7);

        int actual = rad.getCurrentVolume ();
        int expected = 7;

        assertEquals (expected, actual);
    }

    @Test
    void setCurrentVol() {
        rad.setCurrentVolume (-1);

        int actual = rad.getCurrentVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setCurVol() {
        rad.setCurrentVolume (101);

        int actual = rad.getCurrentVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setNextVolume() {
        rad.setCurrentVolume (3);
        rad.setNextVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 4;

        assertEquals (expected, actual);
    }

    @Test
    void setNextVol() {
        rad.setCurrentVolume (100);
        rad.setNextVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 100;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevVolume() {
        rad.setCurrentVolume (5);
        rad.setPrevVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 4;

        assertEquals (expected, actual);
    }

    @Test
    void setPrevVol() {
        rad.setCurrentVolume (0);
        rad.setPrevVolume ();

        int actual = rad.getCurrentVolume ();
        int expected = 0;

        assertEquals (expected, actual);
    }
}