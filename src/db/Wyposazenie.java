package db;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wyposazenie {
    // Persistent Fields
    @Id
    @GeneratedValue
    private int IdWyposazenia;
    private String Klimatyzacja; //Wartosci: brak, manualna, automatyczna
    private String RodzajTapicerki;
    private String RodzajReflektorow;// wartosci: zwykle, led, xenon, bixenon



    @OneToMany(mappedBy = "Wyposazenie")
    private List<Samochod> samochod;

    public Wyposazenie(int idWyposazenia, String klimatyzacja, String rodzajTapicerki, String rodzajReflektorow ) {

        this.IdWyposazenia = idWyposazenia;
        this.Klimatyzacja =klimatyzacja;
        this.RodzajTapicerki =rodzajTapicerki;
        this.RodzajReflektorow = rodzajReflektorow;
    }

    public int getIdWyposazenia() {
        return IdWyposazenia;
    }

    public String getKlimatyzacja() {
        return Klimatyzacja;
    }

    public String getRodzajTapicerki() {
        return RodzajTapicerki;
    }

    public String getRodzajReflektorow() {
        return RodzajReflektorow;
    }
}
