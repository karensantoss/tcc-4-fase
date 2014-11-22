

package br.com.model.persistencia.jpa;

import br.com.model.Autor;
import br.com.model.persistencia.dao.AutorDAO;
import java.util.List;


public class AutorDAOJPA  extends DAOJPA <Autor, Integer> implements AutorDAO {
    
    public List<Autor> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Autor x where x.nome like '%" + Nome + "%'").getResultList();

    }
    
}
