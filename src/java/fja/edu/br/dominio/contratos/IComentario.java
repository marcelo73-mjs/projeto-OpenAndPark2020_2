
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Comentario;
import java.util.List;


public interface IComentario {
    boolean incluir(Comentario comentario);
    boolean editar(Comentario comentario);
    boolean deletarPorId(int idcomentario);
    Comentario getConsultaPorId(int idcomentario);
    List<Comentario>getListatodosComentarios();
    
}
