package Jogo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author lorencia
 */
public class Cartas {
    public static HashMap<Integer,Carta> camisetas=new HashMap<Integer,Carta>();  
    public static HashMap<Integer,Carta> cartoes=new HashMap<Integer,Carta>();
    public static HashMap<Integer,Carta> jogos=new HashMap<Integer,Carta>();
    public static HashMap<Integer,Carta> moedas=new HashMap<Integer,Carta>();
    public static HashMap<Integer,Carta> quadrinhos=new HashMap<Integer,Carta>();
    public static HashMap<Integer,Carta> hWheels=new HashMap<Integer,Carta>();
    private final InputStream arquivo=getClass().getClassLoader().getResourceAsStream("Jogo/listacartao.txt"); 
    private final Scanner s = new Scanner(arquivo); 
    
    
   
    public Cartas() {       
    }
    public void preecherListas(){
        while(s.hasNext()){
            
            String linha = s.next();
            if(linha.contains("*")){
                s.close();
                break;
            }
            String temp[]=linha.split("-");
            Carta carta=new Carta(
                    Integer.parseInt(temp[0]),
                    temp[1],
                    Integer.parseInt(temp[2]),
                    Integer.parseInt(temp[3]),
                    Integer.parseInt(temp[4]),
                    Integer.parseInt(temp[5]),
                    Integer.parseInt(temp[6]),
                    temp[7]);
        System.out.println(carta.getIdCarta()+carta.getTitulo());
        System.out.println(".");
        } 
    }
    public static HashMap<Integer, Carta> getCamisetas() {return camisetas;}
    public static HashMap<Integer, Carta> getCartoes() {return cartoes;}
    public static HashMap<Integer, Carta> getJogos() {return jogos;}
    public static HashMap<Integer, Carta> getMoedas() {return moedas;}
    public static HashMap<Integer, Carta> getQuadrinhos() {return quadrinhos;}
    public static HashMap<Integer, Carta> gethWheels() {return hWheels;}
    
    
            
    public class Carta{
        private int idCarta;
        private int tipoCarta;
        private String titulo;
        private int[] valoresAtributo=new int[5];
        private ImageIcon imagem;
        public Carta(int tipo, String titulo, Integer opcao1,Integer opcao2,Integer opcao3,Integer opcao4,Integer opcao5,String imagemPath) {
            this.tipoCarta=tipo;
            switch(tipoCarta){
                case 1:this.idCarta=camisetas.size();break;
                case 2:this.idCarta=cartoes.size();break;
                case 3:this.idCarta=jogos.size();break;
                case 4:this.idCarta=moedas.size();break;
                case 5:this.idCarta=quadrinhos.size();break;
                default:this.idCarta=hWheels.size();break;
            }
            this.imagem=new ImageIcon(getClass().getResource(imagemPath));
            this.titulo=titulo;
            this.valoresAtributo[0]=opcao1;
            this.valoresAtributo[1]=opcao2;
            this.valoresAtributo[2]=opcao3;
            this.valoresAtributo[3]=opcao4;
            this.valoresAtributo[4]=opcao5;
            switch(tipoCarta){
                case 1:Cartas.camisetas.put(idCarta, this);break;
                case 2:Cartas.cartoes.put(idCarta, this);break;
                case 3:Cartas.jogos.put(idCarta, this);break;
                case 4:Cartas.moedas.put(idCarta, this);break;
                case 5:Cartas.quadrinhos.put(idCarta, this);break;
                default:Cartas.hWheels.put(idCarta, this);break;
            }
             
        }

        public int getIdCarta() {return idCarta;}
        public int getTipoCarta() {return tipoCarta;}
        public ImageIcon getImagem() {return imagem;}
        public int[] getValoresAtributo() {return valoresAtributo;}
        public String getTitulo() {return titulo;}
        public String[] getOpcaosAposta(){
            String[] opcaoAposta=new String[5];
            switch(tipoCarta){
            case 1: 
                opcaoAposta[0]="Popularidade: "+valoresAtributo[0];
                opcaoAposta[1]="Ataque: "+valoresAtributo[1];
                opcaoAposta[2]="Defesa: "+valoresAtributo[2];
                opcaoAposta[3]="União: "+valoresAtributo[3];
                opcaoAposta[4]="Campeonato: "+valoresAtributo[4];
                break;
            case 2:
                opcaoAposta[0]="Antiguidade: "+valoresAtributo[0];
                opcaoAposta[1]="Raridade: "+valoresAtributo[1];
                opcaoAposta[2]="Popularidade: "+valoresAtributo[2];
                opcaoAposta[3]="Preço: "+valoresAtributo[3];
                opcaoAposta[4]="Comemorativo: "+valoresAtributo[4];
                break;
            case 3:
                opcaoAposta[0]="Antiguidade: "+valoresAtributo[0];
                opcaoAposta[1]="Raridade: "+valoresAtributo[1];
                opcaoAposta[2]="Popularidade: "+valoresAtributo[2];
                opcaoAposta[3]="Preço: "+valoresAtributo[3];
                opcaoAposta[4]="Jogabilidade: "+valoresAtributo[4];
                break;
            case 4:
                opcaoAposta[0]="Antiguidade: "+valoresAtributo[0];
                opcaoAposta[1]="Raridade: "+valoresAtributo[1];
                opcaoAposta[2]="Popularidade: "+valoresAtributo[2];
                opcaoAposta[3]="Material: "+valoresAtributo[3];
                opcaoAposta[4]="Poder de compra: "+valoresAtributo[4];
                break;
            case 5:
                opcaoAposta[0]="Antiguidade: "+valoresAtributo[0];
                opcaoAposta[1]="Raridade: "+valoresAtributo[1];
                opcaoAposta[2]="Popularidade: "+valoresAtributo[2];
                opcaoAposta[3]="Preço: "+valoresAtributo[3];
                opcaoAposta[4]="Páginas: "+valoresAtributo[4];
                break;
            default:
                opcaoAposta[0]="Antiguidade: "+valoresAtributo[0];
                opcaoAposta[1]="Raridade: "+valoresAtributo[1];
                opcaoAposta[2]="Popularidade: "+valoresAtributo[2];
                opcaoAposta[3]="Preço: "+valoresAtributo[3];
                opcaoAposta[4]="Comemorativo: "+valoresAtributo[4];
                break;
        }
        return opcaoAposta;
        }
    }
    public Carta getCarta(int idCarta,int idTipoCarta){
        Carta carta;
        switch(idTipoCarta){
            case 1: carta=camisetas.get(idCarta);break;
            case 2: carta=cartoes.get(idCarta);break;
            case 3: carta=jogos.get(idCarta);break;
            case 4: carta=moedas.get(idCarta);break;
            case 5: carta=quadrinhos.get(idCarta);break;
            default:carta=hWheels.get(idCarta);break;
        }
        return carta;
        
    }
  
}
