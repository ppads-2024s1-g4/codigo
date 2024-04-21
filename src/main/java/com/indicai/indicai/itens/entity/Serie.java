package com.indicai.indicai.itens.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import com.indicai.indicai.avaliacao.Avaliacao;

@Entity
@Table(name="series")
public class Serie{

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String pais;
    private int anoLancamento;
    private String diretor;
    private String elencoPrincipal;
    private int numeroTemporadas;

    @OneToMany(mappedBy = "serie")
    private List<Avaliacao> avaliacoes;
    
    public Serie(){

    }

	public Serie(long id, String titulo, String pais, int anoLancamento, String diretor, String elencoPrincipal,
			int numeroTemporadas) {
		this.id = id;
		this.titulo = titulo;
		this.pais = pais;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.elencoPrincipal = elencoPrincipal;
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

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
	public String toString() {
		return "Serie [id=" + id + ", titulo=" + titulo + ", pais=" + pais + ", anoLancamento=" + anoLancamento
				+ ", diretor=" + diretor + ", elencoPrincipal=" + elencoPrincipal + ", numeroTemporadas="
				+ numeroTemporadas + ", avaliacoes=" + avaliacoes + "]";
	}

    

}
