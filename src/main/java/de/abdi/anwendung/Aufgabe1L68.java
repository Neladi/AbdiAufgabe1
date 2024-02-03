package de.abdi.anwendung;

import de.abdi.common.Landstrasse;
import de.abdi.common.TrasierungsElement;

public class Aufgabe1L68 {
    public Landstrasse l68;

    public Aufgabe1L68() {
        this.l68 = new Landstrasse("l68");

        l68.addTrasierungsElement(
                new TrasierungsElement("ersteStück", 2)
        );

        l68.addTrasierungsElement(
                new TrasierungsElement("zweitesStück", 1, 10)
        );

        l68.addTrasierungsElement(
                new TrasierungsElement("drittesStück", 2)
        );

        l68.addTrasierungsElement(
                new TrasierungsElement("viertesStück", 1, 10)
        );
    }




    public static void main(String[] args) {
        Aufgabe1L68 aufgabe1L68 = new Aufgabe1L68();

        double gesamtLaenge = aufgabe1L68.l68.berechneGesamtLaenge();

        System.out.println(gesamtLaenge);
    }
}
