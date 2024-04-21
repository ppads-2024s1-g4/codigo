package com.indicai.indicai.itens.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
    @Id 
    @GeneratedValue
    private long id;
    private String titulo;
    private String pais;
    private String anoLancamento;
}
