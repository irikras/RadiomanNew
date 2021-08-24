package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.BaseStream;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetDesiredChannel() {
        Radio radio = new Radio(9);
        radio.setCurrentChannel(7);
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetDesiredAnyMinusChannel() {
        Radio radio = new Radio(9);
        radio.setCurrentChannel(-7);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetDesiredVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetDesiredAnyMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-7);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetNextChannel() {
        Radio radio = new Radio(10, 3);
        radio.increaseChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void shouldGetPrevChannel() {
        Radio radio = new Radio(8, 6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void shouldIncreaseChannelAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(11);
        radio.increaseChannel();
        assertEquals(0, radio.getMinChannel());
    }

    @Test
    public void shouldDecreaseChannelBelowMin() {
        Radio radio = new Radio(9, -9);
        radio.decreaseChannel();
        assertEquals(0, radio.getMinChannel());
    }

    @Test
    public void shouldPreviousChannelFromMin() {
        Radio radio = new Radio(7, 0);
        radio.decreaseChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void shouldNextChannelFromMax() {
        Radio radio = new Radio(9, 10);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(155);
        radio.increaseVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(-100);
        radio.decreaseVolume();
        assertEquals(0, radio.getMinVolume());
    }
}