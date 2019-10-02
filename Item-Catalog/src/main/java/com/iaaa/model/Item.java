package com.iaaa.model;

import lombok.Data;

@Data
public class Item {
	
	 public Item(String name) {
	        this.name = name;
	    }

	    
	    private Long id;

	    private String name;
	
	
}
