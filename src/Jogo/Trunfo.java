/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import ProgramaColecionadores.Dados;
import ProgramaColecionadores.Usuario;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Letícia Meirelles
 */
public final class Trunfo {
    private int idJogo;
    private final Jogador player1;
    private final Jogador player2;
    private int pontos1;
    private int pontos2;
    private Cartas.Carta carta1;
    private Cartas.Carta carta2;
    private Integer aposta;
    private int numeroPartida;
    private Jogador vencedorPartida;
    private Jogador vencedorJogo;
    private final int idTipoCarta;
    public final Cartas cartas=new Cartas();
    public Integer estado;
    
    private String mensagem="Aguardando Usuário";
    
    
    public Trunfo(int idUser1,int idUser2,int idTipoCarta){
        this.idJogo=Dados.jogos.size();
        this.idTipoCarta=idTipoCarta;
        this.player1=Jogador.jogadores.get(idUser1);
        this.player2=Jogador.jogadores.get(idUser2);
        salvar();
    }
    
    private void salvar(){
        if(verificaExistenciaBaralho()){
        Dados.jogos.put(idJogo,this);
        this.inicializaPartida();
        }
    }

    public static HashMap<Integer, Trunfo> getJogos() {
        return Dados.jogos;
    }
   
    
    public Integer getAposta() {return aposta;}

    public void setAposta(Integer aposta) {
    this.aposta=aposta;
    getVencedorPartida();
    this.estado=1;
    }

    private int getIdCarta1() {
        int idCarta1;
        switch(idTipoCarta){
            case 1: idCarta1=(int) (Math.random() * player1.getCartoesCamiseta().size()-1);break;
            case 2: idCarta1=(int) (Math.random() * player1.getCartoesCartao().size()-1);break;
            case 3: idCarta1=(int) (Math.random() * player1.getCartoesJogo().size()-1);break;
            case 4: idCarta1=(int) (Math.random() * player1.getCartoesMoeda().size()-1);break;
            case 5: idCarta1=(int) (Math.random() * player1.getCartoesQuadrinho().size()-1);break;
            default:idCarta1=(int) (Math.random() * player1.getCartoesHotWheels().size()-1);break;
        }
        if(idCarta1<0){idCarta1=getIdCarta1();}
        return idCarta1;
        
    }
    private int getIdCarta2() {
        int idCarta2;
        switch(idTipoCarta){
            case 1:
                idCarta2=(int) (Math.random() * player2.getCartoesCamiseta().size()-1);break;
                
            case 2: idCarta2=(int) (Math.random() * player2.getCartoesCartao().size()-1);break;
            case 3: idCarta2=(int) (Math.random() * player2.getCartoesJogo().size()-1);break;
            case 4: idCarta2=(int) (Math.random() * player2.getCartoesMoeda().size()-1);break;
            case 5: idCarta2=(int) (Math.random() * player2.getCartoesQuadrinho().size()-1);break;
            default:idCarta2=(int) (Math.random() * player2.getCartoesHotWheels().size()-1);break;
        }
        if(idCarta2<0){idCarta2=getIdCarta2();}
        return idCarta2;
        
    }
    
        
    public Cartas.Carta getCarta1() {
       return carta1;
    }

    public Cartas.Carta getCarta2() {
       return carta2; 
    }
    private void sortearCartas(int idTipoCarta){
        carta1=cartas.getCarta(getIdCarta1(), idTipoCarta);
        carta2=cartas.getCarta(getIdCarta2(), idTipoCarta);
    }
    
