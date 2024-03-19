package com.indicai.indicai.itens.repository;

import java.util.List;
import com.indicai.indicai.itens.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    List<Filme> findByTituloStartingWith(String texto);
    
  }