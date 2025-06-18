package esercizio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagina p1 = new Pagina(1, "Introduzione al Pattern Composite.");
        Pagina p2 = new Pagina(2, "Vantaggi del design pattern.");
        Pagina p3 = new Pagina(3, "Esempio pratico: Albero di directory.");
        Pagina p4 = new Pagina(4, "Conclusione e riferimenti.");
        Pagina p5 = new Pagina(5, "Contenuto della sottosezione A.1");
        Pagina p6 = new Pagina(6, "Contenuto della sottosezione A.2");
        Pagina p7 = new Pagina(7, "Pagina finale del libro.");

        Sezione sottosezioneA = new Sezione("Sottosezione A (Concetti Base)");
        sottosezioneA.aggiungiElemento(p5);
        sottosezioneA.aggiungiElemento(p6);

        Sezione sezione1 = new Sezione("Capitolo 1: Introduzione");
        sezione1.aggiungiElemento(p1);
        sezione1.aggiungiElemento(p2);

        Sezione sezione2 = new Sezione("Capitolo 2: Approfondimento");
        sezione2.aggiungiElemento(p3);
        sezione2.aggiungiElemento(sottosezioneA);
        List<String> autori = Arrays.asList("Mario Rossi", "Giulia Bianchi");
        Libro mioLibro = new Libro("Design Patterns in Pratica", autori, 29.99);


        mioLibro.aggiungiElemento(sezione1);
        mioLibro.aggiungiElemento(sezione2);
        mioLibro.aggiungiElemento(p4);
        mioLibro.aggiungiElemento(p7);

        System.out.println("Titolo del libro: " + mioLibro.getTitolo());
        System.out.println("Autori: " + mioLibro.getAutori());
        System.out.println("Prezzo: " + mioLibro.getPrezzo() + " EUR");

        System.out.println("\nNumero totale di pagine del libro: " + mioLibro.getNumeroPagine());

        mioLibro.stampa();

        System.out.println("\n--- Test di stampa di una singola pagina o sezione ---");
        p1.stampa();
        sottosezioneA.stampa();
    }
}