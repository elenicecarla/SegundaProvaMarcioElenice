package br.edu.univas.si8.ta.hello.rest.impl;

import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import br.edu.univas.si8.ta.hello.ejb.interfaces.Shopping;
import br.edu.univas.si8.ta.hello.rest.api.ShoppingService;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService{
	@EJB(mappedName = "java:app/hello-rest-ejb-0.1-SNAPSHOT/ShoppingBean!br.edu.univas.si8.ta.hello.ejb.interfaces.ShoppingRemote")
	private Shopping shopping;

	@Override
	public String[] listVendasDescription() {
		return shopping.listVendaDescription();
	}

	@Override
	public String saveNewVenda(String description, Date date) {
		shopping.createNewVenda(description, date);
		return "{\"message\": \"Success\"}";
	}


}

