/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Preco;
import java.util.List;


public interface IPreco {
    boolean incluir(Preco preco);
    boolean editar(Preco preco);
    boolean deletarPorId(int idpreco);
    Preco consultaPorId(int idpreco);
    List<Preco>listaTodosPrecos();
    
}
