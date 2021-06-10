package com.fkey.hstorage.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "additional-products")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Node {
	@Id
	private String id;

	// private int nodeId;

	private String classId;

	private String parentId; // multiple?

	private UUID testUuid;
}
