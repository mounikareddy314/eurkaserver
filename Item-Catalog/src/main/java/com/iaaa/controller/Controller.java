package com.iaaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	
	@RequestMapping(value ="/name")
	public String itemcatalog() {
		return "Item Catalog Running with 8088";
	}



	}

	
	

