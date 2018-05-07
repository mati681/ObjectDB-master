package db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import java.io.Serializable;

import static javax.persistence.InheritanceType.JOINED;

@Entity
@Inheritance(strategy=JOINED)
public abstract class Osoba implements Serializable {
    @Id
    @GeneratedValue
    // Persistent Fields
    private int idOsoby;
    private String Imie;
    private String Nazwisko;
    private String Pesel;

    // Constructors
    Osoba(int idOsoby, String imie, String nazwisko, String  pesel) {
        this.idOsoby = idOsoby;
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.Pesel = pesel;
    }
    //getters
    public int getIdOsoby() {
        return this.idOsoby;
    }

    public String getImie() {
        return this.Imie;
    }

    public String getNazwisko() {
        return this.Nazwisko;
    }

    public String getPesel() {
        return this.Pesel;
    }

    //toString Method
    @Override
    public String toString() {
        return "Osoba{" +
                "idOsoby=" + idOsoby +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Pesel=" + Pesel +
                '}';
    }

    abstract void getSumaPieniedzy();
}

