package de.abdi.anwendung;

import de.abdi.common.Landstrasse;
import de.abdi.common.TrasierungsElement;

public class Aufgabe2L200 {
    public Landstrasse l200;

    public Aufgabe2L200() {
        this.l200 = new Landstrasse("l200");

        l200.addTrasierungsElement(
                new TrasierungsElement("ersteStück", 50)
        );

        l200.addTrasierungsElement(
                new TrasierungsElement("zweitesStück", 25, 10)
        );

        l200.addTrasierungsElement(
                new TrasierungsElement("drittesStück", 25)
        );

        l200.addTrasierungsElement(
                new TrasierungsElement("viertesStück", 4, 10)
        );
    }


    public static void main(String[] args) {
        Aufgabe2L200 aufgabe2L68 = new Aufgabe2L200();

        System.out.println(aufgabe2L68.l200.berechneGesamtLaenge());
        System.out.println(aufgabe2L68.l200.berechneAnzahlLeitpfosten());
    }
}
