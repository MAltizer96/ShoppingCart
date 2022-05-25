package com.main.cart.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.item.model.Item;

class CartTest {

	Cart cart = null;
	@BeforeEach
	void setUp() throws Exception {

		cart = new Cart();
		cart.addItem(new Item(1,"Soup", 0.99, 0.2,"canned goods"));
		cart.addItem(new Item(1,"Soup", 0.99, 0.2,"canned goods"));
		cart.addItem(new Item(1,"Soup", 0.99, 0.2,"canned goods"));
		cart.addItem(new Item(2,"Candy", 1.99, 1,"snacks"));
		cart.addItem(new Item(2,"Candy", 1.99, 1,"snacks"));
		cart.addItem(new Item(3,"Onion", 5.99, 5,"vegetabel"));
	}

	@Test
	void getTotalNumberOfCertainItemInCartTest() {
		assertEquals(2, cart.getTotalNumberOfCertainItemInCart(new Item(2,"Candy", 1.99, 1,"snacks")));
	}
	
	@Test
	void itemsInListNoRepeatTest() {
		
		assertEquals(3,cart.getItemsInListNoRepeat().size());
	}

}
