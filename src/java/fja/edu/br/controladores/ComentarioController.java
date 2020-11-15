
package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.IComentario;
import fja.edu.br.dominio.entidades.Comentario;
import fja.edu.br.infraestrutura.repositorio.ComentarioRepositorio;
import java.util.List;

public class ComentarioController {

  private Comentario comentario;
  private List<Comentario> listaComentario=null;
  private IComentario comentarioRepositorio = new ComentarioRepositorio();
  
  
  public ComentarioController() {
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public List<Comentario> getListaComentario() {
        if(listaComentario==null){
            comentarioRepositorio.getListatodosComentarios();
        }
        return listaComentario;
    }
    
    public String preparaInclusao(){
        comentario = new Comentario();
        return "vaiParaListagemComentario";
        
    }
    public String finalizaInclusao(){
        comentarioRepositorio.incluir(comentario);
        listaComentario=null;
        return "";
    }
    public String preparaEdicao(){
        comentarioRepositorio.editar(comentario);
        listaComentario=null;
        return "";
        
    }
    public String finalizaEdicao(){
        comentarioRepositorio.editar(comentario);
        listaComentario=null;
        return "";
    }
    
    public String preparaDelecao(){
        comentarioRepositorio.deletarPorId(comentario.getIdcomentario());
        listaComentario=null;
        return "";
    }
  
  
}
