package db;

public class Komis {
    // Persistent Fields
    private int idKomisu;
    private String Nazwa;
    private String Adres;

    public Komis(int idKomisu, String nazwa, String adres ) {

        this.idKomisu = idKomisu;
        this.Nazwa = nazwa;
        this.Adres = adres;

    }

    public int getIdKomisu() {
        return idKomisu;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getAdres() {
        return Adres;
    }



}
