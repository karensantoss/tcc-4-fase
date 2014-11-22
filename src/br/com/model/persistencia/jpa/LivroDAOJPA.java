
package br.com.model.persistencia.jpa;

import br.com.model.Livro;
import br.com.model.persistencia.dao.LivroDAO;
import java.util.List;

public class LivroDAOJPA  extends DAOJPA <Livro, Integer> implements LivroDAO {


    @Override
    public List<Livro> getByTitulo(String Titulo) {
return getEntityManager().createQuery("select x from Livro x where x.titulo like '%" + Titulo + "%'").getResultList();
    }
    
}
