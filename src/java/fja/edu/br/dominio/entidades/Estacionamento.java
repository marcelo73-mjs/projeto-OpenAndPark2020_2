package fja.edu.br.dominio.entidades;

import java.util.Date;

public class Estacionamento {

    private int idestacionamento;
    private String nome_estacionamento;
    private Date horarioabertura;
    private Date horariofechamento;
    private String email;
    private String logradouro;
    private int numero;
    private String bloco;
    private String bairro;
    private String cep;

    public Estacionamento() {
    }

    public Estacionamento(int idestacionamento, String nome_estacionamento, Date horarioabertura, Date horariofechamento, String email, String logradouro, int numero, String bloco, String bairro, String cep) {
        this.idestacionamento = idestacionamento;
        this.nome_estacionamento = nome_estacionamento;
        this.horarioabertura = horarioabertura;
        this.horariofechamento = horariofechamento;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bloco = bloco;
        this.bairro = bairro;
        this.cep = cep;
    }

    public Estacionamento(int idestacionamento) {
        this.idestacionamento = idestacionamento;
    }

    public int getIdestacionamento() {
        return idestacionamento;
    }

    public void setIdestacionamento(int idestacionamento) {
        this.idestacionamento = idestacionamento;
    }

    public String getNome_estacionamento() {

        return nome_estacionamento;
    }

    public void setNome_estacionamento(String nome_estacionamento) {
        this.nome_estacionamento = nome_estacionamento;
    }

    public Date getHorarioabertura() {
        return horarioabertura;
    }

    public void setHorarioabertura(Date horarioabertura) {
        this.horarioabertura = horarioabertura;
    }

    public Date getHorariofechamento() {
        return horariofechamento;
    }

    public void setHorariofechamento(Date horariofechamento) {
        this.horariofechamento = horariofechamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
