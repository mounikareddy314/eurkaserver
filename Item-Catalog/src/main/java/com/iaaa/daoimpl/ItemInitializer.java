package com.iaaa.daoimpl;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.iaaa.dao.ItemRepository;
import com.iaaa.model.Item;


public class ItemInitializer implements CommandLineRunner{

	@Autowired
    ItemRepository itemRepository;
	
	 ItemInitializer(ItemRepository itemRepository) {
	        this.itemRepository = itemRepository;
	    }
	@Override
	public void run(String... args) throws Exception {
		
		   Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok").forEach(item -> itemRepository.save(new Item(item)));
	                

	        itemRepository.findAll().forEach(System.out::println);
		
	}

}
