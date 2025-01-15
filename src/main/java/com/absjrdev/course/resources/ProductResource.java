package com.absjrdev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absjrdev.course.entities.Product;
import com.absjrdev.course.services.ProductService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService ProductService;

	@Operation(summary = "Gets all Product in the database")
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = ProductService.findAll();
		return ResponseEntity.ok().body(list);
	}	
	
	@Operation(summary = "Get Product by id in the database")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product Product = ProductService.findById(id);
		return ResponseEntity.ok().body(Product);
	}

}
