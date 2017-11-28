package br.edu.univas.si8.ta.hello.ejb.beans;

import java.util.Date;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import br.edu.univas.si8.ta.hello.ejb.dao.VendaDAO;
import br.edu.univas.si8.ta.hello.ejb.entities.Venda;
import br.edu.univas.si8.ta.hello.ejb.interfaces.ShoppingLocal;
import br.edu.univas.si8.ta.hello.ejb.interfaces.ShoppingRemote;

@Stateless
@Local(ShoppingLocal.class)
@Remote(ShoppingRemote.class)

public class ShoppingBean implements ShoppingLocal, ShoppingRemote {
	
	@EJB
	private VendaDAO dao;

	@Override
	public void createNewVenda(String vendaDescription) {
		Venda venda = new Venda();
		venda.setDescription(vendaDescription);
		venda.setDate(new Date());
		dao.insert(venda);
		
	}

	@Override
	public String[] listVendaDescription() {
		return dao.listAll()
				.stream()
				.map(Venda::getDescription)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
