package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class Troca{
    //atributos
    private int idTroca;
    private final int idUserCriador;
    private final int idItemOferta;
    private final int idItemDesejado;
    private final int idUserConvidado;
    private final int idTipoColecao;
    private int[] estadoTroca= new int[2];
    
    //metodo construtor
    public Troca(int idUserLogado,int idUserAmigo,int idTipoColecao, Item itemOferta,Item itemDesejado){
    this.idTroca=Dados.listaTrocas.size();
    this.idUserCriador=idUserLogado;
    this.idUserConvidado=idUserAmigo;
    this.idItemDesejado=itemDesejado.getIdItem();
    this.idItemOferta=itemOferta.getIdItem();
    this.estadoTroca[0]=1;//grade de quem criou troca
    this.estadoTroca[1]=0;//grade de quem rebeu troca
    this.idTipoColecao=idTipoColecao;
    
    getItemOferta().setIdUsuario(0);//remove o item da lista do usuário para ele não oferecer o item para mias de um usuário ou
        //para ele não excluir o item durante a transa...
    Dados.listaTrocas.add(this);
    }
    //metodos de acesso

    public int getIdTroca() {
        return idTroca;
    }

    public int getIdUserCriador() {
        return idUserCriador;
    }
    public Usuario getUserCriador() {
        return Dados.getUsuariosBD().get(idUserCriador);
    }
    public Item getItemOferta() {
        Item item = null;
        switch(idTipoColecao){
            case 1:
                item= (Item)Dados.getCamisetasBD().get(idItemOferta);break;
            case 2:
                item= (Item)Dados.getCartoesBD().get(idItemOferta);break;
            case 3:
                item= (Item)Dados.getJogosBD().get(idItemOferta);break;
            case 4:
                item= (Item)Dados.getMoedasBD().get(idItemOferta);break;
            case 5:
                item= (Item)Dados.getQuadrinhosBD().get(idItemOferta);break; 
            default:
                item= (Item)Dados.getHotWheelsBD().get(idItemOferta);break;
        }
        return item;
    }

    public Item getItemDesejado() {
        Item item = null;
        switch(idTipoColecao){
            case 1:
                item= (Item)Dados.getCamisetasBD().get(idItemDesejado);break;
            case 2:
                item= (Item)Dados.getCartoesBD().get(idItemDesejado);break;
            case 3:
                item= (Item)Dados.getJogosBD().get(idItemDesejado);break;
            case 4:
                item= (Item)Dados.getMoedasBD().get(idItemDesejado);break;
            case 5:
                item= (Item)Dados.getQuadrinhosBD().get(idItemDesejado);break; 
            default:
                item= (Item)Dados.getHotWheelsBD().get(idItemDesejado);break;
        }
        return item;
    }

    public int getIdUserConvidado() {
        return idUserConvidado;
    }
    public Usuario getUserConvidado() {
        return Dados.getUsuariosBD().get(idUserConvidado);
    }
    public int getIdTipoColecao() {
        return idTipoColecao;
    }

    public void setTrocaAceita(){
        estadoTroca[1]=1;
        getItemDesejado().setIdUsuario(0);
    }
    public void setTrocaCancelada(){
        estadoTroca[1]=-1;
        getItemOferta().setIdUsuario(idUserCriador);//retorna o item para o usuário que criou a troca
    }
    public void setItemEnviado(int idUsuario){
        if(idUsuario==idUserConvidado){
            estadoTroca[1]=2;
        }
        if(idUsuario==idUserCriador){
            estadoTroca[0]=2;
        }
    }
    public void setItemRecebido(int idUsuario){
        if(idUsuario==idUserConvidado){
            estadoTroca[1]=3;
            getItemOferta().setIdUsuario(idUserConvidado);
        }
        if(idUsuario==idUserCriador){
            estadoTroca[0]=3;
            getItemDesejado().setIdUsuario(idUserCriador);
        }
    }
    public int getIdEstadoTroca(){
        return estadoTroca[0]+estadoTroca[1];       
    }
    public int getIdEstadoMeuItem(int idUsuario){
        if(idUsuario==idUserCriador){
            return estadoTroca[0];
        }else if(idUsuario==idUserConvidado){
            return estadoTroca[1];
        }else
            return 0;
    }
    public int getIdEstadoAmigo(int idUsuario){
        if(idUsuario==idUserConvidado){
            return estadoTroca[0];
        }if(idUsuario==idUserCriador){
           return estadoTroca[1];
        }else
            return 0;
    }

    public String getEstadoTroca(){
        String estado="";
        switch(getIdEstadoTroca()){
            case 0:estado="Cancelada";break;
            case 1:estado="Pendente";break;    
            case 2:estado="Troca Aceita";break;
            case 3:estado="Envio Pendente";break;
            case 4:estado="Recebimento Pendente";break;
            case 5:estado="Recebimento Pendente";break;    
            case 6:estado="Concluída";break;
        }
        return estado;
    }
    
    
}

