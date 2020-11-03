
package fja.edu.br.dominio.entidades;


public class Telefone {
    private int idtelefone;
    private String ddd;
    private String numerotelefone;
    private String tipo_telefone;
    private Cliente cliente;
    private Estacionamento estacionamento;
    private ProprietarioEstacionamento proprietario;

    public Telefone() {
    }

    public Telefone(int idtelefone, String ddd, String numerotelefone, String tipo_telefone, Cliente cliente, Estacionamento estacionamento, ProprietarioEstacionamento proprietario) {
        this.idtelefone = idtelefone;
        this.ddd = ddd;
        this.numerotelefone = numerotelefone;
        this.tipo_telefone = tipo_telefone;
        this.cliente = cliente;
        this.estacionamento = estacionamento;
        this.proprietario = proprietario;
    }
    

 

    public Telefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }

    public int getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumerotelefone() {
        return numerotelefone;
    }

    public void setNumerotelefone(String numerotelefone) {
        this.numerotelefone = numerotelefone;
    }

    public String getTipo_telefone() {
        return tipo_telefone;
    }

    public void setTipo_telefone(String tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public ProprietarioEstacionamento getProprietario() {
        return proprietario;
    }

    public void setProprietario(ProprietarioEstacionamento proprietario) {
        this.proprietario = proprietario;
    }

   
    
}
