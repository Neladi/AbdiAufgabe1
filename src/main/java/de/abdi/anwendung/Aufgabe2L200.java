package de.abdi.anwendung;

import de.abdi.common.Gerade;
import de.abdi.common.Kurve;
import de.abdi.common.Landstrasse;

public class Aufgabe2L200 {
    public Landstrasse l200;

    public Aufgabe2L200() {
        this.l200 = new Landstrasse("l200");

        l200.addTrasierungsElement(
                new Gerade("ersteStück", 50)
        );

        l200.addTrasierungsElement(
                new Kurve("zweitesStück", 25, 10)
        );

        l200.addTrasierungsElement(
                new Gerade("drittesStück", 25)
        );

        l200.addTrasierungsElement(
                new Kurve("viertesStück", 4, 10)
        );
    }


    public static void main(String[] args) {
        Aufgabe2L200 aufgabe2L68 = new Aufgabe2L200();

        System.out.println(aufgabe2L68.l200.berechneGesamtLaenge());
        System.out.println(aufgabe2L68.l200.berechneAnzahlLeitpfosten());
    }
}
