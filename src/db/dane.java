package db;

import javax.persistence.EntityManager;
import java.util.Random;

public class dane {

    EntityManager em;
    Random r=new Random();

    public dane(EntityManager em) {
        this.em = em;
    }



}
