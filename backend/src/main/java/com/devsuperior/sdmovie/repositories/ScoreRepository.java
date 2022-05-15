package com.devsuperior.sdmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sdmovie.entities.Score;
import com.devsuperior.sdmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
