package com.main.item.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNum;
	public String name;
	public int costDollars;
	public int costChange;
	public int weight;
	
	
	public Item(String name, int costDollars, int costChange, int weight) {
		super();
		this.name = name;
		this.costDollars = costDollars;
		this.costChange = costChange;
		this.weight = weight;
	}
	
	public double getCost() {
		String string = costDollars + "." + costChange;
		double value = Double.parseDouble(string);
		return value;
	}
}
