package db;

import javax.persistence.EntityManager;
import java.util.Random;

public class dane {

    EntityManager em;
    Random r=new Random();

    public dane(EntityManager em) {
        this.em = em;
    }

    public void setSilnik(int n){
        String NumerSilnika;
        String Pojemnosc;
        String NormaSpalania;
        String RodzajPaliwa;
        String RodzajWtrysku;
        for(int i=0;i<n;i++){
            NumerSilnika = "";
            Pojemnosc = "";
            NormaSpalania = "";
            RodzajPaliwa = "";
            RodzajWtrysku = "";
            for(int j=0;j<10;j++){
                Pojemnosc=Pojemnosc+(char)(r.nextInt(26)+64);
                NormaSpalania=NormaSpalania+(char)(r.nextInt(26)+64);
                RodzajPaliwa=RodzajPaliwa+(char)(r.nextInt(26)+64);
                RodzajWtrysku= RodzajWtrysku+(char)(r.nextInt(26)+64);
            }
            em.persist(new Silnik(NumerSilnika, Pojemnosc, NormaSpalania, RodzajPaliwa, RodzajWtrysku));
        }

    }



}
