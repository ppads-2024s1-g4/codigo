package com.indicai.indicai.itens.entity;
import java.util.List;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import com.indicai.indicai.avaliacao.Avaliacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "itens")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String pais;
    private int anoLancamento;

    @OneToMany(mappedBy = "item")
    private List<Avaliacao> avaliacoes;

    public Item(){

    }

    public Item(Long id, String titulo, String pais, int anoLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.pais = pais;
        this.anoLancamento = anoLancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}