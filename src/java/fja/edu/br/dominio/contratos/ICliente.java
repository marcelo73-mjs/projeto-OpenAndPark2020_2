
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Cliente;
import java.util.List;


public interface ICliente {
    boolean incluir(Cliente cliente);
    boolean editar(Cliente cliente);
    boolean deletarPorId(int idcliente);
    Cliente getConsultaPorId(int idcliente);
    List<Cliente> getListaTodosClientes ();
   
    
    
    
}