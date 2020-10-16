package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    void getMaxTemperatureAndsetMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 40;

        conditioner.setMaxTemperature(expected);

        assertEquals(40, conditioner.getMaxTemperature());


    }

    @Test
    void getMinTemperatureAndsetMinTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 10;

        conditioner.setMinTemperature(expected);

        assertEquals(10, conditioner.getMinTemperature());
    }

    @Test
    void getCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    void isOnAndsetOn() {
        Conditioner conditioner = new Conditioner();
        boolean on = false;
        conditioner.setOn(on);

        assertEquals(on, conditioner.isOn());
    }


    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 45;
        int expected = 45;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void increaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        int currentTemperature = 15;
        int expected = 15;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(21);
        conditioner.decreaseCurrentTemperature();
        assertEquals(20, conditioner.getCurrentTemperature());
    }


    @Test
    public void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();


        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15,conditioner.getCurrentTemperature());

        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(18);
        conditioner.decreaseCurrentTemperature();
        assertEquals(17,conditioner.getCurrentTemperature());




    }

    @Test
    void decreaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(45);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(45);
        conditioner.decreaseCurrentTemperature();
        assertEquals(44, conditioner.getCurrentTemperature());
    }


    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setCurrentTemperature(41);
        assertEquals(40,conditioner.getMaxTemperature());

        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(9);
        assertEquals(10,conditioner.getMinTemperature());


        int currentTemperature = 15;
        conditioner.setCurrentTemperature(15);
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(15,conditioner.getCurrentTemperature());
    }
}

