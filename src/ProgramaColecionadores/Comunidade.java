package ProgramaColecionadores;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus
 */

public class Comunidade{
    //atributos
    public enum TipoComunidade{Jogos, HotWheels, Moedas, Quadrinhos, Camisetas, Cartoes};
    private int idComunidade;
    private TipoComunidade tipoComunidade;
    private String nome,descricao;
    private int numeroParticipante;
    private List<Usuario> listaMembros;
    private List<Evento> listaEventos;
    private String tipo;
    private Image foto;
    //metodo construtor
    public Comunidade(int idUsuario, String nome, String tipo,String descricao){
	 //Recebe o nome do usuario que criou a comunidade
               this.nome=nome;
               this.tipo=tipo;
               //Recebe o ID da comunidado(Atribui o proximo Id que estiver vazio)
	 this.idComunidade=Dados.getNextIdComunidade();
         this.descricao=descricao;
               //Adiciona a comunidade à lista de comunidades
	 Dados.getComunidadesBD().add(this);
	 Dados.getGrafoComunidade()[idUsuario][idComunidade]=1;
         Atividade atividade=new Atividade();
                atividade.setIdUsuario(idUsuario);
                atividade.nomeObjeto="Comunidade "+nome;
                atividade.tipoAcao="Criou  ";
                atividade.salvar();
	}

    public int getIdComunidade() {
        return idComunidade;
    }
    //Retorna o tipo de comunidade
    public TipoComunidade getTipoComunidade() {
        return tipoComunidade;
    }
    //Define o tipo de comunidade
    public void setTipoComunidade(TipoComunidade tipoComunidade) {
        this.tipoComunidade = tipoComunidade;
    }
	
    public String getNome(){
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setUsuario(int idUsuario){
        Dados.getGrafoComunidade()[idUsuario][idComunidade]=1;
    }
    public Image getImageComunidade(){
        return foto;
    }
    public void setFotoComunidade(Image i){
        this.foto=i;
    }
    //Retorna a lista que contem os membros da comunidade
    public List<Integer> getMembros(){
        //cria um objeto de lista de usuarios da comunidade
	List<Integer> usuariosComunidade=new ArrayList<Integer>();
	//Adiciona o(s) usuario(s) que se encontra no grafo de comunidades(Os usuarios que participam daquela dada comunidade) na nova lista usuariosComunidade. Ao final retorna a lista com os membros da comunidade.
              for(int i=0;i<Dados.getUsuariosBD().size();i++){
	if(Dados.getGrafoComunidade()[i][idComunidade]==1){
	usuariosComunidade.add(i);
	}
	}
	return usuariosComunidade;
    } 	
}
