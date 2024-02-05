package de.abdi.anwendung;

import de.abdi.common.Gerade;
import de.abdi.common.Kurve;
import de.abdi.common.Landstrasse;
import de.abdi.common.TrasierungsElement;

public class Aufgabe1L68 {
    public Landstrasse l68;

    public Aufgabe1L68() {
        this.l68 = new Landstrasse("l68");

        l68.addTrasierungsElement(
                new Gerade("ersteStück", 200)
        );

        l68.addTrasierungsElement(
                new Kurve("zweitesStück", 100, 10)
        );

        l68.addTrasierungsElement(
                new Gerade("drittesStück", 200)
        );

        l68.addTrasierungsElement(
                new Kurve("viertesStück", 100, 10)
        );
    }




    public static void main(String[] args) {
        Aufgabe1L68 aufgabe1L68 = new Aufgabe1L68();

        double gesamtLaenge = aufgabe1L68.l68.berechneGesamtLaenge();

        System.out.println(gesamtLaenge);
    }
}
