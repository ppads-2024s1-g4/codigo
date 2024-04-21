package com.indicai.indicai.itens.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="livros")
public class Livro extends Item {
    @Id 
    @GeneratedValue
    //private long id;
    //private String titulo;
    //private String pais;
    //private int anoLancamento;
    private String autores;
    private String editora;
    

    public Livro(){

    }

    public Livro(long id, String titulo, String pais, String anoLancamento, String autores, String editora) {
        super(id, titulo, pais, anoLancamento);
        this.autores = autores;
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro[" +
                "id=" + getId() +
                ", titulo=" + getTitulo() +
                ", pais=" + getPais() +
                ", anoLancamento=" + getAnoLancamento() +
                ", autores=" + autores +
                ", editora=" + editora +
                "]";
    }

}
