package db;

public class Osoba {
    // Persistent Fields
    private int idOsoby;
    private String Imie;
    private String Nazwisko;
    private int Pesel;

    // Constructors
    Osoba(int idOsoby, String imie, String nazwisko, int pesel) {
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

    public int getPesel() {
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
}

