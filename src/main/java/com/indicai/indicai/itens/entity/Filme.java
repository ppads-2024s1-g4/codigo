package com.indicai.indicai.itens.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="filmes")
public class Filme extends Item{
	
    private String diretor;
    private String elencoPrincipal;

	public Filme(){
		super();

	}

	public Filme(Long id, String titulo, String pais, int anoLancamento, String diretor, String elencoPrincipal) {
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