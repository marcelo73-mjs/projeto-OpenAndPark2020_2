
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Veiculo;
import java.util.List;


public interface IVeiculo {
    boolean incluir(Veiculo veiculol);
    boolean editar(Veiculo veiculol);
    boolean deletarPorId(int idveiculo);
    Veiculo getConsultaPorId(int idveiculo);
    List<Veiculo>getListaTodosVeiculos();
}
