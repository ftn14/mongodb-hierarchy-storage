package com.fkey.hstorage.controller;

import com.fkey.hstorage.entity.Node;
import com.fkey.hstorage.service.AddProductsService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/additional-products")
@AllArgsConstructor
public class ExternalAddProductsController {

	private final AddProductsService service;

	@GetMapping(path = "/{productCode}")
	ResponseEntity<List<Node>> getAddProducts(
			@PathVariable String productCode,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
	) {
		return ResponseEntity.ok(service.getAddProductsByProductCode(productCode));
	}

}
