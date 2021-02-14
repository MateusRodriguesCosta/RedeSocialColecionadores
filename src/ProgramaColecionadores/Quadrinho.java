package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */


public class Quadrinho extends Item
{
    
    public Quadrinho(){super();
    this.setTipoItem(5);}
    Genero o1=new Genero();
    public void setTitulo(String titulo){this.setNome(titulo);}
    public String getTitulo(){return this.getNome();}
    
     public Boolean salvar(){
        this.setIdItem(Dados.getNextIdQuadrinho());
        Dados.getQuadrinhosBD().add(this);
        return true;
    }
}
