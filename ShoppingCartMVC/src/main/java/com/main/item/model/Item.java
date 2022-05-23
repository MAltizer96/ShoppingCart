package com.main.item.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int costDollars;
	private int costChange;
	private double totalCost;
	private double weight;
	private String type;
	
	
	public Item(String name, int costDollars, int costChange, double weight) {
		super();
		this.name = name;
		this.costDollars = costDollars;
		this.costChange = costChange;
		this.weight = weight;
	}
	
	public Item(String name) {
		super();
		this.name = name;
	}
	
	//takes the set variables for the cost as a dollar and cost of change and sets it to the total cost
	public void setTotalCost() {
		String string = costDollars + "." + costChange;
		double value = Double.parseDouble(string);
		totalCost = value;
	}
	
	

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", totalCost=" + totalCost + ", weight=" + weight + ", type="
				+ type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return costChange == other.costChange && costDollars == other.costDollars && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(totalCost) == Double.doubleToLongBits(other.totalCost)
				&& Objects.equals(type, other.type)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(costChange, costDollars, id, name, totalCost, type, weight);
	}
	
	
}
