package db;

import javax.persistence.*;


@Entity
public class Pracownik extends Osoba {
    // Persistent Fields
    private int idPracownika;
    private String Stanowisko;
    private int StazPracy;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "nrVin")
    public Samochod SamochodzPracownikiem;

    public Pracownik(int idOsoby, String imie, String nazwisko, int pesel, int idPracownika, String stanowisko, int stazPracy) {
        super(idOsoby, imie, nazwisko, pesel);
        this.idPracownika = idPracownika;
        this.Stanowisko = stanowisko;
        this.StazPracy = stazPracy;
    }

    public int getIdPracownika() {
        return idPracownika;
    }

    public String getStanowisko() {
        return Stanowisko;
    }

    public int getStazPracy() {
        return StazPracy;
    }
}

