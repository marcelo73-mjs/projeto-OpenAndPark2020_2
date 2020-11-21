/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.IEstacionamento;
import fja.edu.br.dominio.entidades.Estacionamento;
import fja.edu.br.infraestrutura.repositorio.EstacionamentoRepositorio;
import java.util.List;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private List<Estacionamento>listaEstacionamento = null;
    private IEstacionamento estRepositorio= new EstacionamentoRepositorio();

 
    public EstacionamentoController() {
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public List<Estacionamento> getListaEstacionamento() {
        if(listaEstacionamento==null){
            listaEstacionamento = estRepositorio.getListaTodosEstacionamentos();
        }
        return listaEstacionamento;
    }
    
    public String preparaInclusao() {
       estacionamento = new Estacionamento();
        return "vaiParaInclusao";
    }
    public String finalizaInclusao(){
        estRepositorio.incluir(estacionamento);
        listaEstacionamento=null;//Limpando a lista
        return "voltaParaListagem";
    }
    public String finalizaEdicao(){
        estRepositorio.editar(estacionamento);
        listaEstacionamento=null;
        return "voltaParaListagem";
        
    }
        public String finalizaDelecao(){
         estRepositorio.deletarPorId(estacionamento.getIdestacionamento());
         listaEstacionamento=null;
         return "reflesh"; //O REFRESH É JUSTAMENTE PARA RETORNAR A MESMA PAGINA ATUALIZANDO A ACAO DELETAR
    } 

}
