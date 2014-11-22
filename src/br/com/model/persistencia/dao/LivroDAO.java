

package br.com.model.persistencia.dao;

import br.com.model.Livro;
import java.util.List;


public interface LivroDAO extends DAO <Livro, Integer>{
    
    public List<Livro> getByTitulo(String Titulo);
    
}
