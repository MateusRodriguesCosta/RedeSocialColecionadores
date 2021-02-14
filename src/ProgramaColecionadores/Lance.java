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

/**
 *
 * @author leticia
 */
class Lance {
    private int idLance;
    private Usuario usuario;
    private Leilao leilao;
    private BigDecimal valor;
    private static List<Lance> lances=new ArrayList<Lance>();
    
    public Lance(Usuario usuario, Leilao leilao, BigDecimal valor) {
        this.usuario = usuario;
        this.leilao = leilao;
        this.valor = valor;
        this.idLance=lances.size();
        this.leilao.getLances().put(valor, this);
        lances.add(this);
    }

    public int getIdUsuario() {
        return usuario.getIdUsuario();
    }

    public static List<Lance> getLancesUsuario(int idUsuario){
        List<Lance> lancesUsuario=new ArrayList<Lance>();
        for(Lance e:lances){
            if(idUsuario==e.getIdUsuario()){
                lancesUsuario.add(e);
            }
        }
        return lancesUsuario;
    }
    
    public int getIdLance() {
        
        return idLance;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public static List<Lance> getLances() {
        return lances;
    }

    public Leilao.Estado getEstado() {
        return leilao.getEstado();
    }

    public BigDecimal getPreco() {
        return leilao.getPreco();
    }

    public boolean setLance(Usuario usuario, BigDecimal valor) {
        return leilao.setLance(usuario, valor);
    }
    
    
    
}
