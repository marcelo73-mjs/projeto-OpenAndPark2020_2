
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.EstacionaVaga;
import java.util.List;


public interface IEstacionaVaga {
    boolean incluir(EstacionaVaga estacionaVa);
    boolean editar(EstacionaVaga estacionaVa);
    boolean deletarPorId(int idestacionavaga);
    EstacionaVaga getConsultaPorId(int idestacionavaga);
    List<EstacionaVaga> getlistaTodosOsEstacionamentosEVagas();
    
}
