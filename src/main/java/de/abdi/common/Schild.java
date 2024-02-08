package de.abdi.common;

public class Schild {
    public Integer geschwBegrenzung;
    public TrasierungsElement trasierungsElement;

    public Schild(int geschwBegrenzung, TrasierungsElement trasierungsElement) {
        this.geschwBegrenzung = geschwBegrenzung;
        this.trasierungsElement = trasierungsElement;
    }

    @Override
    public String toString() {
        return trasierungsElement.bezeichnung + ": " + geschwBegrenzung.toString();
    }
}