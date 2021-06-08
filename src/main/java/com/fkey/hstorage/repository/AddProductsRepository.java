package com.fkey.hstorage.repository;

import com.fkey.hstorage.entity.AddProductNode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddProductsRepository extends MongoRepository<AddProductNode, String> {

}
