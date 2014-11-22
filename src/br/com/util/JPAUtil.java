

package br.com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JPAUtil {
    
    private static final String UNIT_NAME = "BibliotecaPU";
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
      public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }
        if (em == null){
            em = emf.createEntityManager();
        }
        return em;
    }
}
