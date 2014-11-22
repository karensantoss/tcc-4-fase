

package br.com.controller;

import br.com.model.Autor;
import br.com.model.persistencia.dao.AutorDAO;
import br.com.model.persistencia.jpa.AutorDAOJPA;
import java.util.List;


public class AutorController {

    public Autor pesquisarCodigo(int codigo) {
        AutorDAO dao = new AutorDAOJPA();
        return dao.getById(Autor.class, codigo);
    }

    public Autor salvar(Autor a) {
        AutorDAO dao = new AutorDAOJPA();
        return dao.save(a);
    }
    
    public List<Autor> ListarAutor() {
        AutorDAO dao = new AutorDAOJPA();
        return dao.getAll(Autor.class);
    }
    
    public boolean remover(int codigo) {
        AutorDAO dao = new AutorDAOJPA();
        return dao.remove(Autor.class, codigo);
    }
    
    public List<Autor> PesquisarAutorNome(String Nome) {
        AutorDAO dao = new AutorDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}
