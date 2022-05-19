package com.main.cart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.main.item.model.Item;

import lombok.Data;

@Data
@Component
public class Cart {

	private List<Item> list;

	public Cart() {
		super();
		list = new ArrayList<Item>();
	}

	public void removeItemByName(String name) {
		for (int i = 0; i < list.size(); i++) {

			if (name.equals(list.get(i).getName())) {
				list.remove(i);
			}
		}
	}

	public void removeItem(Item item) {
		for (int i = 0; i < list.size(); i++) {

			if(item.equals(list.get(i))) {
				list.remove(i);
			}
		}
	}

	public void addItem(Item item) {

		list.add(item);
	}
	
	public int getSize() {
		return this.list.size();
	}
	
	@Override
	public String toString() {
		return this.getSize() + " items in cart";
	}
}
