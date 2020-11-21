
package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.ICidade;
import fja.edu.br.dominio.entidades.Cidade;
import fja.edu.br.infraestrutura.repositorio.CidadeRepositorio;
import java.util.List;


public class CidadeController {
    private Cidade cidade;
    private List<Cidade>  listaCidade= null;
    private ICidade cidadeRepositorio = new CidadeRepositorio();
   
    public CidadeController() {
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Cidade> getListaCidade() {
        return listaCidade;
    }
    
    
    
}
