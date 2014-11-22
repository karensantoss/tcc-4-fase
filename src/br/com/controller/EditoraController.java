

package br.com.controller;

import br.com.model.Editora;
import br.com.model.persistencia.dao.EditoraDAO;
import br.com.model.persistencia.jpa.EditoraDAOJPA;
import java.util.List;


public class EditoraController {

    public Editora pesquisarCodigo(int codigo) {
        EditoraDAO dao = new EditoraDAOJPA();
        return dao.getById(Editora.class, codigo);
    }

    public Editora salvar(Editora a) {
        EditoraDAO dao = new EditoraDAOJPA();
        return dao.save(a);
    }
    
    public List<Editora> ListarEditora() {
        EditoraDAO dao = new EditoraDAOJPA();
        return dao.getAll(Editora.class);
    }
    
    public boolean remover(int codigo) {
        EditoraDAO dao = new EditoraDAOJPA();
        return dao.remove(Editora.class, codigo);
    }
    
    public List<Editora> PesquisarEditoraNome(String Nome) {
        EditoraDAO dao = new EditoraDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}
