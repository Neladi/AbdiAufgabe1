package de.abdi.common;

public abstract class TrasierungsElement {
    public String bezeichnung;
    public int laenge;

    public TrasierungsElement(String bezeichnung, int laenge) {
        this.bezeichnung = bezeichnung;
        this.laenge = laenge;
    }

    public abstract int getGeschwindigkeitsbegrenzung();
}