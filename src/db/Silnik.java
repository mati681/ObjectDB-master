package db;

import javax.persistence.Entity;

@Entity
public class Silnik {
    // Persistent Fields
    private int NumerSilnika;
    private String Pojemnosc;
    private String NormaSpalin;
    private String RodzajPaliwa;
    private String RodzajWtrysku;



    public Silnik(int nrSilnika, String pojemnosc, String normaSpalin, String rodzajPaliwa, String rodzajWtrysku ) {

        this.NumerSilnika = nrSilnika;
        this.Pojemnosc = pojemnosc;
        this.NormaSpalin = normaSpalin;
        this.RodzajPaliwa = rodzajPaliwa;
        this.RodzajWtrysku = rodzajWtrysku;

    }

    public void setNumerSilnika(int numerSilnika) {
        NumerSilnika = numerSilnika;
    }

    public void setPojemnosc(String pojemnosc) {
        Pojemnosc = pojemnosc;
    }

    public void setNormaSpalin(String normaSpalin) {
        NormaSpalin = normaSpalin;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        RodzajPaliwa = rodzajPaliwa;
    }

    public void setRodzajWtrysku(String rodzajWtrysku) {
        RodzajWtrysku = rodzajWtrysku;
    }

}
