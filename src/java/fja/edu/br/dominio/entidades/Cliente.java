
package fja.edu.br.dominio.entidades;


public class Cliente {
    private int Idcliente;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String logradouro;
    private String bairro;
    private int numero;
    private String bloco;
    private String cep;


    public Cliente() {
    }

    public Cliente(int Idcliente, String nome, String sobrenome, String cpf, String email, String logradouro, String bairro, int numero, String bloco, String cep) {
        this.Idcliente = Idcliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.bloco = bloco;
        this.cep = cep;
    }

    

    
    public Cliente(int Idcliente) {
        this.Idcliente = Idcliente;
    }

  
    public int getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.Idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

   
    
    
    
    
}
