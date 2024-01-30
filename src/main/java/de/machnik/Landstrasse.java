package de.machnik;

import java.util.ArrayList;
import java.util.List;

public class Landstrasse {
    String name;
    List<TrasierungsElement> trasierungsElemente = new ArrayList<>();


    Landstrasse(String landstrassenName) {
        this.name = landstrassenName;
    }

    public void addTrasierungsElement(TrasierungsElement e) {
        this.trasierungsElemente.add(e);
    }

    public double berechneGesamtLaenge() {
        double gesamtLaenge = 0.0;

        for (TrasierungsElement element: this.trasierungsElemente) {
            gesamtLaenge += element.laenge;
        }

        return gesamtLaenge;
    }
}
