
package fja.edu.br.dominio.entidades;


public class Preco {
    private int idpreco;
    private String tipovalor;
    private float valor;
    private String descricao;
    private Estacionamento estacionamento;

    public Preco() {
    }

    public Preco(int idpreco, String tipovalor, float valor, String descricao, Estacionamento estacionamento) {
        this.idpreco = idpreco;
        this.tipovalor = tipovalor;
        this.valor = valor;
        this.descricao = descricao;
        this.estacionamento = estacionamento;
    }

    public Preco(int idpreco) {
        this.idpreco = idpreco;
    }

    public int getIdpreco() {
        return idpreco;
    }

    public void setIdpreco(int idpreco) {
        this.idpreco = idpreco;
    }

    public String getTipovalor() {
        return tipovalor;
    }

    public void setTipovalor(String tipovalor) {
        this.tipovalor = tipovalor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }
    
    
    
}
