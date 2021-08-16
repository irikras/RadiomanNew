package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int maxChannel = 10;
    private int minChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentChannel;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel = currentChannel;
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
        if (currentChannel < maxChannel) {
            currentChannel++;
        } else {
            currentChannel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel--;
        } else {
            currentChannel = maxChannel;
        }
    }
}
