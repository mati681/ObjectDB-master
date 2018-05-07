package db;

import javax.persistence.*;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/komis.odb");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        // Close the database connection:

        Dane d = new Dane(em);
        d.setSilnik(20);
        d.setWyposazenie(20);
        d.setSamochod(20);
        d.setPracownik(20);
      //  d.setKlient(20);
        //d.setKomis(20);

        emf= Persistence.createEntityManagerFactory("db/komis.odb");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        d=new Dane(em);
        //d.relacje(20);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}

