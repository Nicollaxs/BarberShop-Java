package Modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente extends Pessoa {

    private String endereco;
    private String cep;

    public Cliente() {
        super("");
    }

    public Cliente(String nome, String endereco, String cep) {
        super(nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(String nome, String sexo, String dataNascimento, String telefone, String email, String rg,
            String endereco, String cep) {
        super(nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
