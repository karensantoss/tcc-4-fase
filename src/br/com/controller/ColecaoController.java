

package br.com.controller;

import br.com.model.Colecao;
import br.com.model.persistencia.dao.ColecaoDAO;
import br.com.model.persistencia.jpa.ColecaoDAOJPA;
import java.util.List;


public class ColecaoController {

    public Colecao pesquisarCodigo(int codigo) {
        ColecaoDAO dao = new ColecaoDAOJPA();
        return dao.getById(Colecao.class, codigo);
    }

    public Colecao salvar(Colecao a) {
        ColecaoDAO dao = new ColecaoDAOJPA();
        return dao.save(a);
    }
    
    public List<Colecao> ListarColecao() {
        ColecaoDAO dao = new ColecaoDAOJPA();
        return dao.getAll(Colecao.class);
    }
    
    public boolean remover(int codigo) {
        ColecaoDAO dao = new ColecaoDAOJPA();
        return dao.remove(Colecao.class, codigo);
    }
    
    public List<Colecao> PesquisarColecaoNome(String Nome) {
        ColecaoDAO dao = new ColecaoDAOJPA();
        return dao.getByNome(Nome);
    }
    
    
}
