package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int id;
    private String cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String hora;
    private String observacao;

    public Agendamento(String cliente, Servico servico, float valor, String data, String hora, String observacao) {
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.observacao = observacao;

        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
