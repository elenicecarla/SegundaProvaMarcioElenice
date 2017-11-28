package br.edu.univas.si8.ta.hello.ejb.interfaces;


public interface Shopping {
	
	void createNewVenda(String vendaDescription);
	String[] listVendaDescription();
}
