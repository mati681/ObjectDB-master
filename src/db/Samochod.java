package db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Samochod implements Serializable {
    // Persistent Fields
    @Id@GeneratedValue
    private int IdSamochodu;
    private String NrVin;
    private String Marka;
    private String Model;
    private String Rocznik;
    private String Przebieg;
    private String KrajPochodzenia;

    @ManyToOne
    Silnik silnik;

    @ManyToOne
    Wyposazenie wyposazenie;
    
    @ManyToOne
    Komis komis;
    
   

    public Samochod(int idSamochodu, String nrVin, String marka, String model, String rocznik, String przebieg, String krajPochodzenia ) {

        this.IdSamochodu = idSamochodu;
        this.NrVin = nrVin;
        this.Marka = marka;
        this.Model = model;
        this.Rocznik = rocznik;
        this.Przebieg = przebieg;
        this.KrajPochodzenia = krajPochodzenia;
    }

    public int getIdSamochodu() {
        return IdSamochodu;
    }

    public String getNrVin() {
        return NrVin;
    }

    public String getMarka() {
        return Marka;
    }

    public String getModel() {
        return Model;
    }

    public String getRocznik() {
        return Rocznik;
    }

    public String getPrzebieg() {
        return Przebieg;
    }

    public String getKrajPochodzenia() {
        return KrajPochodzenia;
    }

    public void setWyposazenie(Wyposazenie wyposazenie) {
        this.wyposazenie = wyposazenie;
    }
    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }
    public void setKomis(Komis komis) {
        this.komis = komis;
    }

}
