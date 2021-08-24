package ru.netology.domain;

public class Radio {
    private int maxStation;
    private int numberOfChannel = 10;
    private int minChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentChannel;
    private boolean on;

    public Radio() {
    }

    public Radio(int numberOfChannel) {
        this.numberOfChannel = numberOfChannel;
        this.maxStation = numberOfChannel - 1;
    }

    public Radio(int maxStation, int currentChannel) {
        this.maxStation = maxStation;
        this.currentChannel = currentChannel;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getNumberOfChannel() {
        return numberOfChannel;
    }

    public void setNumberOfChannel(int numberOfChannel) {
        this.numberOfChannel = numberOfChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > numberOfChannel) {
            this.currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = numberOfChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseChannel() {
        if (currentChannel < maxStation) {
            currentChannel++;
        } else {
            currentChannel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel--;
        } else {
            currentChannel = maxStation;
        }
    }
}
