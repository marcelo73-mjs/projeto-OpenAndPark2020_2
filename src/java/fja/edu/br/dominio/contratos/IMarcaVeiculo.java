
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.MarcaVeiculo;
import java.util.List;


public interface IMarcaVeiculo {
    boolean incluir(MarcaVeiculo marcaVeiculo);
    boolean editar(MarcaVeiculo marcaVeiculo);
    boolean deletarPorId(int idmarcaveiculo);
    MarcaVeiculo getConsultaPorId(int idmarcaveiculo);
    List< MarcaVeiculo> getListaTodasMarcasVeiculos();
   
    
    
}
