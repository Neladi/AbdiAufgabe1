package de.abdi.common;

public class Gerade extends TrasierungsElement {

    public Gerade(String bezeichnung, int laenge) {
        super(bezeichnung, laenge);
    }

    @Override
    public int getGeschwindigkeitsbegrenzung() {
        return 100;
    }
}