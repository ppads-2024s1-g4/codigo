package com.indicai.indicai.itens.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="filmes")
public class Filme{
    @Id 
    @GeneratedValue
    private long id;
    private String titulo;
    private String pais;
    private int anoLancamento;
    private String diretor;
    private String elencoPrincipal;

    public Filme() {
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

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
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

	public Filme(long id, String titulo, String pais, int anoLancamento, String diretor, String elencoPrincipal) {
		this.id = id;
		this.titulo = titulo;
		this.pais = pais;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.elencoPrincipal = elencoPrincipal;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", pais=" + pais + ", anoLancamento=" + anoLancamento
				+ ", diretor=" + diretor + ", elencoPrincipal=" + elencoPrincipal + "]";
	}

}
