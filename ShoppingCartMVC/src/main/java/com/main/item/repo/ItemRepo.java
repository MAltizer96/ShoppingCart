package com.main.item.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.item.model.Item;

public interface ItemRepo extends JpaRepository<Item,Integer> {

}
