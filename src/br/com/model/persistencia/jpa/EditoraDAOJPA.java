

package br.com.model.persistencia.jpa;

import br.com.model.Editora;
import br.com.model.persistencia.dao.EditoraDAO;
import java.util.List;


public class EditoraDAOJPA  extends DAOJPA <Editora, Integer> implements EditoraDAO {
    
    public List<Editora> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Editora x where x.nome like '%" + Nome + "%'").getResultList();

    }
    
}
