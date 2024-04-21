package com.indicai.indicai.avaliacao;

import java.util.List;

import com.indicai.indicai.comentario.Comentario;
import com.indicai.indicai.itens.entity.Filme;
import com.indicai.indicai.itens.entity.Livro;
import com.indicai.indicai.itens.entity.Serie;
import com.indicai.indicai.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	@OneToMany(mappedBy = "avaliacao")
	private List<Comentario> comentarios;

    @ManyToOne
    //@JoinColumn(name = "filme_id")
    private Filme filme;

    @ManyToOne
    // @JoinColumn(name = "livro_id")
    private Livro livro;

    @ManyToOne
    // @JoinColumn(name = "serie_id")
    private Serie serie;

	public Avaliacao() {}

	public Avaliacao(Long id, int nota, String comentario, Usuario usuario) {
		this.id = id;
		this.nota = nota;
		this.comentario = comentario;
		this.usuario = usuario;
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

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

}
