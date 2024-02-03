package de.abdi.common;

public class TrasierungsElement {
    String bezeichnung;
    int laenge;
    Integer radius;


    public TrasierungsElement(String bezeichnung, int laenge) {
        // übergebene bezeichnung dem Attrinbute bezeichnung hinzufügen
        this.bezeichnung = bezeichnung;
        // übergebene laenge dem Attrinbute laenge hinzufügen
        this.laenge = laenge;

        // radius immer null
        this.radius = null;
    }

    public TrasierungsElement(String bezeichnung, int laenge, int radius) {
        // übergebene bezeichnung dem Attrinbute bezeichnung hinzufügen
        this.bezeichnung = bezeichnung;
        // übergebene laenge dem Attrinbute laenge hinzufügen
        this.laenge = laenge;


        // übergebenen radius dem Attrinbute radius hinzufügen
        this.radius = radius;
    }
}
