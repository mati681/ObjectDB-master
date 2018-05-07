package db;

import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


public class Dane {

    EntityManager em;
    Random r=new Random();

    public Dane(EntityManager em) {
        this.em = em;
    }

    public void setSilnik(int n){
        String NumerSilnika;
        String Pojemnosc;
        String NormaSpalin;
        String RodzajPaliwa;
        String RodzajWtrysku;
        for(int i=0;i<n;i++){

            NumerSilnika = "";
            Pojemnosc = "";
            NormaSpalin = "";
            RodzajPaliwa = "";
            RodzajWtrysku = "";
            for(int j=0;j<10;j++){
                Pojemnosc=Pojemnosc+(char)(r.nextInt(26)+64);
                NormaSpalin=NormaSpalin+(char)(r.nextInt(26)+64);
                RodzajPaliwa=RodzajPaliwa+(char)(r.nextInt(26)+64);
                RodzajWtrysku= RodzajWtrysku+(char)(r.nextInt(26)+64);
            }
            em.persist(new Silnik(NumerSilnika, Pojemnosc, NormaSpalania, RodzajPaliwa, RodzajWtrysku));
        }

    }
    public void setWyposazenie(int n){
        int IdWyposazenia = 0;
        String Klimatyzacja;
        String RodzajTapicerki;
        String RodzajReflektorow;

                for (int i=0; i<n; i++){
                    IdWyposazenia ++;
                    Klimatyzacja = "";
                    for(int j=0;j<(r.nextInt(7)+5);j++) Klimatyzacja=Klimatyzacja+(char)(r.nextInt(26)+64);
                    RodzajTapicerki  =" ";
                    for(int j=0;j<(r.nextInt(7)+5);j++) RodzajTapicerki=RodzajTapicerki+(char)(r.nextInt(26)+64);
                    RodzajReflektorow = "";
                    for(int j=0;j<(r.nextInt(3)+5);j++) RodzajReflektorow=RodzajReflektorow+(char)(r.nextInt(26)+64);

                    em.persist(new Wyposazenie(IdWyposazenia,Klimatyzacja, RodzajTapicerki, RodzajReflektorow,r.nextInt(100)+100));

                }
    }

    public void setSamochod(int n){
         int IdSamochodu = 0;
         String NrVin;
         String Marka;
         String Model;
         String Rocznik;
         String Przebieg;
         String KrajPochodzenia;

        for(int i=0;i<n;i++){
            IdSamochodu ++;
            NrVin="";
            for(int j=0;j<(r.nextInt(5)+5);j++) NrVin=NrVin +(char)(r.nextInt(26)+64);
            Marka="";
            for(int j=0;j<(r.nextInt(5)+5);j++) Marka=Marka+(char)(r.nextInt(26)+64);
            Model="";
            for(int j=0;j<(r.nextInt(5)+2);j++) Model=Model+(char)(r.nextInt(26)+64);
            Rocznik="";
            for(int j=0;j<(r.nextInt(5)+2);j++) Rocznik=Rocznik+(char)(r.nextInt(26)+64);
            Przebieg="";
            for(int j=0;j<(r.nextInt(5)+2);j++) Przebieg=Przebieg+(char)(r.nextInt(26)+64);
            KrajPochodzenia="";
            for(int j=0;j<(r.nextInt(5)+2);j++) KrajPochodzenia=KrajPochodzenia+(char)(r.nextInt(26)+64);
            em.persist(new Samochod(IdSamochodu, NrVin, Marka, Model, Rocznik, Przebieg, KrajPochodzenia));
        }
    }

    
    public void setPracownik(int n){
         int IdOsoby =1;
         String Imie;
         String Nazwisko;
         String Pesel;
         String Stanowisko;
         String StazPracy;

        for(int i=0;i<n;i++){
            IdOsoby ++;
            Stanowisko="";
            for(int j=0;j<(r.nextInt(5)+5);j++) Stanowisko=Stanowisko +(char)(r.nextInt(26)+64);
            StazPracy="";
            for(int j=0;j<(r.nextInt(5)+5);j++) StazPracy=StazPracy+(char)(r.nextInt(26)+64);

            em.persist(new Pracownik(i, Stanowisko, StazPracy, StazPracy, StazPracy, i));
        }
    }


    public void relacje(int n){

    	
    	List<Samochod> lista_samochod=(List<Samochod>)em.createQuery("Select sam From Samochod sam").getResultList();
    	List<Klient> lista_klient=(List<Klient>).em.createQuery("Select k From Klient k").getResultList();
    	List<Pracownik> lista_pracownik=(List<Pracownik>)em.createQuery("Select p From Pracownik p").getResultList();
    	List<Samochod> lista_silnik=(List<Samochod>)em.createQuery("Select s From Silnik s").getResultList();
    	List<Samochod> lista_wyposazenia=(List<Samochod>)em.createQuery("Select s From Silnik s").getResultList();
    	

    	
        
          for(int i=0;i<n;i++){
        	  lista_samochod.get(i).setKomis(lista_samochod.get(r.nextInt(n-1)));
        	  lista_klient.get(i).setKlient(lista_klient.get(r.nextInt(n-1)));
        	  lista_samochod_komis.get(i).setSamochod(lista_samochodow.get(r.nextInt(n-1)));
        	  lista_klient_komis.get(i).setKlient(lista_samochod_pracownik.get(r.nextInt(n-1)));
              lista_wyposazenia.get(i).setWyposazenie(lista_zwierze.get(r.nextInt(n)));

          }

        }
    
}

