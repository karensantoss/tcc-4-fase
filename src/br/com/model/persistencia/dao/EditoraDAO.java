
package br.com.model.persistencia.dao;

import br.com.model.Editora;
import java.util.List;


public interface EditoraDAO extends DAO <Editora, Integer> {
    
    public List<Editora>getByNome(String Nome);
    
}
