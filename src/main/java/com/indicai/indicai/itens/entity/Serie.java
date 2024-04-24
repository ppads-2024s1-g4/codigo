package com.indicai.indicai.itens.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="series")
public class Serie extends Item{
    private String diretor;
    private String elencoPrincipal;
    private int numeroTemporadas;

	public Serie (){
		super();

	}

	public Serie(Long id, String titulo, String pais, int anoLancamento, String diretor, String elencoPrincipal,
			int numeroTemporadas) {
		super(id, titulo, pais, anoLancamento);
		this.diretor = diretor;
		this.elencoPrincipal = elencoPrincipal;
		this.numeroTemporadas = numeroTemporadas;
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

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	
	

    
}
