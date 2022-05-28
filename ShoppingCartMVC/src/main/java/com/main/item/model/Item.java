package com.main.item.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Component
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;	
	private double price;
	
	private String type;
	
	public Item(int id,String name, double price) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		
	}
	public Item(int id,String name, double price, String type) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		
		this.type=type;
	}
	
	public Item(String name,double price) {
		super();
		this.name = name;
		this.price = price;
		
	}
	
	
	public Item(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price  + ", type="
				+ type + "]";
	}

	
	
	
}
