package com.main.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.cart.model.Cart;
import com.main.item.model.Item;
import com.main.item.repo.ItemRepo;

@Controller

@RequestMapping("/item")
public class ItemController {
	@Autowired
	ItemRepo repo;
	@Autowired
	Cart cart;
	
	@GetMapping({"/getItems","/"})
	public ModelAndView getItems() {
		ModelAndView mav = new ModelAndView("ItemList");
		mav.addObject("items",repo.findAll());
		mav.addObject("cartSize",cart.toString());
		return mav;
	}
	
	@RequestMapping("/addItem")
	public ModelAndView addItemPage() {
		ModelAndView mav = new ModelAndView("CreateItem");		
		mav.addObject("item",new Item());
		return mav;
	}
	
	@RequestMapping("/saveItem")
	public String addItem(@ModelAttribute Item item) {		
		repo.save(item);		
		return "redirect:addItem";
	}
	
	@RequestMapping("/itemDB")
	public ModelAndView itemDBPage() {
		ModelAndView mav = new ModelAndView("ItemDBDisplay");
		mav.addObject("items",repo.findAll());		
		return mav;
	}
	
	@RequestMapping("/removeItem/{id}")
	public String removeItem(@PathVariable("id") int id) {		
		repo.delete(repo.getById(id));
		return "redirect:/item/itemDB";
	}

}
