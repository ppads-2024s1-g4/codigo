package com.indicai.indicai.avaliacao;

import com.indicai.indicai.itens.entity.Item;
import com.indicai.indicai.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private Usuario usuario;

    @ManyToOne
    private Item item;

	public Avaliacao() {}

	public Avaliacao(Long id, int nota, String comentario) {
		this.id = id;
		this.nota = nota;
		this.comentario = comentario;
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
