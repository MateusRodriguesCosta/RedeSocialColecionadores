/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaColecionadores;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author leticia
 */
public class Leilao {
   private int idLeilao;
   private Usuario dono; 
   private Item item;
   private BigDecimal preco;
   private SortedMap<BigDecimal,Lance> lances=new TreeMap<BigDecimal,Lance>();
   private Estado estado;
   enum Estado{
       Aberto,
       Encerrado,
       Arrematado
   }
   private static HashMap<Integer,Leilao>leiloes=new HashMap<Integer,Leilao>();
    public Leilao(Usuario dono, Item item, BigDecimal preco) {
        
        this.dono = dono;
        this.item = item;
        this.preco = preco;
        this.idLeilao=leiloes.size();
        this.estado=Estado.Aberto;
        this.leiloes.put(idLeilao, this);
        item.setDisponivelVenda(false);
    }

    public boolean setLance(Usuario usuario, BigDecimal valor){
        if(preco.doubleValue()>valor.doubleValue()){
        Lance e=new Lance(usuario, this, valor);
        return true;
        }
        else{
        return false;
        }
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
        if(estado==Leilao.Estado.Arrematado){
            Venda e=new Venda(item.getIdItem(),item.getTipoItem(),lances.get(getPreco()).getIdUsuario());
            e.setEstadoVenda(Venda.estadoVenda.Recebido);           
        }
    }

    public int getIdLeilao() {
        return idLeilao;
    }

    public Usuario getDono() {
        return dono;
    }

    public Item getItem() {
        return item;
    }

    public BigDecimal getPreco() {
        lances.comparator();
        return preco=lances.lastKey();
    }

    public SortedMap<BigDecimal, Lance> getLances() {
        return lances;
    }

    public Estado getEstado() {
        return estado;
    }

    public HashMap<Integer, Leilao> getLeiloes() {
        return leiloes;
    }
    
    public static List<Leilao> getLeiloesUsuario(int idUsuario){
        List<Leilao> leiloesUsuario=new ArrayList<>();
        for(Leilao leilao:leiloes.values()){
            if(leilao.getDono().getIdUsuario()==idUsuario){
                leiloesUsuario.add(leilao);
            }
        }
        return leiloesUsuario;
    }
     
    
}
