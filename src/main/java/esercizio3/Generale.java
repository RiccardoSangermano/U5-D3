package esercizio3;

public class Generale extends Ufficiale {
    public Generale() {
        super(5000, "Generale");
    }

    @Override
    public void eseguiFunzione() {
        System.out.println("Il Generale comanda la brigata.");
    }
}
