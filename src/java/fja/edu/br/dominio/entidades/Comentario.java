
package fja.edu.br.dominio.entidades;

import java.util.Date;


public class Comentario {
    private int idcomentario;
    private  Cliente cliente;
    private String mensagem;
    private Date datamensagem;
    private int numestrela;
  

    public Comentario() {
    }

    public Comentario(int idcomentario, Cliente cliente, String mensagem, Date datamensagem, int numestrela) {
        this.idcomentario = idcomentario;
        this.cliente = cliente;
        this.mensagem = mensagem;
        this.datamensagem = datamensagem;
        this.numestrela = numestrela;
    }

   

    public Comentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDatamensagem() {
        return datamensagem;
    }

    public void setDatamensagem(Date datamensagem) {
        this.datamensagem = datamensagem;
    }

    public int getNumestrela() {
        return numestrela;
    }

    public void setNumestrela(int numestrela) {
        this.numestrela = numestrela;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
            
    
    
}
