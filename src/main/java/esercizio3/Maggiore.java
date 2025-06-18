package esercizio3;

public class Maggiore extends Ufficiale {
    public Maggiore() {
        super(3000, "Maggiore");
    }

    @Override
    public void eseguiFunzione() {
        System.out.println("Il Maggiore coordina le unità operative.");
    }
}