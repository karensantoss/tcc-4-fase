
package br.com.model.persistencia.dao;

import br.com.model.Colecao;
import java.util.List;


public interface ColecaoDAO extends DAO <Colecao, Integer> {
    
    public List<Colecao>getByNome(String Nome);
    
}
