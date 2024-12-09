package com.absjrdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.course.entities.OrderItem;
import com.absjrdev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK>{

}