    public void getVencedorPartida(){
        if(aposta!=null){
        if(carta1.equals(carta2)){
            vencedorPartida=null;
            mensagem="Empatou";
        }else
            if(carta1.getValoresAtributo()[aposta]>carta2.getValoresAtributo()[aposta]){
                vencedorPartida=player1;
                pontos1++;
                mensagem="Jogador "+(vencedorPartida.getNome())+" Ganhou";
              
               if((pontos2>=2)||(pontos1>=2)){     
                switch(idTipoCarta){
                        case 1:
                            player1.setCamiseta(carta2.getIdCarta());
                            player2.getCartoesCamiseta().remove(carta2.getIdCarta());
                        break;
                        case 2:
                            player1.setCartao(carta2.getIdCarta());
                            player2.getCartoesCartao().remove(carta2.getIdCarta());
                        break;
                        case 3:
                            player1.setJogo(carta2.getIdCarta());
                            player2.getCartoesJogo().remove(carta2.getIdCarta());
                        break;
                        case 4:
                            player1.setMoeda(carta2.getIdCarta());
                            player2.getCartoesMoeda().remove(carta2.getIdCarta());
                        break;
                        case 5:
                            player1.setQuadrinho(carta2.getIdCarta());
                            player2.getCartoesQuadrinho().remove(carta2.getIdCarta());
                        break;
                        default:
                            player1.setHotWheels(carta2.getIdCarta());
                            player2.getCartoesHotWheels().remove(carta2.getIdCarta());
                        break;
                    }
                }
                
            }else{
                vencedorPartida=player2;
                pontos2++;
                mensagem="Jogador "+(vencedorPartida.getNome())+" :Ganhou";
                if((pontos2>=2)||(pontos1>=2)){   
                switch(idTipoCarta){
                        case 1:
                            player2.setCamiseta(carta1.getIdCarta());
                            player1.getCartoesCamiseta().remove(carta1.getIdCarta());
                        break;
                        case 2:
                            player2.setCartao(carta1.getIdCarta());
                            player1.getCartoesCartao().remove(carta1.getIdCarta());
                        break;
                        case 3:
                            player2.setJogo(carta1.getIdCarta());
                            player1.getCartoesJogo().remove(carta1.getIdCarta());
                        break;
                        case 4:
                            player2.setMoeda(carta1.getIdCarta());
                            player1.getCartoesMoeda().remove(carta1.getIdCarta());
                        break;
                        case 5:
                            player2.setQuadrinho(carta1.getIdCarta());
                            player1.getCartoesQuadrinho().remove(carta1.getIdCarta());
                        break;
                        default:
                            player2.setHotWheels(carta1.getIdCarta());
                            player1.getCartoesHotWheels().remove(carta1.getIdCarta());
                        break;
                    }
                }
            }
        }else{
            mensagem="Aguardando Usuário";
        }
        
    }

    public String getEstado(){
        return mensagem;
    }
    public int getNumeroPartida() {
        return numeroPartida;
    }
    public void inicializaPartida(){
        numeroPartida++;
        sortearCartas(idTipoCarta);
        aposta=null;
        mensagem="Aguardando Usuário";
        estado=null;
        if(((player2.getIdJogador()==0)
                ||
            (player2.getIdJogador()==1)
                ||
            (player2.getIdJogador()==2))
                &&(numeroPartida%2==0)){
           
        apostaADM();
        }
       
    }

    public Jogador getPlayer1() {
        return player1;
    }

    public Jogador getPlayer2() {
        return player2;
    }

    public int getPontos1() {
        return pontos1;
    }

    public int getPontos2() {
        return pontos2;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public int getIdTipoCarta() {
        return idTipoCarta;
    }
    public static void atualizaADM(){
        Usuario adm=Dados.getUsuariosBD().get(0);
        adm.getCartoesCamiseta().addAll(Cartas.camisetas.keySet());
            adm.getCartoesCartao().addAll(Cartas.cartoes.keySet());
            adm.getCartoesJogo().addAll(Cartas.jogos.keySet());
            adm.getCartoesMoeda().addAll(Cartas.jogos.keySet());
            adm.getCartoesQuadrinho().addAll(Cartas.quadrinhos.keySet());
            adm.getCartoesHotWheels().addAll(Cartas.hWheels.keySet());
            
            
    }
    public void apostaADM(){
        int maior=0;
        int indice = 0;
        for(int i=0;i<5;i++){
         if(getCarta2().getValoresAtributo()[i]>maior){
             maior=this.getCarta2().getValoresAtributo()[i];
             indice=i;
         }
        }
        this.setAposta(indice);
    }
    public boolean verificaExistenciaBaralho(){
        boolean existe = false;
        switch(idTipoCarta){
            case 1:
                if(player1.getCartoesCamiseta().isEmpty()
                        ||
                        player2.getCartoesCamiseta().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Você ou seu amigo não possui Cartas para jogar.");
                    existe=false;
                }
                else{
                    existe=true;
                }
                break;
            case 2:
                if(player1.getCartoesCartao().isEmpty()
                       ||
                        player2.getCartoesCartao().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Você ou seu amigo não possui Cartas para jogar.");  
                    existe=false;
               }else{
                    existe=true;
               }
                break;
            case 3:
                if(player1.getCartoesJogo().isEmpty()
                        ||
                        player2.getCartoesJogo().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Você ou seu amigo não possui Cartas para jogar.");  
                    existe=false;
               }else{
                    existe=true;
               }
                break;
            case 4:
               if(player1.getCartoesMoeda().isEmpty()
                       ||
                  player2.getCartoesMoeda().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Você ou seu amigo não possui Cartas para jogar.");  
               existe=false;
               }else{
               existe=true;
               }break;
            case 5:
               if(player1.getCartoesQuadrinho().isEmpty()
                       ||
                  player2.getCartoesQuadrinho().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Você ou seu amigo não possui Cartas para jogar.");  
               existe=false;
               }else{
               existe=true;
               }break;
            default:
               if(player1.getCartoesHotWheels().isEmpty()
                       ||
                  player2.getCartoesHotWheels().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Você ou seu amigo não possui Cartas para jogar.");  
              existe=false;
               }else{
               existe=true;
               }
               break;
       }
        return existe;
    }
}
