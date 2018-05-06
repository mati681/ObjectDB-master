package db;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Klient extends Osoba {
    // Persistent Fields
    private int idKlienta;
    private String Adres;
    private int Telefon;
    private String Email;

    @OneToMany(mappedBy = "Klient")
    private List<Komis> komis;

    @OneToMany(mappedBy = "Klient")
    private List<Samochod> samochod;
    
    public Klient(int idOsoby, String imie, String nazwisko, int pesel, int idKlienta, String adres, int telefon, String email) {
        super(idOsoby, imie, nazwisko, pesel);
        this.idKlienta = idKlienta;
        this.Adres = adres;
        this.Telefon = telefon;
        this.Email = email;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public String getAdres() {
        return Adres;
    }

    public int getTelefon() {
        return Telefon;
    }

    public String getEmail() {
        return Email;
    }
}
