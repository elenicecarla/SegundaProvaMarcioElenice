package br.edu.univas.si8.ta.hello.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import br.edu.univas.si8.ta.hello.ejb.interfaces.Shopping;
import br.edu.univas.si8.ta.hello.rest.api.ShoppingService;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService{
	@EJB(mappedName = "")
	private Shopping shopping;
}

