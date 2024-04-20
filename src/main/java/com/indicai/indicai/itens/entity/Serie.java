package com.indicai.indicai.itens.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="series")
public class Serie {

    @Id 
    @GeneratedValue
    private long id;
    private String titulo;
    private String diretor;
    private String elencoPrincipal;
    private String pais;
    private int anoLancamento;
    private int numeroTemporadas;

    public Serie(long id, String titulo, String diretor, String elencoPrincipal, String pais, int anoLancamento,
            int numeroTemporadas) {
        this.id = id;
        this.titulo = titulo;
        this.diretor = diretor;
        this.elencoPrincipal = elencoPrincipal;
        this.pais = pais;
        this.anoLancamento = anoLancamento;
        this.numeroTemporadas = numeroTemporadas;
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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "Serie [id=" + id + ", titulo=" + titulo + ", diretor=" + diretor + ", elencoPrincipal="
                + elencoPrincipal + ", pais=" + pais + ", anoLancamento=" + anoLancamento + ", numeroTemporadas="
                + numeroTemporadas + "]";
    }

}
