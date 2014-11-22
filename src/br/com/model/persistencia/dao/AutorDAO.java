
package br.com.model.persistencia.dao;

import br.com.model.Autor;
import java.util.List;


public interface AutorDAO extends DAO <Autor, Integer> {
    
    public List<Autor>getByNome(String Nome);
    
}
