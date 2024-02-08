package de.abdi.anwendung;

import de.abdi.common.*;

import java.util.ArrayList;

public class Testbeispiel {
    public Landstrasse testLandstrasse;

    public Testbeispiel() {
        this.testLandstrasse = new Landstrasse("L3421");

        testLandstrasse.addTrasierungsElement(
                new Gerade("L3421-1", 8384)
        );

        testLandstrasse.addTrasierungsElement(
                new Kurve("L3421-2", 560, 90)
        );

        testLandstrasse.addTrasierungsElement(
                new Gerade("L3421-3", 3000)
        );

        testLandstrasse.addTrasierungsElement(
                new Gerade("L3421-4", 5000)
        );

        testLandstrasse.addTrasierungsElement(
                new Kurve("L3421-5", 690, 134)
        );

        testLandstrasse.addTrasierungsElement(
                new Gerade("L3421-6", 2843)
        );

        testLandstrasse.addTrasierungsElement(
                new Kurve("L3421-7", 330, 53)
        );

        testLandstrasse.addTrasierungsElement(
                new Gerade("L3421-8", 10000)
        );
    }


    public static void main(String[] args) {
        Testbeispiel aufgabe2L68 = new Testbeispiel();

        System.out.print("Anzahl Leitpfosten: ");
        System.out.println(aufgabe2L68.testLandstrasse.berechneAnzahlLeitpfosten());

        System.out.println();
        System.out.println("Beschilderungen:");

        ArrayList<Schild> beschilderungen = aufgabe2L68.testLandstrasse.berechneBeschilderungen();
        for (Schild schild: beschilderungen) {
            System.out.println(schild.toString());
        }

    }
}