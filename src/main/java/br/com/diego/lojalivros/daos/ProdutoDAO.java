package br.com.diego.lojalivros.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.diego.lojalivros.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	@PersistenceContext
    private EntityManager manager;

    public void gravar(Produto produto){
        manager.persist(produto);
    }
}
