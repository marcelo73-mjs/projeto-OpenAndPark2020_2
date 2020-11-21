
package fja.edu.br.dominio.entidades;


public class Cidade {
    private int idcidade;
    private Estacionamento estacionemanto;
    private String cidade;
    private String UF;

    public Cidade() {
    }

    public Cidade(int idcidade, Estacionamento estacionemanto, String cidade, String UF) {
        this.idcidade = idcidade;
        this.estacionemanto = estacionemanto;
        this.cidade = cidade;
        this.UF = UF;
    }

    public Cidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public Estacionamento getEstacionemanto() {
        return estacionemanto;
    }

    public void setEstacionemanto(Estacionamento estacionemanto) {
        this.estacionemanto = estacionemanto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
    
    
}
