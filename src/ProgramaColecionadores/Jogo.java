package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class Jogo extends Item{
    
    private String qntJogadores;
    private String Plataforma;
    Genero o1=new Genero();
    public Jogo(){super();
    this.setTipoItem(3);}
   
    public void setQntJogadores(String qntjogadores){this.qntJogadores=qntjogadores;}
    public void setPlataforma(String plataforma){this.Plataforma=plataforma;}
    
    public String getQntJogadores(){return qntJogadores;}
    public String getPlataforma(){return Plataforma;}
    
    public Boolean salvar(){
        this.setIdItem(Dados.getNextIdJogo());
        Dados.getJogosBD().add(this);
        return true;
    }
}
