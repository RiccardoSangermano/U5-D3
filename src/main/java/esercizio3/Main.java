package esercizio3;

public class Main {
    public static void main(String[] args) {
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);

        System.out.println("--- Richieste di Verifica Stipendio ---");

        System.out.println("\nVerifica importo: 2500 EUR");
        tenente.verificaStipendio(2500);

        System.out.println("\nVerifica importo: 500 EUR");
        tenente.verificaStipendio(500);

        System.out.println("\nVerifica importo: 4000 EUR");
        tenente.verificaStipendio(4000);


        System.out.println("\nVerifica importo: 6000 EUR");
        tenente.verificaStipendio(6000);

        System.out.println("\n--- Dimostrazione delle Funzioni ---");
        tenente.eseguiFunzione();
        capitano.eseguiFunzione();
        colonnello.eseguiFunzione();
    }
}
