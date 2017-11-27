package br.edu.univas.si8.ta.hello.ejb.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "shopping_order")
@SequenceGenerator(name = "seq_shopping_order",
					sequenceName = "seq_shopping_order",
					allocationSize = 1)
public class Venda {
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String description;
	private Date date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return new Date();
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
