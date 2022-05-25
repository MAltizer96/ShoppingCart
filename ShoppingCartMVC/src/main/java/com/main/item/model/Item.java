package com.main.item.model;

import java.util.Objects;

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
	private double totalPrice;
	private double weight;
	private String type;
	
	public Item(int id,String name, double price, double weight) {
		super();
		this.id=id;
		this.name = name;
		this.totalPrice = price;
		this.weight = weight;
	}
	public Item(int id,String name, double price, double weight, String type) {
		super();
		this.id=id;
		this.name = name;
		this.totalPrice = price;
		this.weight = weight;
		this.type=type;
	}
	
	public Item(String name,double price, double weight) {
		super();
		this.name = name;
		this.totalPrice = price;
		this.weight = weight;
	}
	
	
	public Item(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", totalPrice=" + totalPrice + ", weight=" + weight + ", type="
				+ type + "]";
	}

	
	
	
}
