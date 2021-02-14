package ProgramaColecionadores;

import java.beans.PropertyVetoException;

/**
 *
 * @author Mateus
 */


public class Camiseta extends Item
{
   
    private int idTime;
    public Camiseta(){
        super();
    this.setTipoItem(1);
    }
    Modelo o1=new Modelo();

    public Camiseta(int idUsuario, String nome) {
        super(1, idUsuario, nome);
        salvar();
        Atividade atividade = new Atividade(this.getIdItem(),1, idUsuario, 1, "Adicionou","CAMISETA");
        atividade.salvar();//metodo que salva a nova atividade na lista de atividades
        atividade.setTipoMural(Atividade.tipoMural.perfil);
    }

      

    public int getIdTime() {
        return idTime;
    }
    public void setIdTime(int idTime) {
       this.idTime = idTime;
    }
    public Boolean salvar(){
        this.setIdItem(Dados.getNextIdCamiseta());
        Dados.getCamisetasBD().add(this);
        return true;
    }
}
