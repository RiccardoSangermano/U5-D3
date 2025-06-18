package esercizio2;

public class Pagina implements ElementoLibro{
    private int numeroPagina;
    private String contenuto;

    public Pagina(int numeroPagina, String contenuto) {
        this.numeroPagina = numeroPagina;
        this.contenuto = contenuto;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa Pagina " + numeroPagina + ": \"" + contenuto + "\"");
    }

    public int getNumeroDiPagina() {
        return numeroPagina;
    }
}
