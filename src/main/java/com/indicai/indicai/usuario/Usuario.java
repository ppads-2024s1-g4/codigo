package com.indicai.indicai.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import com.indicai.indicai.avaliacao.Avaliacao;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id 
    @GeneratedValue
    private long id;
    private String username;
    private int anoNascimento;
    private String cidade;
    private String estado;
    private boolean isGerente;

    @OneToMany(mappedBy = "usuario")
    private List<Avaliacao> avaliacoes;


    public Usuario(){

    }

    public Usuario(long id, String username, int anoNascimento, String cidade, String estado) {
        this.id = id;
        this.username = username;
        this.anoNascimento = anoNascimento;
        this.cidade = cidade;
        this.estado = estado;
        this.isGerente = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isGerente() {
        return isGerente;
    }

    public void setGerente(boolean isGerente) {
        this.isGerente = isGerente;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", username=" + username + ", anoNascimento=" + anoNascimento + ", cidade="
                + cidade + ", estado=" + estado + ", isGerente=" + isGerente + "]";
    }

}
