package ProgramaColecionadores;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus
 */

public class Item implements Cloneable{
    //atributos
    private int idItem;
    private int tipoItem;
    private String estadoPreservacao; //Novo,Usado,Ruim,Bom
    private float vItem;
    private String Fabricacao;
    private String Aquisicao;
    private String valorFabricacao;
    private String valorAquisicao;
    private String Edicao;
    private String Descricao;
    private int idUsuario;
    private Image foto;
    private int privacidade;
     private boolean disponivelVenda=false;
    private boolean vendido=false;
    private static List<Item>listaItens=new ArrayList<Item>();
    private String nome;
    public enum estadoLeilao{
        Indisponível,Disponível,Em_Venda
    }
    estadoLeilao estadoLeilao;
    //metodo construtor
    public Item(){
    listaItens.add(this);
    this.estadoLeilao=estadoLeilao.Disponível;
    }

    public Item(int tipoItem, int idUsuario, String nome) {
        this.tipoItem = tipoItem;
        this.idUsuario = idUsuario;
        this.nome = nome;
        listaItens.add(this);
    }


    //metodos de acesso  
    /**
    * insere tipo de privacidade 0-publico 1-amigos 2- privado
    * @param privacidade
    */
    public void setPrivacidade(int privacidade) {this.privacidade = privacidade;}
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
    public void setIdItem(int iditem){this.idItem=iditem;}
    public void setTipoItem(int tipoitem){this.tipoItem=tipoitem;}
    public void setEstadoPreservacao(String estadopreservacao){this.estadoPreservacao=estadopreservacao;}
    public void setVItem(float vitem){this.vItem=vitem;}
    public void setFabricacao(String fabricacao){this.Fabricacao=fabricacao;}
    public void setAquisicao(String aquisicao){this.Aquisicao=aquisicao;}
    public void setVFabricacao(String valorfabricacao){this.valorFabricacao=valorfabricacao;}
    public void setVAquisicao(String valoraquisicao){this.valorAquisicao=valoraquisicao;}
    public void setEdicao(String edicao){this.Edicao=edicao;}
    public void setDescricao(String descricao){this.Descricao=descricao;}
    public Image getFoto() {return foto;}
    public void setFoto(Image foto) { this.foto = foto;}

    public void setNome(String nome) {
        this.nome = nome;
    }
    
  public void setDisponivelVenda(boolean disponivelVenda) {
        this.disponivelVenda = disponivelVenda;
        if(disponivelVenda==true){
            Atividade atividade=new Atividade();
                atividade.setIdUsuario(idUsuario);
                atividade.setIdItem(idItem);
                atividade.setIdTipoColecaoItem(tipoItem);
                atividade.tipoAcao="Adicionou  item à sua Loja. ";
                atividade.salvar();
                
        }
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public void setEstadoLeilao(estadoLeilao estadoLeilao) {
        this.estadoLeilao = estadoLeilao;
    }

    public estadoLeilao getEstadoLeilao() {
        return estadoLeilao;
    }
    
    public boolean isVendido() {
        return vendido;
    }    
    public boolean isDisponivelVenda() {
        return disponivelVenda;
    }
    public String getNome() {return nome;}
    public int getPrivacidade() {return privacidade;}
    public int getIdUsuario() {return idUsuario;}
    public int getIdItem(){return idItem;}
    public int getTipoItem(){return tipoItem;}
    public String getEstadoPreservacao(){return estadoPreservacao;}
    public float getVItem(){return vItem;}
    public String getFabricacao(){return Fabricacao;}
    public String getAquisicao(){return Aquisicao;}
    public String getVFabricacao(){return valorFabricacao;}
    public String getVAquisicao(){return valorAquisicao;}
    public String getEdicao(){return Edicao;}
    public String getDescricao(){return Descricao;}

    @Override
    public Object clone(){
        Object x = new Item();
        try{
           Item i = (Item) super.clone();
           x=i;
        }
        catch(CloneNotSupportedException e){ }
        return x;
    }
    
    public static List<Item> getListaItens() {
        return listaItens;
    }
    public static List<Item> getListaItensUsuario(int idUser) {
        List<Item>itensUsuario=new ArrayList<Item>();
        for(Item item:listaItens){
            if(item.idUsuario==idUser){
                itensUsuario.add(item);
            }
        }
        return itensUsuario;
    }
    public static List<Item> getListaItensUsuarioVendivel(int idUser) {
        List<Item>itensUsuario=new ArrayList<Item>();
        for(Item item:listaItens){
            if((item.idUsuario==idUser)&&(item.disponivelVenda==true)){
                itensUsuario.add(item);
            }
        }
        return itensUsuario;
    }
    public static List<Item> getListaItensUsuarioInvendivel(int idUser) {
        List<Item>itensUsuario=new ArrayList<Item>();
        for(Item item:listaItens){
            if((item.idUsuario==idUser)&&(item.disponivelVenda==false)){
                itensUsuario.add(item);
            }
        }
        return itensUsuario;
    }
  
    
    public static Item getItem(int idItem, int tipoColecaoItem){
            Item item = null;
        switch(tipoColecaoItem){
            case 1:
                item= (Item)Dados.getCamisetasBD().get(idItem);break;
            case 2:
                item= (Item)Dados.getCartoesBD().get(idItem);break;
            case 3:
                item= (Item)Dados.getJogosBD().get(idItem);break;
            case 4:
                item= (Item)Dados.getMoedasBD().get(idItem);break;
            case 5:
                item= (Item)Dados.getQuadrinhosBD().get(idItem);break; 
            default:
                item= (Item)Dados.getHotWheelsBD().get(idItem);break;
        }
        return item;
}
    public String getTipoColecao(){
        return Dados.getNomesTiposColecao().get(tipoItem);
    }
}