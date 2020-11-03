
package fja.edu.br.dominio.entidades;


public class Vaga {
    private int idvaga;
    private int numero;
    private String descricao;

    public Vaga() {
    }

    public Vaga(int idvaga, int numero, String descricao ) {
        this.idvaga = idvaga;
        this.numero = numero;
        this.descricao = descricao;
     
    }



    public Vaga(int idvaga) {
        this.idvaga = idvaga;
    }

    public int getIdvaga() {
        return idvaga;
    }

    public void setIdvaga(int idvaga) {
        this.idvaga = idvaga;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricavaga) {
        this.descricao = descricavaga;
    }


    
    
}
