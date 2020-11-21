
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Login;
import java.util.List;


public interface ILogin {
    boolean incluir(Login login);
    boolean editar(Login login);
    boolean deletarPorId(int idlogin);
    Login getConsultaPorId(int idlogin);
    List<Login>listaTodosLoginPorId();
    
    
}

