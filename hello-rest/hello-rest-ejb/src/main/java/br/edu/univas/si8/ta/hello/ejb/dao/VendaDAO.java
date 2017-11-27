package br.edu.univas.si8.ta.hello.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.hello.ejb.entities.Venda;


@Stateless
public class VendaDAO {
	@PersistenceContext(unitName = "shopping")
	private EntityManager em;

	public void insert(Venda venda) {
		em.persist(venda);
	}

	public List<Venda> listAll() {
		return em.createQuery("from shopping_order p", Venda.class).getResultList();
	}
}
