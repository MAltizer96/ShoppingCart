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
		cart.addItem(new Item("Soup", 0, 99, 0.2));
		cart.addItem(new Item("Soup", 0, 99, 0.2));
		cart.addItem(new Item("Soup", 0, 99, 0.2));
		cart.addItem(new Item("Candy", 1, 99, 1));
		cart.addItem(new Item("Candy", 1, 99, 1));
		cart.addItem(new Item("Onion", 5, 99, 5));
	}

	@Test
	void totalNumberOfCertainItemInCartTest() {
		assertEquals(2, cart.totalNumberOfCertainItemInCart(new Item("Candy", 1, 99, 1)));
	}
	
	@Test
	void itemsInListNoRepeatTest() {
		assertEquals(3,cart.itemsInListNoRepeat().size());
	}

}
