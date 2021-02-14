package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento{
    //atributos
    private int idEvento;
    private String titulo;
    private String descricao;
    private String data;
    private String endereco;
    
    //metodos construtores
    public Evento(int idUsuario,String titulo, String descricao, String endereco){
    this.titulo=titulo;
    this.descricao=descricao;
    this.idEvento=Dados.listaEventos.size();
    this.endereco=endereco;
    this.idEvento=Dados.listaEventos.size();
    Dados.grafoEvento[idUsuario][idEvento]=3;
    Dados.listaEventos.add(this);
    }
    
    //metodos de acesso
    public void setData(String d){data=d;}
  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdEvento() {
        return idEvento;
    }
    
    public List<Usuario> getMembros(){
        List<Usuario> membrosEvento=new ArrayList<Usuario>();
        for(int i=0;i<Dados.grafoEvento.length;i++){
            if(Dados.grafoEvento[idEvento][i]!=0){
                membrosEvento.add(Dados.getUsuariosBD().get(i));
            }
        }
        return membrosEvento;
        
    }
    public int getEstadoConvidado(int idUsuario){
        return Dados.grafoEvento[idUsuario][idEvento];
    }
    public List<Usuario> getParticipantesConfirmado(){
        List<Usuario> participantes=new ArrayList<Usuario>();
        for(int i=0;i<Dados.getUsuariosBD().size();i++){
            if(Dados.grafoEvento[i][idEvento]==3){
                participantes.add(Dados.getUsuariosBD().get(i));
            }
        }
    return participantes;
    }
    
    public List<Usuario> getParticipantesIndecisos(){
        List<Usuario> participantes=new ArrayList<Usuario>();
        for(int i=0;i<Dados.getUsuariosBD().size();i++){
            if(Dados.grafoEvento[i][idEvento]==2){
                participantes.add(Dados.getUsuariosBD().get(i));
            }
        }
    return participantes;
    }
    
    public List<Usuario> getParticipantesConvidados(){
        List<Usuario> participantes=new ArrayList<Usuario>();
        for(int i=0;i<Dados.getUsuariosBD().size();i++){
            if(Dados.grafoEvento[i][idEvento]==1){
                participantes.add(Dados.getUsuariosBD().get(i));
            }
        }
    return participantes;
    }
    
    public void confirmarPresenca(int idUsuario){
        Dados.grafoEvento[idUsuario][idEvento]=3;
    }
    
    public void confirmarPossibilidadePresenca(int idUsuario){
        Dados.grafoEvento[idUsuario][idEvento]=2;
    }
    public void recusarPresenca(int idUsuario){
        Dados.grafoEvento[idUsuario][idEvento]=0;
    }
    
    public void convidarUsuario(int idUsuario){
        Dados.grafoEvento[idUsuario][idEvento]=1;
    }
    
    public void listaParticipante(){
        //nomes participantes que confirmaram presença.
    }
}
