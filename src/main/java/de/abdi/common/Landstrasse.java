package de.abdi.common;

import java.util.ArrayList;
import java.util.List;

public class Landstrasse {
    String name;
    ArrayList<TrasierungsElement> trasierungsElemente;


    // Konstruktor für die Klasse Landstrasse
    public Landstrasse(String landstrassenName) {
        this.name = landstrassenName;
        this.trasierungsElemente = new ArrayList<TrasierungsElement>();
    }

    public void addTrasierungsElement(TrasierungsElement e) {
        // anfügen eines Trasierungselementes zur ArrayList "trasierungsElemente"
        this.trasierungsElemente.add(e);
    }

    public int berechneGesamtLaenge() {
        int gesamtLaenge = 0;

        // Schleife über alle Trasierungselemente um die Gesamtlänge der Landstraße zu ermitteln
        for (TrasierungsElement element: this.trasierungsElemente) {
            // Die Trasierungselement länge (element.laenge) auf die "gesamtlänge" addieren
            gesamtLaenge += element.getLaenge();
        }

        //zurückgeben der ermittelten gesamtlänge
        return gesamtLaenge;
    }


    public int berechneAnzahlLeitpfosten() {
        // gesamtLänge geteilt durch Pfostenabstand (50m) und cast zu Integer
        int anzahlPfosten = (int) (berechneGesamtLaenge() / 50.0);

        // plus eins damit der erste Pfosten enthalten ist
        anzahlPfosten += 1;

        // duplizieren für beide Straßenseiten
        anzahlPfosten *= 2;

        return anzahlPfosten;
    }

    public ArrayList<Schild> berechneBeschilderungen() {
        ArrayList<Schild> beschilderungen = new ArrayList<Schild>();

        int lastSpeedlimit = 0;

        for (TrasierungsElement element: this.trasierungsElemente) {
            int speedlimit = element.berechneGeschwindigkeitsbegrenzung();
            if (speedlimit != lastSpeedlimit) {
                Schild schild = new Schild(speedlimit, element);
                beschilderungen.add(schild);
            }
            lastSpeedlimit = speedlimit;
        }

        return beschilderungen;
    }
}