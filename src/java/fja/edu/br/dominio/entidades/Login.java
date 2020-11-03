
package fja.edu.br.dominio.entidades;


public class Login {
    private int idlogin;
    private String usuario;
    private String senha;

    public Login() {
    }

    public Login(int idlogin, String usuario, String senha) {
        this.idlogin = idlogin;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Login(int idlogin) {
        this.idlogin = idlogin;
    }

    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
