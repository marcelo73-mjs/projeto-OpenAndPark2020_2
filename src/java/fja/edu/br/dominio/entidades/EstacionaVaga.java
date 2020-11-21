
package fja.edu.br.dominio.entidades;


public class EstacionaVaga {
   
   private int idestacionavaga;
   private Estacionamento estacionamento;
   private Vaga vaga;
   private boolean vagaslivres;

   public EstacionaVaga() {
   }

    public EstacionaVaga(int idestacionavaga, Estacionamento estacionamento, Vaga vaga, boolean vagaslivres) {
        this.idestacionavaga = idestacionavaga;
        this.estacionamento = estacionamento;
        this.vaga = vaga;
        this.vagaslivres = vagaslivres;
    }

    public EstacionaVaga(int idestacionavaga) {
        this.idestacionavaga = idestacionavaga;
    }

    public int getIdestacionavaga() {
        return idestacionavaga;
    }

    public void setIdestacionavaga(int idestacionavaga) {
        this.idestacionavaga = idestacionavaga;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public boolean isVagaslivres() {
        return vagaslivres;
    }

    public void setVagaslivres(boolean vagaslivres) {
        this.vagaslivres = vagaslivres;
    }
   
   
   
   
}
