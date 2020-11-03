
package fja.edu.br.dominio.entidades;


public class ModeloVeiculo {
    private int idmodelo;
    private String anofabricacao;
    private String descricao;

    public ModeloVeiculo() {
    }

    public ModeloVeiculo(int idmodelo, String anofabricacao, String descricao) {
        this.idmodelo = idmodelo;
        this.anofabricacao = anofabricacao;
        this.descricao = descricao;
    }

    public ModeloVeiculo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(String anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
