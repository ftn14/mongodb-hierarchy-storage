package com.fkey.hstorage.changelog;

import com.fkey.hstorage.entity.Node;
import com.fkey.hstorage.repository.AddProductsRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ChangeLog
public class DatabaseChangeLog {
	@ChangeSet(order = "001", id = "test_cl", author = "akubrakov")
	public void seedDatabase(AddProductsRepository repository) {
		List<Node> list = new ArrayList<>();
		list.add(createNode());
		repository.insert(list);
	}

	@ChangeSet(order = "002", id = "test2", author = "ak")
	public void test2(AddProductsRepository repository) {
		List<Node> list = new ArrayList<>();
		list.add(
				Node.builder()
						.classId("123")
						.testUuid(UUID.randomUUID())
						.build()
		);
		repository.insert(list);
	}

	private Node createNode() {
		var node = new Node();
		node.setClassId("CLASSID");
		return node;
	}
	// @ChangeSet(order = "002", id = "create_add_products_collection")
}
