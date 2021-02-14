package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class Cartao extends Item
{
   
    private String Tema;
    private String Lote;
    private String Tiragem;
    private String Operadora;
  
    public Cartao(){super();
    this.setTipoItem(2);}
    
   
    public void setTema(String tema){this.Tema=tema;}
    public void setLote(String lote){this.Lote=lote;}
    public void setTiragem(String tiragem){this.Tiragem=tiragem;}
    public void setOperadora(String operadora){this.Operadora=operadora;}
   
    public String getTema(){return Tema;}
    public String getLote(){return Lote;}
    public String getTiragem(){return Tiragem;}
    public String getOperadora(){return Operadora;} 
    
    public Boolean salvar(){
        this.setIdItem(Dados.getNextIdCartao());
        Dados.getCartoesBD().add(this);
        return true;
    }
}
