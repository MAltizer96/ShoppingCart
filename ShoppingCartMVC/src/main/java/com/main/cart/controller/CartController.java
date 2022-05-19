package com.main.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.cart.model.Cart;
import com.main.item.model.Item;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	Cart cart;
	
	@RequestMapping("/addToCart")
	public String addItemToCart(@ModelAttribute Item item) {
		cart.addItem(item);
		System.out.println(cart.getList().size());
		System.out.println("method ran");
		return "redirect:/item/";
	}
	
}
