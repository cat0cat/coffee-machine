package org.example.containers;

public interface IContainer {

    void setVol (int vol); //устанавливаем объем бака

    void add (int vol);

    void use (int vol);

    int getVolume ();

}
