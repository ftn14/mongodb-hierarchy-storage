package com.fkey.hstorage.repository;

import com.fkey.hstorage.entity.Node;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddProductsRepository extends MongoRepository<Node, String> {

}
