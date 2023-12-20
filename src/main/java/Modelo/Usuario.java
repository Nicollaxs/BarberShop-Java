package Modelo;

import javax.persistence.Entity;

@Entity
public class Usuario extends Pessoa {

    private String senha;
    private String nivelDeAcesso;

    public Usuario() {
        super("nome");
    }

    public Usuario(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }

    public Usuario(String nome, String sexo, String dataNascimento, String telefone, String email, String rg,
            String senha, String nivelDeAcesso) {
        super(nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

}
