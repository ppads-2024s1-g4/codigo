package com.indicai.indicai.itens.entity;
//import java.util.List;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

//import com.indicai.indicai.avaliacao.Avaliacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter 
@Entity
@Table(name = "itens")
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String pais;
    private int anoLancamento;
    private String urlCapa;

    //@OneToMany(mappedBy = "item")
    //private List<Avaliacao> avaliacoes;
}