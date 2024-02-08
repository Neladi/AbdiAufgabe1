package de.abdi.common;

import java.util.ArrayList;

public class Landstrasse {
    String name;
    ArrayList<TrasierungsElement> trasierungsElemente;
    // Es wird der Landstraße ein Name zugewiesen, und die Liste der TrassierungsElemente wird initialisiert.

    // Konstruktor für die Klasse Landstrasse
    public Landstrasse(String landstrassenName) {
        this.name = landstrassenName;
        this.trasierungsElemente = new ArrayList<TrasierungsElement>();
    }

    public void addTrasierungsElement(TrasierungsElement e) {
        // Methode: anfügen eines Trasierungselementes zur ArrayList "trasierungsElemente"
        this.trasierungsElemente.add(e);
    }
    // Methode:
    public int berechneGesamtLaenge() {
        int gesamtLaenge = 0;

        // Schleife über alle Trasierungselemente um die Gesamtlänge der Landstraße zu ermitteln
        for (TrasierungsElement element: this.trasierungsElemente) {
            // Die Trasierungselement länge (element.laenge) auf die "gesamtlänge" addieren
            gesamtLaenge += element.laenge;
        }

        //zurückgeben der ermittelten gesamtlänge
        return gesamtLaenge;
    }


    public int berechneAnzahlLeitpfosten() {
        // Methode :gesamtLänge geteilt durch Pfostenabstand (50m) und cast zu Integer
        int anzahlPfosten = (int) (berechneGesamtLaenge() / 50.0);

        // plus eins damit der erste Pfosten enthalten ist
        anzahlPfosten += 1;

        // duplizieren für beide Straßenseiten
        anzahlPfosten *= 2;

        return anzahlPfosten;
    }

    /* Die Methode "berechneBeschilderungen" erstellt Beschilderungen für die Landstraße,
     * basierend auf den Geschwindigkeitsbegrenzungen der Trassierungselemente.
     * Wenn sich die Geschwindigkeitsbegrenzung ändert, wird ein neues Schild hinzugefügt.
     */
    public ArrayList<Schild> berechneBeschilderungen() {
        ArrayList<Schild> beschilderungen = new ArrayList<Schild>();

        int lastSpeedLimit = 0;

        for (TrasierungsElement element: this.trasierungsElemente) {
            int speedLimit = element.getGeschwindigkeitsbegrenzung();
            if (speedLimit != lastSpeedLimit) {
                Schild schild = new Schild(speedLimit, element);
                beschilderungen.add(schild);
                lastSpeedLimit = speedLimit;
            }
        }

        return beschilderungen;
    }
}