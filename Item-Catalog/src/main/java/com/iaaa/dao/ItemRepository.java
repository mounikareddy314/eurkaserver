package com.iaaa.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iaaa.model.Item;

@Repository
public interface ItemRepository  extends  MongoRepository<Item, Long>{

}
