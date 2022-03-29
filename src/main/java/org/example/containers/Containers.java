package org.example.containers;

public  abstract class Containers implements IContainer {

    private int volume;
    private int maxVolume;

    public Containers(int vol) {
        this.volume = vol;
    }

    public void setVol(int maxVol) {
        this.maxVolume = maxVol;
    }

    public void add(int vol) {
        volume = ((volume + vol) > maxVolume) ? maxVolume : vol;
    }

    public void use(int vol) {
        volume -= vol;
    }

    public int getVolume() {
        return volume;
    }
}

