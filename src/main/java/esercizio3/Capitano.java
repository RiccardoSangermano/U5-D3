package esercizio3;

public class Capitano extends Ufficiale {
    public Capitano() {
        super(2000, "Capitano");
    }

    @Override
    public void eseguiFunzione() {
        System.out.println("Il Capitano comanda la compagnia.");
    }
}
