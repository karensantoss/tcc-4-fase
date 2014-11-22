

package br.com.controller;

import br.com.model.Livro;
import br.com.model.persistencia.dao.LivroDAO;
import br.com.model.persistencia.jpa.LivroDAOJPA;
import java.util.List;

public class LivroController {
    
    public Livro salvar(Livro li) {
        LivroDAO dao = new LivroDAOJPA();
        return dao.save(li);
    }
   
    public List<Livro> ListarLivro() {
        LivroDAO dao = new LivroDAOJPA();
        return dao.getAll(Livro.class);

    }
    public Livro pesquisarCodigo (int codigo) {
        LivroDAO dao = new LivroDAOJPA();
        return dao.getById(Livro.class, codigo);
    
    }

    public boolean remover(int codigo) {
        LivroDAO dao = new LivroDAOJPA();
        return dao.remove(Livro.class, codigo);
    }

    public List<Livro> PesquisarLivroTitulo(String Titulo) {
        LivroDAO dao = new LivroDAOJPA();
        return dao.getByTitulo(Titulo);
    }
    }
    

