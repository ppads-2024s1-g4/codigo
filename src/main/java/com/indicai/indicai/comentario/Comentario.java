package com.indicai.indicai.comentario;

import com.indicai.indicai.avaliacao.Avaliacao;
import com.indicai.indicai.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="comentarios")
public class Comentario {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String conteudo;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Avaliacao avaliacao;

    public Comentario(Long id, String conteudo, Usuario usuario, Avaliacao avaliacao) {
        this.id = id;
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

}