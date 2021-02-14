/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author lorencia
 */
public class TelaJogo extends javax.swing.JPanel {

    int idUserLogando;
    private TelaCarta carta1;
    private TelaCarta carta2;
    private Jogador jogador1;
    private Jogador jogador2;
    private Trunfo jogo;
    private TelaJogo tela=this;
    public Integer estado=1;
     
    public TelaJogo(int idJogo) {
       this.jogo=Trunfo.getJogos().get(idJogo);
       this.jogador1=jogo.getPlayer1();
       this.jogador2=jogo.getPlayer2();
       if(jogo.verificaExistenciaBaralho()){
        inicializa();
       }
       
    }
    private void inicializa(){
       this.removeAll();
       initComponents();
       this.jLabelNome1.setText(jogador1.getNome());
       this.jLabelNome2.setText(jogador2.getNome());
       this.jLabelIdJogo.setText("Id Jogo:"+jogo.getIdJogo());
       this.tela=this;
       tela.reTela();
    }
    private void reTela(){
        
       int delay = 000;   // delay de 0 seg.
       int interval = 200;  // intervalo de 0,2 seg.
       Timer timer = new Timer();
       //tela.atualizaTela();
       timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                // colocar tarefas aqui ...
                if(tela.estado!= jogo.estado){//funciona como o bit sujo de SO
                estado=jogo.estado;    
                tela.atualizaTela();
                }
              
            }
        }, delay, interval);
    }
    private TelaCarta exibeCarta1(){
       carta1=new TelaCarta(jogo.getIdJogo(),jogo.getCarta1());
       jPanelCarta1.removeAll();
       this.jPanelCarta1.add(carta1);
       carta1.setVisible(true);
       this.jPanelCarta1.updateUI();
       return carta1;
}
    private TelaCarta exibeCarta2(){
       carta2=new TelaCarta(jogo.getIdJogo(),jogo.getCarta2());
       jPanelCarta2.removeAll();
       this.jPanelCarta2.add(carta2);
       carta2.setVisible(true);
       this.jPanelCarta2.updateUI();
       return carta2;
    }
    private void limpaTelas(){
        jPanelCarta1.removeAll();
        jPanelCarta1.updateUI();
        jPanelCarta2.removeAll();
        jPanelCarta2.updateUI();
        
    }
private void atualizaTela(){
    limpaTelas();
    this.jButtonNovaPartida.setEnabled(true);
     
    if(jogo.getAposta()!=null){
             exibeCarta1();
             exibeCarta2();
    }
    else{
        this.jButtonNovaPartida.setEnabled(false);
        if(jogo.getNumeroPartida()%2==1){
            if(jogador1.getIdJogador()==idUserLogando){
                exibeCarta1();
            }else{
                exibeCarta2().bloquearTela();
            }
        }
        else{
            if(jogador1.getIdJogador()==idUserLogando){
                exibeCarta1().bloquearTela();
            }else{
                exibeCarta2();
            }
        }
    }
       if(carta1!=null){carta1.botaoSelecionado();}
       this.jLabelEstado.setText(jogo.getEstado());
       if(carta2!=null){carta2.botaoSelecionado();}
       this.jLabelScore.setText("Score - "+jogo.getPontos1());
       this.jLabelScore2.setText("Score - "+jogo.getPontos2());
       switch(jogo.getIdTipoCarta()){
           case 1:
                this.jLabelItem1.setText("Itens:"+jogador1.getCartoesCamiseta().size());
                this.jLabelItem2.setText("Itens:"+jogador2.getCartoesCamiseta().size());
                break;
           case 2:
               this.jLabelItem1.setText("Itens:"+jogador1.getCartoesCartao().size());
                this.jLabelItem2.setText("Itens:"+jogador2.getCartoesCartao().size());
                break;
           case 3:
               this.jLabelItem1.setText("Itens:"+jogador1.getCartoesJogo().size());
                this.jLabelItem2.setText("Itens:"+jogador2.getCartoesJogo().size());
                break;
           case 4:
               this.jLabelItem1.setText("Itens:"+jogador1.getCartoesMoeda().size());
                this.jLabelItem2.setText("Itens:"+jogador2.getCartoesMoeda().size());
                break;
           case 5:
               this.jLabelItem1.setText("Itens:"+jogador1.getCartoesQuadrinho().size());
                this.jLabelItem2.setText("Itens:"+jogador2.getCartoesQuadrinho().size());
                break;
           default:
               this.jLabelItem1.setText("Itens:"+jogador1.getCartoesHotWheels().size());
                this.jLabelItem2.setText("Itens:"+jogador2.getCartoesHotWheels().size());
                break;
               
       }
       this.jLabelNumeroPartida.setText("Nº Partida:"+jogo.getNumeroPartida());
       
       
      
}
    
