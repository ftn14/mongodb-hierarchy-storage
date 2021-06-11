package com.fkey.hstorage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
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

	private int treeId; // maybe rootCode?

	private int level;

	private List<String> productCodes;

	private String code;

	private String parentCode;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

}
