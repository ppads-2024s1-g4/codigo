package com.indicai.indicai.avaliacao;

import com.indicai.indicai.itens.entity.Item;
import com.indicai.indicai.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter 
@Entity
@Table(name="avaliacoes")
public class Avaliacao {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nota;
    private String comentario;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Item item;

}