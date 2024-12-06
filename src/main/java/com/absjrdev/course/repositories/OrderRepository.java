package com.absjrdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
