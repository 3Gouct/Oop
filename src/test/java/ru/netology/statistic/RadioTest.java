package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setCurrentRadioStationNumber() {
        Radio rad = new Radio ();

        rad.setCurrentRadioStationNumber (5);

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 5;

        assertEquals (expected, actual);
    }

    @Test
    void setMinCurRadStNum() {
        Radio rad = new Radio ();

        rad.setCurrentRadioStationNumber (-1);

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void setMaxCurRadStNum() {
        Radio rad = new Radio ();

        rad.setCurrentRadioStationNumber (10);

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 0;

        assertEquals (expected, actual);
    }


    @Test
    void nextRadioStationNumber() {
        Radio rad = new Radio ();
        rad.setCurrentRadioStationNumber (1);

        rad.nextRadioStationNumber ();

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 2;

        assertEquals (expected, actual);
    }

    @Test
    void more() {
        Radio rad = new Radio ();
        rad.setCurrentRadioStationNumber (9);

        rad.nextRadioStationNumber ();

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 0;

        assertEquals (expected, actual);
    }

    @Test
    void prevRadioStationNumber() {
        Radio rad = new Radio ();
        rad.setCurrentRadioStationNumber (5);

        rad.prevRadioStationNumber ();

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 4;

        assertEquals (expected, actual);
    }

    @Test
    void less() {
        Radio rad = new Radio ();
        rad.setCurrentRadioStationNumber (-1);

        rad.prevRadioStationNumber ();

        int actual = rad.getCurrentRadioStationNumber ();
        int expected = 9;

        assertEquals (expected, actual);
    }
}