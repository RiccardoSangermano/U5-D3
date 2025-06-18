package esercizio3;

public abstract class Ufficiale {
    protected Ufficiale responsabile;
    protected int stipendio;
    protected String grado;

    public Ufficiale(int stipendio, String grado) {
        this.stipendio = stipendio;
        this.grado = grado;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public abstract void eseguiFunzione();

    public void verificaStipendio(int importoRichiesto) {
        if (this.stipendio >= importoRichiesto) {
            System.out.println(this.grado + " (" + this.stipendio + " EUR) percepisce almeno " + importoRichiesto + " EUR.");
        }

        if (responsabile != null) {
            responsabile.verificaStipendio(importoRichiesto);
        } else {
        }
    }

    public int getStipendio() {
        return stipendio;
    }

    public String getGrado() {
        return grado;
    }
}
