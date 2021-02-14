/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import ProgramaColecionadores.Dados;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lorencia
 */
public class Jogador {
    private final int idJogador;
    private final  List<Integer> cartoesCamiseta;
    private final List<Integer> cartoesCartao;
    private final List<Integer> cartoesJogo;
    private final List<Integer> cartoesMoeda;
    private final List<Integer> cartoesQuadrinho;
    private final List<Integer> cartoesHotWheels;
    public static HashMap<Integer,Jogador> jogadores=new HashMap<>();
    
    public Jogador(int idUsuario){
        this.cartoesHotWheels = new ArrayList<>();
        this.cartoesQuadrinho = new ArrayList<>();
        this.cartoesMoeda = new ArrayList<>();
        this.cartoesJogo = new ArrayList<>();
        this.cartoesCartao = new ArrayList<>();
        this.cartoesCamiseta = new ArrayList<>();
        this.idJogador=idUsuario;
    }
    
    public String getNome(){
        return Dados.getUsuariosBD().get(this.idJogador).getNome();
    } 
    public void setCamiseta(int idCartaCamiseta){
        this.cartoesCamiseta.add(idCartaCamiseta);
    }
    public void setCartao(int idCartaCartao){
        this.cartoesCartao.add(idCartaCartao);
    }
    public void setJogo(int idCartaJogo){
        this.cartoesJogo.add(idCartaJogo);
    }
    public void setMoeda(int idCartaMoeda){
        this.cartoesMoeda.add(idCartaMoeda);
    }
    public void setQuadrinho(int idCartaQuadrinho){
        this.cartoesQuadrinho.add(idCartaQuadrinho);
    }
    public void setHotWheels(int idCartaHotWheels){
        this.cartoesHotWheels.add(idCartaHotWheels);
    }
    public int getIdJogador() {
        return idJogador;
    }

    public List<Integer> getCartoesCamiseta() {
        return cartoesCamiseta;
    }

    public List<Integer> getCartoesCartao() {
        return cartoesCartao;
    }

    public List<Integer> getCartoesJogo() {
        return cartoesJogo;
    }

    public List<Integer> getCartoesMoeda() {
        return cartoesMoeda;
    }

    public List<Integer> getCartoesQuadrinho() {
        return cartoesQuadrinho;
    }

    public List<Integer> getCartoesHotWheels() {
        return cartoesHotWheels;
    }

    public static Jogador put(Integer key, Jogador value) {
        return jogadores.put(key, value);
    }
    
    
}
