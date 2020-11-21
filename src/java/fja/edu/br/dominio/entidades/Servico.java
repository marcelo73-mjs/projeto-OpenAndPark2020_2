
package fja.edu.br.dominio.entidades;


public class Servico {
    private int idservico;
    private String nomeservico;
    private String tiposervico;

    public Servico() {
    }

    public Servico(int idservico, String nomeservico, String tiposervico) {
        this.idservico = idservico;
        this.nomeservico = nomeservico;
        this.tiposervico = tiposervico;
    }

    public Servico(int idservico) {
        this.idservico = idservico;
    }

    public int getIdservico() {
        return idservico;
    }

    public void setIdservico(int idservico) {
        this.idservico = idservico;
    }

    public String getNomeservico() {
        return nomeservico;
    }

    public void setNomeservico(String nomeservico) {
        this.nomeservico = nomeservico;
    }

    public String getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(String tiposervico) {
        this.tiposervico = tiposervico;
    }
    
    
    
}
