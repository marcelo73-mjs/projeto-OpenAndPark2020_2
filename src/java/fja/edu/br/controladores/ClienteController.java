
package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.ICliente;
import fja.edu.br.dominio.entidades.Cliente;
import fja.edu.br.infraestrutura.repositorio.ClienteRepositorio;
import java.util.List;


public class ClienteController {
    private Cliente cliente;
    private List<Cliente> listaCliente=null;
    private ICliente clienteRepositorio = new ClienteRepositorio();
    
    

    public ClienteController() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaCliente() {
        if(listaCliente==null){
            listaCliente= clienteRepositorio.getListaTodosClientes();
        }
        return listaCliente;
    }
    
    public String preparaInclusao(){
        cliente= new Cliente();
        return "vaiParaListagemDeCliente";
    }
    public String finalizaInclusao(){
        clienteRepositorio.incluir(cliente);
        listaCliente=null;
        return "voltaParaListagemDeCliente";
    }
    public String preparaEdicao(){
        clienteRepositorio.editar(cliente);
        listaCliente=null;
        return "voltaParaListagemDeCliente";
    }
    public String finalizaDelecao(){
        clienteRepositorio.deletarPorId(cliente.getIdcliente());
        listaCliente=null;
        return "refresh";
    }
    
}
