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
    private String diretor;
    private String elencoPrincipal;
    //private String pais;
    //private String anoLancamento;

    public Filme() {
    }

    public Filme(String diretor, String elencoPrincipal, long id, String titulo, String pais, String anoLancamento) {
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

    

    
 
}
