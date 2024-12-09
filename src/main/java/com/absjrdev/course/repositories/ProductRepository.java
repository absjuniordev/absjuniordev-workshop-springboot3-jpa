package com.absjrdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
