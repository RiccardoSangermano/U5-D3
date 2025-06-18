package esercizio3;

public class Tenente extends Ufficiale{
    public Tenente() {
        super(1000, "Tenente");
    }
        @Override
        public void eseguiFunzione() {
            System.out.println("Il Tenente gestisce le operazioni sul campo.");
        }
}
