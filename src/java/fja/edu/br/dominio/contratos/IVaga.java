/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Vaga;
import java.util.List;

/**
 *
 * @author evawellesrodrigues
 */
public interface IVaga {
    boolean incluir(Vaga vaga);
    boolean editar(Vaga vaga);
    boolean deletarPorId(int idvaga);
    Vaga getConsultaPorId(int idvaga);
    List<Vaga>getListaTodasVagas();
    
    
}
