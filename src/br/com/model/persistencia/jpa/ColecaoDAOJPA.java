

package br.com.model.persistencia.jpa;

import br.com.model.Colecao;
import br.com.model.persistencia.dao.ColecaoDAO;
import java.util.List;


public class ColecaoDAOJPA  extends DAOJPA <Colecao, Integer> implements ColecaoDAO {
    
    public List<Colecao> getByNome(String Nome) {
        return getEntityManager().createQuery("select x from Colecao x where x.nome like '%" + Nome + "%'").getResultList();

    }
    
}
