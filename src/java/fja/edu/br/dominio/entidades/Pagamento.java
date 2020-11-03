
package fja.edu.br.dominio.entidades;


public class Pagamento {
    private int idpagamento;
    private String tipopagamento;
    private String numerocartao;
    private Cliente cliente;
    private int codseguranca;

    public Pagamento() {
    }

    public Pagamento(int idpagamento, String tipopagamento, String numerocartao, Cliente cliente, int codseguranca) {
        this.idpagamento = idpagamento;
        this.tipopagamento = tipopagamento;
        this.numerocartao = numerocartao;
        this.cliente = cliente;
        this.codseguranca = codseguranca;
    }

    public Pagamento(int idpagamento) {
        this.idpagamento = idpagamento;
    }

    public int getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(int idpagamento) {
        this.idpagamento = idpagamento;
    }

    public String getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(String tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodseguranca() {
        return codseguranca;
    }

    public void setCodseguranca(int codseguranca) {
        this.codseguranca = codseguranca;
    }
    
    
    
    
}
