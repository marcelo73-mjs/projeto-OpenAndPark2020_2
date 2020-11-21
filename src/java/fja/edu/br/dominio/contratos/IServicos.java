
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Servico;
import java.util.List;


public interface IServicos {
    boolean incluir(Servico servicos);
    boolean editar(Servico servicos);
    boolean deletarPorId(int idservico);
    Servico getConsultaPorid(int idservico);
    List<Servico>getListaTodosServicos();
    
}
