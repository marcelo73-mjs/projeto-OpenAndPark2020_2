
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Estacionamento;
import java.util.List;


public interface IEstacionamento {
    boolean incluir(Estacionamento estacionamento);
    boolean editar(Estacionamento estacionamento);
    boolean deletarPorId(int idestacionamento);
    Estacionamento getConsultaPorId(int idestacionamento);
    List<Estacionamento>getListaTodosEstacionamentos();
    
}
