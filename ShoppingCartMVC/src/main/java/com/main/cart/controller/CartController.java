package com.main.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.cart.model.Cart;
import com.main.item.model.Item;
import com.main.item.repo.ItemRepo;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	Cart cart;		
	@Autowired
	ItemRepo repo;	
	
	
	@RequestMapping("/addToCart/{id}")
	public String addItemToCart(@PathVariable("id") int  id) {
		Item item = repo.getById(id);		
		System.out.println(item);
		cart.addItem(item);
		return "redirect:/item/";
	}
	
	@RequestMapping("/checkOut")
	public ModelAndView goToCheckOut() {
		ModelAndView mav = new ModelAndView("CheckOut");
		mav.addObject("fullCart",cart.getList());
		mav.addObject("condensedCart",cart.getItemsInListNoRepeat());
		mav.addObject("cartPrice",cart.getTotalPrice());
		return mav;
	}
	
}
