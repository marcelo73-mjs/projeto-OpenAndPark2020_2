
package fja.edu.br.dominio.entidades;

public class ProprietarioEstacionamento {
    private int idproprietario;
    private String nome;
    private String email;
    private Telefone telefone;

    public ProprietarioEstacionamento() {
    }

    public ProprietarioEstacionamento(int idproprietario, String nome, String email, Telefone telefone) {
        this.idproprietario = idproprietario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public ProprietarioEstacionamento(int idproprietario) {
        this.idproprietario = idproprietario;
    }

    public int getIdproprietario() {
        return idproprietario;
    }

    public void setIdproprietario(int idproprietario) {
        this.idproprietario = idproprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
    
}
