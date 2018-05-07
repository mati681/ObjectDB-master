package db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Entity
public class Komis implements Serializable {
    // Persistent Fields
    @Id
    @GeneratedValue
    private int IdKomisu;
    private String Nazwa;
    private String Adres;


    @OneToMany(mappedBy = "Komis")
    private List<Samochod> samochod;
   
    
    @OneToMany(mappedBy = "Komis")
    private List<Klient> klient;
    
    @OneToMany(mappedBy = "Komis")
    private List<Pracownik> pracownik;

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

    
}
