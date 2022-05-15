package com.devsuperior.sdmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sdmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{
	
}
