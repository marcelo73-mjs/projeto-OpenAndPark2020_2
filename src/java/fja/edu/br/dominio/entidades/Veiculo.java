
package fja.edu.br.dominio.entidades;


public class Veiculo {
    private int idveiculo;
    private String placa;
    private String cor;
    private String chassi;
    private Cliente clinte;
    private MarcaVeiculo marca;
    private ModeloVeiculo modelo;

    public Veiculo() {
    }

    public Veiculo(int idveiculo, String placa, String cor, String chassi, Cliente clinte, MarcaVeiculo marca, ModeloVeiculo modelo) {
        this.idveiculo = idveiculo;
        this.placa = placa;
        this.cor = cor;
        this.chassi = chassi;
        this.clinte = clinte;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(int idveiculo) {
        this.idveiculo = idveiculo;
    }

    public int getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(int idveiculo) {
        this.idveiculo = idveiculo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Cliente getClinte() {
        return clinte;
    }

    public void setClinte(Cliente clinte) {
        this.clinte = clinte;
    }

    public MarcaVeiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVeiculo marca) {
        this.marca = marca;
    }

    public ModeloVeiculo getModelo() {
        return modelo;
    }

    public void setModelo(ModeloVeiculo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
