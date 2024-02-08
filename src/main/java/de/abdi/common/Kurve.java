package de.abdi.common;

public class Kurve extends TrasierungsElement {
    private int radius;

    public Kurve(String bezeichnung, int laenge, int radius) {
        super(bezeichnung, laenge);

        this.radius = radius;
    }

    @Override
    public int getGeschwindigkeitsbegrenzung() {
        // wir verwenden die gegebene formel, dann dividieren wir das zwischenergebniss mit 10
        // dannach casten wir die Zwischensummme zu einem integer (rundet immer ab)
        // jetzt multiplizieren wir es mit 10 um auf das richtige gerundete Ergebniss zu kommen

        return Math.min(100, ((int) ((Math.sqrt(127*radius*(0.925*0.34*0.4+0.06)))/10))*10);
    }
}