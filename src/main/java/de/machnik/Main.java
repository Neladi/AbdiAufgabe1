package de.machnik;

public class Main {
    public static void main(String[] args) {
        Landstrasse l68 = new Landstrasse("l68");

        l68.addTrasierungsElement(
            new TrasierungsElement("ersteStück", 2.0)
        );

        l68.addTrasierungsElement(
            new TrasierungsElement("zweitesStück", 1.0)
        );

        l68.addTrasierungsElement(
            new TrasierungsElement("drittesStück", 2.0)
        );

        l68.addTrasierungsElement(
            new TrasierungsElement("viertesStück", 1.0)
        );

        double gesamtLaenge = l68.berechneGesamtLaenge();
        System.out.println(gesamtLaenge);
    }
}
