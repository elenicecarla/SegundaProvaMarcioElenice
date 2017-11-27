package br.edu.univas.si8.ta.hello.ejb.interfaces;

import java.util.Date;

public interface Shopping {
	
	void createNewVenda(String vendaDescription, Date date);
	String[] listVendaDescription();
}
