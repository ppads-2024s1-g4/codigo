package com.indicai.indicai.itens.repository;

import com.indicai.indicai.itens.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
  
}