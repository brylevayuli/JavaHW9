
package ru.netology.javaqa;

public class Radio {

    private int quantityStations = 10;
    private int minStation = 0;
    private int maxStation = quantityStations - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio (int quantityStations) {
        this.quantityStations = quantityStations;
        this.minStation = minStation;
        this.maxStation = quantityStations - 1;
        this.currentStation = maxStation;
    }

    public Radio () {
        this.maxStation = quantityStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int setQuantityStations() {
        return quantityStations;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextCurrentStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevCurrentStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}