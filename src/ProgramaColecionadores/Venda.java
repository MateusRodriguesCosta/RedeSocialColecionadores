/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaColecionadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lorencia
 */
public class Venda {
    private int idVenda, idVendedor,idComprador,idItem,idTipoItem;
    private Item item;
    public static HashMap<Integer,Venda>listaVenda=new HashMap<Integer,Venda>();
    public enum estadoVenda{
        Solicitada,Pendente_Envio,Recebido,Enviado;
    }
    estadoVenda estado=estadoVenda.Pendente_Envio;
    
    /**
     *Insira o id do item 
     * @param idItem
     * @param idTipoItem
     * @param idComprador
     */
    public Venda(int idItem, int idTipoItem,int idComprador) {
        this.idComprador=idComprador;
        this.idVenda=listaVenda.size();
        this.idItem = idItem;
        this.idTipoItem = idTipoItem;
        this.item=Item.getItem(idItem, idTipoItem);
        this.item.setDisponivelVenda(false);
        this.idVendedor=item.getIdUsuario();
        this.listaVenda.put(idVenda,this);
        
    }

    public void setEstadoVenda(estadoVenda tipo) {
        this.estado = tipo;
        if(estado==estadoVenda.Recebido){
            getItem().setIdUsuario(idComprador);
            Atividade atividade=new Atividade();
                atividade.setIdUsuario(idComprador);
                atividade.setIdItem(idItem);
                atividade.setIdTipoColecaoItem(idTipoItem);
                atividade.nomeObjeto="item Comprado";
                atividade.tipoAcao="Recebeu ";
                atividade.salvar();
        }
    }

    
    public Item getItem(){
    return Item.getItem(idItem,idTipoItem);
    }
            
    public estadoVenda getEstado() {
        return estado;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public int getIdItem() {
        return idItem;
    }

    public int getIdTipoItem() {
        return idTipoItem;
    }
    
    public static List<Item> getListaCompras(int idUser) {
        List<Item>itensUsuario=new ArrayList<Item>();
        for(Venda venda:listaVenda.values()){
            if((venda.idComprador==idUser)){
                itensUsuario.add(venda.item);
            } 
        }
        return itensUsuario;
    }
     public static List<Item> getListaVendas(int idUser) {
        List<Item>itensUsuario=new ArrayList<Item>();
        for(Venda venda:listaVenda.values()){
            if((venda.idVendedor==idUser)){
                itensUsuario.add(venda.item);
            } 
        }
        return itensUsuario;
    }
    public static List<Venda> getListaVendasUsuario(int idUser) {
        List<Venda>vendaUsuario=new ArrayList<Venda>();
        for(Venda venda:listaVenda.values()){
            if((venda.idVendedor==idUser)){
                vendaUsuario.add(venda);
            } 
        }
        return vendaUsuario;
    }
    
    
    public static List<Venda> getListaComprasUsuario(int idUser) {
        List<Venda>vendaUsuario=new ArrayList<Venda>();
        for(Venda venda:listaVenda.values()){
            if((venda.idComprador==idUser)){
                vendaUsuario.add(venda);
            } 
        }
        return vendaUsuario;
    }
     
     
     
     
}
