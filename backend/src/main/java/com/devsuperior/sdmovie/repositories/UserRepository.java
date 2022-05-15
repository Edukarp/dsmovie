package com.devsuperior.sdmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sdmovie.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByEmail(String email);
}