public static void main(String args[]) {
    
       Cartas cartas=new Cartas();
       cartas.preecherListas();
       Jogador jogador1 =new Jogador(1);
       Jogador.jogadores.put(jogador1.getIdJogador(), jogador1);
       Jogador jogador2 =new Jogador(2);
       Jogador.jogadores.put(jogador2.getIdJogador(), jogador2);
       jogador2.setCamiseta(0);
       jogador2.setCamiseta(1);
       jogador2.setCamiseta(3);
       jogador2.setCamiseta(4);
       jogador2.setCamiseta(5);
       jogador2.setCamiseta(0);
     
       jogador1.setCamiseta(0);
       jogador1.setCamiseta(1);
       jogador1.setCamiseta(3);
       jogador1.setCamiseta(4);
       jogador1.setCamiseta(0);
       jogador1.setCamiseta(2);
       jogador1.setCamiseta(1);
     
       jogador2.setCartao(0);
       jogador2.setCartao(1);
       jogador2.setCartao(3);
       jogador2.setCartao(4);
       jogador2.setCartao(5);
       jogador2.setCartao(0);
       jogador1.setCartao(0);
       jogador1.setCartao(1);
       jogador1.setCartao(3);
       jogador1.setCartao(4);
       jogador1.setCartao(0);
       jogador1.setCartao(2);
       jogador1.setCartao(1);
       
        Trunfo jogo=new Trunfo(1,2,1);
        
        final TelaJogo tela=new TelaJogo(0);
        final TelaJogo tela2=new TelaJogo(0);
        tela.idUserLogando=1;
        tela2.idUserLogando=2;
        JFrame container = new JFrame("Minha tela de jogo");
        container.setPreferredSize(new Dimension(800,600));  
        container.setBounds(0,0,800,600); 
        container.add(tela); 
        tela.setVisible(true);
        container.setVisible(true);
        JFrame container2 = new JFrame("Minha tela de jogo");
        container2.setPreferredSize(new Dimension(800,600));  
        container2.setBounds(0,0,800,600); 
        container2.add(tela2); 
        tela2.setVisible(true);
        container2.setVisible(true);
    

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelScore2 = new javax.swing.JLabel();
        jLabelNumeroPartida = new javax.swing.JLabel();
        jLabelItem1 = new javax.swing.JLabel();
        jLabelItem2 = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();
        jLabelNome2 = new javax.swing.JLabel();
        jLabelIdJogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelEstado = new javax.swing.JLabel();
        jButtonNovaPartida = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelCarta1 = new javax.swing.JPanel();
        jPanelCarta2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(254, 254, 254));
        setMaximumSize(new java.awt.Dimension(32767, 500));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 30, 51));
        jLabel2.setText("Jogador 1");

        jLabelScore.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelScore.setForeground(new java.awt.Color(21, 30, 51));
        jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore.setText("Score: ");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 30, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Jogador 2");

        jLabelScore2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelScore2.setForeground(new java.awt.Color(21, 30, 51));
        jLabelScore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore2.setText("Score: ");

        jLabelNumeroPartida.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N

        jLabelItem1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelItem1.setForeground(new java.awt.Color(21, 30, 51));
        jLabelItem1.setText("Itens:");

        jLabelItem2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelItem2.setForeground(new java.awt.Color(21, 30, 51));
        jLabelItem2.setText("Itens:");

        jLabelNome1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelNome1.setForeground(new java.awt.Color(21, 30, 51));
        jLabelNome1.setText("Nome");

        jLabelNome2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelNome2.setForeground(new java.awt.Color(21, 30, 51));
        jLabelNome2.setText("Nome2");

        jLabelIdJogo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelIdJogo.setForeground(new java.awt.Color(21, 30, 51));
        jLabelIdJogo.setText("ID  Jogo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelScore, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIdJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabelNumeroPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabelScore2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelIdJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        jLabelEstado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(21, 30, 51));
        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado.setText("Estado");

        jButtonNovaPartida.setBackground(new java.awt.Color(21, 30, 51));
        jButtonNovaPartida.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonNovaPartida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovaPartida.setText("NovaPartida");
        jButtonNovaPartida.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonNovaPartida.setContentAreaFilled(false);
        jButtonNovaPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovaPartida.setOpaque(true);
        jButtonNovaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        add(jPanel2);

        jPanelMain.setBorder(new javax.swing.border.MatteBorder(null));
        jPanelMain.setLayout(new java.awt.GridLayout(1, 0));

        jPanelCarta1.setBackground(new java.awt.Color(254, 254, 254));
        jPanelCarta1.setLayout(new javax.swing.BoxLayout(jPanelCarta1, javax.swing.BoxLayout.LINE_AXIS));
        jPanelMain.add(jPanelCarta1);

        jPanelCarta2.setBackground(new java.awt.Color(254, 254, 254));
        jPanelCarta2.setLayout(new javax.swing.BoxLayout(jPanelCarta2, javax.swing.BoxLayout.LINE_AXIS));
        jPanelMain.add(jPanelCarta2);

        add(jPanelMain);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaPartidaActionPerformed
        if(jogo.verificaExistenciaBaralho()){   
        jogo.inicializaPartida();
        this.atualizaTela();
        }
    }//GEN-LAST:event_jButtonNovaPartidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNovaPartida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelIdJogo;
    private javax.swing.JLabel jLabelItem1;
    private javax.swing.JLabel jLabelItem2;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelNumeroPartida;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelScore2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCarta1;
    private javax.swing.JPanel jPanelCarta2;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables

    public void setIdUserLogando(int idUserLogando) {
        this.idUserLogando = idUserLogando;
    }

    public boolean getPossuiCartas() {
        return jogo.verificaExistenciaBaralho();
    }

   
    
}
