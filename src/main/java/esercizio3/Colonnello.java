package esercizio3;

public class Colonnello extends Ufficiale {
    public Colonnello() {
        super(4000, "Colonnello");
    }

    @Override
    public void eseguiFunzione() {
        System.out.println("Il Colonnello dirige il reggimento.");
    }
}
