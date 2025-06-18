package esercizio1;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.MAY, 15); // Anno, Mese (0-11), Giorno
        Date dataNascita = cal.getTime();

        Info personaInfo = new Info("Mario", "Rossi", dataNascita);

        System.out.println("--- Dati originali da Info ---");
        System.out.println("Nome: " + personaInfo.getNome());
        System.out.println("Cognome: " + personaInfo.getCognome());
        System.out.println("Data di Nascita: " + personaInfo.getDataDiNascita());

        System.out.println("\n--- Utilizzo dell'Adapter ---");
        DataSource adapter = new InfoAdapter(personaInfo);
        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("\n--- Dati ottenuti da UserData ---");
        System.out.println("Nome Completo in UserData: " + userData.getNomeCompleto());
        System.out.println("Età in UserData: " + userData.getEta());

        cal.set(2000, Calendar.JANUARY, 1);
        Info altraPersonaInfo = new Info("Anna", "Verdi", cal.getTime());
        DataSource altroAdapter = new InfoAdapter(altraPersonaInfo);
        UserData altraUserData = new UserData();
        altraUserData.getData(altroAdapter);
        System.out.println("Nome Completo in altraUserData: " + altraUserData.getNomeCompleto());
        System.out.println("Età in altraUserData: " + altraUserData.getEta());
    }
}
