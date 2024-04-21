package com.indicai.indicai.itens.entity;

import java.util.List;

import com.indicai.indicai.avaliacao.Avaliacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="livros")
public class Livro {
    @Id 
    @GeneratedValue
    private long id;
    private String titulo;
    private String pais;
    private int anoLancamento;
    private String autores;
    private String editora;

    @OneToMany(mappedBy = "livro")
    private List<Avaliacao> avaliacoes;
    
    public Livro(){

    }

	public Livro(long id, String titulo, String pais, int anoLancamento, String autores, String editora) {
		this.id = id;
		this.titulo = titulo;
		this.pais = pais;
		this.anoLancamento = anoLancamento;
		this.autores = autores;
		this.editora = editora;
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

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", pais=" + pais + ", anoLancamento=" + anoLancamento
				+ ", autores=" + autores + ", editora=" + editora + ", avaliacoes=" + avaliacoes + "]";
	}

    

}
