package com.main.item.model;

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
	
	
	public Item(String name, int costDollars, int costChange, int weight) {
		super();
		this.name = name;
		this.costDollars = costDollars;
		this.costChange = costChange;
		this.weight = weight;
	}
	
	//takes the set variables for the cost as a dollar and cost of change and sets it to the total cost
	public void setTotalCost() {
		String string = costDollars + "." + costChange;
		double value = Double.parseDouble(string);
		totalCost = value;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object != Item.class) {
			return false;
		}
		
		Item compareItem = (Item)object;
		if(this.getName().equals(compareItem.name)&&
		   this.getTotalCost() == compareItem.getTotalCost()&&
		   this.getType().equals(compareItem.getType())&&
		   this.getWeight() == compareItem.getWeight()
				) {
			
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", totalCost=" + totalCost + ", weight=" + weight + ", type="
				+ type + "]";
	}
	
	
}
