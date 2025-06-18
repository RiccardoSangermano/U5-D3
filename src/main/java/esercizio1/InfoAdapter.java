package esercizio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascitaUtil = info.getDataDiNascita();
        LocalDate dataDiNascitaLocal = dataDiNascitaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate dataCorrente = LocalDate.now();
        return Period.between(dataDiNascitaLocal, dataCorrente).getYears();
    }
}
