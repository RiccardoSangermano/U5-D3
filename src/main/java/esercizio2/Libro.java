package esercizio2;

import java.util.ArrayList;
import java.util.List;

// Libro.java
public class Libro implements ElementoLibro {
    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<ElementoLibro> elementi = new ArrayList<>();

    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    public void rimuoviElemento(ElementoLibro elemento) {
        elementi.remove(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (ElementoLibro elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }


    @Override
    public void stampa() {
        System.out.println("\n===== Stampa Libro: " + titolo + " =====");
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + " EUR");
        System.out.println("Numero totale di pagine: " + getNumeroPagine());

        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
        System.out.println("===== Fine Libro: " + titolo + " =====");
    }

    public String getTitolo() {
        return titolo;
    }

    public List<String> getAutori() {
        return autori;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
