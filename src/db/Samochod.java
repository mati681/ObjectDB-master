package db;

public class Samochod {
    // Persistent Fields
    private int NrVin;
    private String Marka;
    private String Model;
    private int Rocznik;
    private int Przebieg;
    private String KrajPochodzenia;


    public Samochod(int nrVin, String marka, String model, int rocznik, int przebieg, String krajPochodzenia ) {

        this.NrVin = nrVin;
        this.Marka = marka;
        this.Model = model;
        this.Rocznik = rocznik;
        this.Przebieg = przebieg;
        this.KrajPochodzenia = krajPochodzenia;
    }

    public int getNrVin() {
        return NrVin;
    }

    public String getMarka() {
        return Marka;
    }

    public String getModel() {
        return Model;
    }

    public int getRocznik() {
        return Rocznik;
    }

    public int getPrzebieg() {
        return Przebieg;
    }

    public String getKrajPochodzenia() {
        return KrajPochodzenia;
    }

}
