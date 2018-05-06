package db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Silnik implements Serializable {
    // Persistent Fields
    @Id@GeneratedValue
    private int IdSilnika;
    private String NumerSilnika;
    private String Pojemnosc;
    private String NormaSpalin;
    private String RodzajPaliwa;
    private String RodzajWtrysku;


    @OneToMany(mappedBy = "Silnik")
    private List<Samochod> samochod;

    public Silnik(String nrSilnika, String pojemnosc, String normaSpalin, String rodzajPaliwa, String rodzajWtrysku ) {

        this.NumerSilnika = nrSilnika;
        this.Pojemnosc = pojemnosc;
        this.NormaSpalin = normaSpalin;
        this.RodzajPaliwa = rodzajPaliwa;
        this.RodzajWtrysku = rodzajWtrysku;

    }

    public void setNumerSilnika(String numerSilnika) {
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
