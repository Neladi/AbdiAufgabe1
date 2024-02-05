package de.abdi.common;

public class Gerade implements TrasierungsElement {
    private String bezeichnung;
    private int laenge;

    public Gerade(String bezeichnung, int laenge) {
        this.bezeichnung = bezeichnung;
        this.laenge = laenge;
    }

    @Override
    public String getBezeichnung() {
        return this.bezeichnung;
    }

    @Override
    public int getLaenge() {
        return this.laenge;
    }

    @Override
    public int berechneGeschwindigkeitsbegrenzung() {
        return 100;
    }
}
