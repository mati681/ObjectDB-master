package db;

import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/komis.odb");
        EntityManager em = emf.createEntityManager();

        // Close the database connection:
        em.close();
        emf.close();
    }
}

