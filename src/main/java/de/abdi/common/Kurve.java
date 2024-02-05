package de.abdi.common;

public class Kurve implements TrasierungsElement {
    private String bezeichnung;
    private int laenge;
    private int radius;

    public Kurve(String bezeichnung, int laenge, int radius) {
        this.bezeichnung = bezeichnung;
        this.laenge = laenge;
        this.radius = radius;
    }

    @Override
    public String getBezeichnung() {
        return this.bezeichnung;
    }

    @Override
    public int getLaenge() {
        return this.laenge;
    }

    @Override
    public int berechneGeschwindigkeitsbegrenzung() {
        // wir verwenden die gegebene formel, dann dividieren wir das zwischenergebniss mit 10
        // dannach casten wir die Zwischensummme zu einem integer (rundet immer ab)
        // jetzt multiplizieren wir es mit 10 um auf das richtige gerundete Ergebniss zu kommen

        int saveRadius = radius;
        if (saveRadius < 100) {
            saveRadius = 100;
        }

        return ((int) ((Math.sqrt(127*saveRadius*(0.925*0.34*0.4+0.06)))/10))*10;
    }
}
