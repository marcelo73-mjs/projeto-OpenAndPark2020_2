
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Telefone;
import java.util.List;


public interface ITelefone {
    boolean incluir (Telefone telefone);
    boolean editar (Telefone telefone);
    boolean deletarPorId (int idtelefone);
    Telefone getConsultaPorId(int idtelefone);
    List<Telefone>getListaTodosTelefones();
    
}
