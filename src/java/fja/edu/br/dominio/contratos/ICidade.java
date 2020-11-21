
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Cidade;
import java.util.LinkedList;
import java.util.List;

public interface ICidade {
    boolean incluir(Cidade cidade);
    boolean editar(Cidade cidade);
    boolean deletarPorId (int idcidade);
    Cidade getConsultaPorId(int idcidade);
    List<Cidade> getListaTodasCidades();
    
}
