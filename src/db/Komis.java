package db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Komis implements Serializable {
    // Persistent Fields
    @Id
    @GeneratedValue
    private int IdKomisu;
    private String Nazwa;
    private String Adres;


    @ManyToOne
    Klient klient;
    @ManyToOne
    Samochod samochod;

    public Komis(int idKomisu, String nazwa, String adres ) {

        this.IdKomisu = idKomisu;
        this.Nazwa = nazwa;
        this.Adres = adres;

    }

    public int getIdKomisu() {
        return IdKomisu;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getAdres() {
        return Adres;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }

}
