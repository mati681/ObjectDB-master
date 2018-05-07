package db;

import javax.persistence.*;


@Entity
public class Pracownik extends Osoba {
    // Persistent Fields
   // private int idPracownika;
    private String Stanowisko;
    private int StazPracy;

    
    @ManyToOne
    Komis komis;

    public Pracownik(int idOsoby, String imie, String nazwisko, String pesel, String stanowisko, int stazPracy) {
        super(idOsoby, imie, nazwisko, pesel);
        // this.idPracownika = idPracownika;
        this.Stanowisko = stanowisko;
        this.StazPracy = stazPracy;
    }

  //  public int getIdPracownika() {
     //   return idPracownika;
   // }

    public String getStanowisko() {
        return Stanowisko;
    }

    public int getStazPracy() {
        return StazPracy;
    }
    
        
    public void setKomis(Komis komis) {
        this.komis = komis;
    }

    void getSumaPieniedzy()
    {

    };
}

