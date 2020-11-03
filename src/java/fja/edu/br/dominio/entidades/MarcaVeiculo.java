
package fja.edu.br.dominio.entidades;


public class MarcaVeiculo {
    private int idmarca;
    private String nomefabricante;
    private String nomemarca;

    public MarcaVeiculo() {
    }

    public MarcaVeiculo(int idmarca, String nomefabricante, String nomemarca) {
        this.idmarca = idmarca;
        this.nomefabricante = nomefabricante;
        this.nomemarca = nomemarca;
    }

    public MarcaVeiculo(int idmarca) {
        this.idmarca = idmarca;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNomefabricante() {
        return nomefabricante;
    }

    public void setNomefabricante(String nomefabricante) {
        this.nomefabricante = nomefabricante;
    }

    public String getNomemarca() {
        return nomemarca;
    }

    public void setNomemarca(String nomemarca) {
        this.nomemarca = nomemarca;
    }
    
    
    
}
