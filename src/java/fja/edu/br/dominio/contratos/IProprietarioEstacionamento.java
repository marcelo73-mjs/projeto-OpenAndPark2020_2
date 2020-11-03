
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.ProprietarioEstacionamento;
import java.util.List;


public interface IProprietarioEstacionamento {
    boolean incluir(ProprietarioEstacionamento proprietario);
    boolean editar (ProprietarioEstacionamento proprietario);
    boolean deletarPorId(int idproprietario);
    ProprietarioEstacionamento getConsultaPorId(int idproprietario);
    List< ProprietarioEstacionamento>getListaTodosOsProprietarios();
}
