
package fja.edu.br.dominio.entidades;


public class Login {
    private int idlogin;
    private String usuario;
    private String senha;
    private String email;

    public Login() {
    }

    public Login(int idlogin, String usuario, String senha, String email) {
        this.idlogin = idlogin;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
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
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
}
