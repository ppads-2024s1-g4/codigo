package com.indicai.indicai.itens.repository;

import com.indicai.indicai.itens.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
  
}