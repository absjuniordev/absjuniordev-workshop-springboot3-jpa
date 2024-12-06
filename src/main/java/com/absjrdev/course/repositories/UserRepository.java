package com.absjrdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
