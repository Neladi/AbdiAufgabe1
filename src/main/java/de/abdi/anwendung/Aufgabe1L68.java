package de.abdi.anwendung;

import de.abdi.common.Gerade;
import de.abdi.common.Kurve;
import de.abdi.common.Landstrasse;
import de.abdi.common.TrasierungsElement;

import java.util.ArrayList;

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

        Professor p = new Professor("Harald", 35);
        Student s = new Student("Abdi", 3);

        ArrayList<Person> mitglierderUni = new ArrayList<>();

        mitglierderUni.add(p);
        mitglierderUni.add(s);


        for (Person person: mitglierderUni) {
            System.out.println(person + " - " + person.getInteger());
        }





        /*Aufgabe1L68 aufgabe1L68 = new Aufgabe1L68();

        double gesamtLaenge = aufgabe1L68.l68.berechneGesamtLaenge();

        System.out.println(gesamtLaenge);*/
    }
}


abstract class Person {
    private String name;

    public Person(String personName) {
        name = personName;
    }

    public String toString() {
        return name;
    }

    abstract public int getInteger();
}

class Professor extends Person {
    int dienstJahre;

    public Professor(String professorName, int dienstJahre) {
        super("P-"+professorName);

        this.dienstJahre = dienstJahre;
    }

    public void professorTest() {
        System.out.println("professorTest");
    }

    @Override
    public int getInteger() {
        return dienstJahre;
    }
}

class Student extends Person {
    int aktuellesSemester;

    public Student(String professorName, int aktuellesSemester) {
        super("S-"+professorName);

        this.aktuellesSemester = aktuellesSemester;
    }

    @Override
    public int getInteger() {
        return aktuellesSemester;
    }
}