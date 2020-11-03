
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Pagamento;
import java.util.List;


public interface IPagamento {
    boolean incluir(Pagamento pagamento);
    boolean editar(Pagamento pagamento);
    boolean deletarPorId(int idpagmento);
    Pagamento getConsultaPorId(int idpagamento);
    List<Pagamento>listaTodosOsPagamentos();
    
}
