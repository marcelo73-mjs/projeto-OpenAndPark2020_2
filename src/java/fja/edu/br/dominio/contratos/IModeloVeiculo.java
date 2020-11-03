
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.ModeloVeiculo;
import java.util.List;


public interface IModeloVeiculo {
    boolean incluir(ModeloVeiculo modeloVeiculo);
    boolean editar(ModeloVeiculo modeloVeiculo);
    boolean deletarPorId(int idmodelo);
    ModeloVeiculo getConsultaPorId(int idmodelo);
    List<ModeloVeiculo>listaTodosOsModelosVeiculos();
}
