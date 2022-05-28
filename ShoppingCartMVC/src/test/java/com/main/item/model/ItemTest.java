package com.main.item.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	Item item = null;
	@BeforeEach
	void setUp() throws Exception {
		item = new Item(1,"testItem",1.12345);
	}

	@Test
	void getPriceTest() {
		assertEquals(1.12,item.getPrice());
	}

}
