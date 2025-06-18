package esercizio1;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
        System.out.println("UserData ha ricevuto: Nome Completo = " + nomeCompleto + ", Età = " + eta);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getEta() {
        return eta;
    }
}
