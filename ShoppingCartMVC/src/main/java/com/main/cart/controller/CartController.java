package com.main.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.cart.model.Cart;
import com.main.item.model.Item;

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
	@RequestMapping("/Test")
	public String test() {
		return "Test";
	}

//	@RequestMapping("/addToCart")
//	public ModelAndView addItemToCart(@ModelAttribute Item item) {
//		ModelAndView mav = new ModelAndView("ItemList");
//		cart.addItem(item);
//		System.out.println(cart.getList().size());
//		System.out.println("method ran");
//		return mav;
//	}
	
}
