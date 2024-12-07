package com.absjrdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
