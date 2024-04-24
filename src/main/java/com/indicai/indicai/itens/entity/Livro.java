package com.indicai.indicai.itens.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="livros")
public class Livro extends Item {
    private String autores;
    private String editora;

	public Livro() {
		super();
	}

	public Livro(Long id, String titulo, String pais, int anoLancamento, String autores, String editora) {
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

	
	
}
