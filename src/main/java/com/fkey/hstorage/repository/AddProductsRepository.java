package com.fkey.hstorage.repository;

import com.fkey.hstorage.entity.Node;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddProductsRepository extends MongoRepository<Node, String> {

	// Optional<List<Node>> findDistinctByClassCode(String classCode);
	Optional<List<Node>> findByTreeIdAndLevelGreaterThanEqual(int treeId, int level);
}
