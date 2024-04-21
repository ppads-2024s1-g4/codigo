package com.indicai.indicai.itens.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="filmes")
public class Filme extends Item {
    @Id 
    @GeneratedValue
    //private long id;
    //private String titulo;
    //private String pais;
    //private int anoLancamento;
    private String diretor;
    private String elencoPrincipal;

    public Filme() {
    }

    public Filme(long id, String titulo, String pais, String anoLancamento, String diretor, String elencoPrincipal) {
        super(id, titulo, pais, anoLancamento);
        this.diretor = diretor;
        this.elencoPrincipal = elencoPrincipal;
    }

    

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElencoPrincipal() {
        return elencoPrincipal;
    }

    public void setElencoPrincipal(String elencoPrincipal) {
        this.elencoPrincipal = elencoPrincipal;
    }

    @Override
    public String toString() {
        return "Filme[" +
                "id=" + getId() +
                ", titulo='" + getTitulo() +
                ", pais='" + getPais() +
                ", anoLancamento='" + getAnoLancamento() +
                ", diretor='" + diretor +
                ", elencoPrincipal='" + elencoPrincipal +
                "]";
    }

}
