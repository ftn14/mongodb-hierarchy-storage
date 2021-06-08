package com.fkey.hstorage.repository;

import com.fkey.hstorage.entity.AddProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddProductsRepository extends MongoRepository<AddProduct, String> {

}
