package com.indicai.indicai.avaliacao;

import com.indicai.indicai.itens.entity.Filme;
import com.indicai.indicai.itens.entity.Livro;
import com.indicai.indicai.itens.entity.Serie;
import com.indicai.indicai.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="avaliacoes")
public class Avaliacao {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nota;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

	public Avaliacao(Long id, int nota, String comentario, Usuario usuario, Filme filme, Livro livro, Serie serie) {
		this.id = id;
		this.nota = nota;
		this.comentario = comentario;
		this.usuario = usuario;
		this.filme = filme;
		this.livro = livro;
		this.serie = serie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "Avaliacao [id=" + id + ", nota=" + nota + ", comentario=" + comentario + ", usuario=" + usuario
				+ ", filme=" + filme + ", livro=" + livro + ", serie=" + serie + "]";
	}

}
