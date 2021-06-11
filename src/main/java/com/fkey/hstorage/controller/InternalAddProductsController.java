package com.fkey.hstorage.controller;

import com.fkey.hstorage.entity.Node;
import com.fkey.hstorage.service.AddProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/additional-products")
@AllArgsConstructor
public class InternalAddProductsController {

	private final AddProductsService service;

	@GetMapping(path = "/tree/{id}")
	ResponseEntity<List<Node>> getTree(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getAddProductsByTreeId(id));
	}

	// TODO: get specific lvl
}
