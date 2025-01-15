package com.absjrdev.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absjrdev.course.entities.Order;
import com.absjrdev.course.services.OrderService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/orders")
public class OrderResource {
	
	@Autowired
	private OrderService OrderService;
	
	@Operation(summary = "Gets all Orders in the database")
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = OrderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@Operation(summary = "Get Order by id in the database")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = OrderService.findById(id);
		return ResponseEntity.ok().body(order);
	}

}
