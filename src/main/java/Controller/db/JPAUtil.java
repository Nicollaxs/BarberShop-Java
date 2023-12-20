package Controller.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("barbershop");

    public static EntityManager getEnityManager() {
        return FACTORY.createEntityManager();
    }

}
