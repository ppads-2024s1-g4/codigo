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

    public Item(){

    }

    public Item(long id, String titulo, String pais, String anoLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.pais = pais;
        this.anoLancamento = anoLancamento;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", titulo=" + titulo + ", pais=" + pais + ", anoLancamento=" + anoLancamento + "]";
    }

    

}
