package view;

import ProgramaColecionadores.JIFrameListarCartao;
import ProgramaColecionadores.JIFramePerfil;
import ProgramaColecionadores.Principal;
import java.awt.Image;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Mateus
 */
public class Colecoes extends javax.swing.JInternalFrame {

    public Colecoes() {
        initComponents();
        this.setBorder(null);
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        //botao hotwheels
        ImageIcon imgHW=new ImageIcon(Principal.class.getResource("/Images/CHotwheels.jpg"));
        botaoHW.setSize(370,110);
        this.botaoHW.setIcon(new ImageIcon(imgHW.getImage().getScaledInstance(botaoHW.getWidth(), botaoHW.getHeight(), Image.SCALE_SMOOTH)));
        //botao jogos
        ImageIcon imgJG=new ImageIcon(Principal.class.getResource("/Images/CJogos.jpg"));
        botaoJogos.setSize(370,110);
        this.botaoJogos.setIcon(new ImageIcon(imgJG.getImage().getScaledInstance(botaoJogos.getWidth(), botaoJogos.getHeight(), Image.SCALE_SMOOTH)));        
        //botao comics
        ImageIcon imgCM=new ImageIcon(Principal.class.getResource("/Images/CComics.jpg"));
        botaoComics.setSize(370,110);
        this.botaoComics.setIcon(new ImageIcon(imgCM.getImage().getScaledInstance(botaoComics.getWidth(), botaoComics.getHeight(), Image.SCALE_SMOOTH)));
        //botao cartoes
        ImageIcon imgCRT=new ImageIcon(Principal.class.getResource("/Images/CCartoes.jpg"));
        botaoCartoes.setSize(370,110);
        this.botaoCartoes.setIcon(new ImageIcon(imgCRT.getImage().getScaledInstance(botaoCartoes.getWidth(), botaoCartoes.getHeight(), Image.SCALE_SMOOTH)));
        //botao camisetas
        ImageIcon imgCMT=new ImageIcon(Principal.class.getResource("/Images/CCamisetas.jpg"));
        botaoCamisetas.setSize(370,110);
        this.botaoCamisetas.setIcon(new ImageIcon(imgCMT.getImage().getScaledInstance(botaoCamisetas.getWidth(), botaoCamisetas.getHeight(), Image.SCALE_SMOOTH)));
        //botao moedas
        ImageIcon imgMD=new ImageIcon(Principal.class.getResource("/Images/CMoedas.png"));
        botaoMoedas.setSize(370,110);
        this.botaoMoedas.setIcon(new ImageIcon(imgMD.getImage().getScaledInstance(botaoMoedas.getWidth(), botaoMoedas.getHeight(), Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoHW = new javax.swing.JButton();
        botaoJogos = new javax.swing.JButton();
        botaoComics = new javax.swing.JButton();
        botaoCartoes = new javax.swing.JButton();
        botaoCamisetas = new javax.swing.JButton();
        botaoMoedas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 3, 3));

        botaoHW.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botaoHW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        botaoHW.setContentAreaFilled(false);
        botaoHW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoHW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoHWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoHWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoHWMouseExited(evt);
            }
        });
        botaoHW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHWActionPerformed(evt);
            }
        });
        jPanel1.add(botaoHW);

        botaoJogos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botaoJogos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        botaoJogos.setContentAreaFilled(false);
        botaoJogos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoJogosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoJogosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoJogosMouseExited(evt);
            }
        });
        jPanel1.add(botaoJogos);

        botaoComics.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botaoComics.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        botaoComics.setContentAreaFilled(false);
        botaoComics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoComics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoComicsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoComicsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoComicsMouseExited(evt);
            }
        });
        jPanel1.add(botaoComics);

        botaoCartoes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botaoCartoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        botaoCartoes.setContentAreaFilled(false);
        botaoCartoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCartoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCartoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCartoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCartoesMouseExited(evt);
            }
        });
        jPanel1.add(botaoCartoes);

        botaoCamisetas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botaoCamisetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        botaoCamisetas.setContentAreaFilled(false);
        botaoCamisetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCamisetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCamisetasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCamisetasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCamisetasMouseExited(evt);
            }
        });
        botaoCamisetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCamisetasActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCamisetas);

        botaoMoedas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botaoMoedas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        botaoMoedas.setContentAreaFilled(false);
        botaoMoedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMoedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMoedasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoMoedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoMoedasMouseExited(evt);
            }
        });
        jPanel1.add(botaoMoedas);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 740, 330));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("COLEÇÕES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 600, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCartoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCartoesMouseClicked
        JIFramePerfil.botaoCartoes();
    }//GEN-LAST:event_botaoCartoesMouseClicked

    private void botaoCamisetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCamisetasMouseClicked
        JIFramePerfil.botaoCamisetas();
    }//GEN-LAST:event_botaoCamisetasMouseClicked

    private void botaoMoedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMoedasMouseClicked
        JIFramePerfil.botaoMoedas();
    }//GEN-LAST:event_botaoMoedasMouseClicked

    private void botaoComicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoComicsMouseClicked
        JIFramePerfil.botaoComics();
    }//GEN-LAST:event_botaoComicsMouseClicked

    private void botaoJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoJogosMouseClicked
        JIFramePerfil.botaoJogos();
    }//GEN-LAST:event_botaoJogosMouseClicked

    private void botaoHWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoHWMouseClicked
        JIFramePerfil.botaohWheels();
    }//GEN-LAST:event_botaoHWMouseClicked

    private void botaoHWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoHWMouseEntered
        ImageIcon imgHW=new ImageIcon(Principal.class.getResource("/Images/CHotwheels_Cinza.jpg"));
        this.botaoHW.setIcon(new ImageIcon(imgHW.getImage().getScaledInstance(botaoHW.getWidth(), botaoHW.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoHWMouseEntered

    private void botaoHWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoHWMouseExited
        ImageIcon imgHW=new ImageIcon(Principal.class.getResource("/Images/CHotwheels.jpg"));
        this.botaoHW.setIcon(new ImageIcon(imgHW.getImage().getScaledInstance(botaoHW.getWidth(), botaoHW.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoHWMouseExited

    private void botaoCartoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCartoesMouseEntered
        ImageIcon imgCRT=new ImageIcon(Principal.class.getResource("/Images/CCartoes_Cinza.jpg"));
        this.botaoCartoes.setIcon(new ImageIcon(imgCRT.getImage().getScaledInstance(botaoCartoes.getWidth(), botaoCartoes.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoCartoesMouseEntered

    private void botaoCartoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCartoesMouseExited
        ImageIcon imgCRT=new ImageIcon(Principal.class.getResource("/Images/CCartoes.jpg"));
        this.botaoCartoes.setIcon(new ImageIcon(imgCRT.getImage().getScaledInstance(botaoCartoes.getWidth(), botaoCartoes.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoCartoesMouseExited

    private void botaoJogosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoJogosMouseEntered
        ImageIcon imgJG=new ImageIcon(Principal.class.getResource("/Images/CJogos_Cinza.jpg"));
        this.botaoJogos.setIcon(new ImageIcon(imgJG.getImage().getScaledInstance(botaoJogos.getWidth(), botaoJogos.getHeight(), Image.SCALE_SMOOTH)));        
    }//GEN-LAST:event_botaoJogosMouseEntered

    private void botaoJogosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoJogosMouseExited
        ImageIcon imgJG=new ImageIcon(Principal.class.getResource("/Images/CJogos.jpg"));
        this.botaoJogos.setIcon(new ImageIcon(imgJG.getImage().getScaledInstance(botaoJogos.getWidth(), botaoJogos.getHeight(), Image.SCALE_SMOOTH)));        
    }//GEN-LAST:event_botaoJogosMouseExited

    private void botaoCamisetasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCamisetasMouseEntered
        ImageIcon imgCMT=new ImageIcon(Principal.class.getResource("/Images/CCamisetas_Cinza.jpg"));
        this.botaoCamisetas.setIcon(new ImageIcon(imgCMT.getImage().getScaledInstance(botaoCamisetas.getWidth(), botaoCamisetas.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoCamisetasMouseEntered

    private void botaoCamisetasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCamisetasMouseExited
        ImageIcon imgCMT=new ImageIcon(Principal.class.getResource("/Images/CCamisetas.jpg"));
        this.botaoCamisetas.setIcon(new ImageIcon(imgCMT.getImage().getScaledInstance(botaoCamisetas.getWidth(), botaoCamisetas.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoCamisetasMouseExited

    private void botaoComicsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoComicsMouseEntered
        ImageIcon imgCM=new ImageIcon(Principal.class.getResource("/Images/CComics_Cinza.jpg"));
        this.botaoComics.setIcon(new ImageIcon(imgCM.getImage().getScaledInstance(botaoComics.getWidth(), botaoComics.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoComicsMouseEntered

    private void botaoComicsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoComicsMouseExited
        ImageIcon imgCM=new ImageIcon(Principal.class.getResource("/Images/CComics.jpg"));
        this.botaoComics.setIcon(new ImageIcon(imgCM.getImage().getScaledInstance(botaoComics.getWidth(), botaoComics.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoComicsMouseExited

    private void botaoMoedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMoedasMouseEntered
        ImageIcon imgMD=new ImageIcon(Principal.class.getResource("/Images/CMoedas_Cinza.png"));
        this.botaoMoedas.setIcon(new ImageIcon(imgMD.getImage().getScaledInstance(botaoMoedas.getWidth(), botaoMoedas.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoMoedasMouseEntered

    private void botaoMoedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMoedasMouseExited
        ImageIcon imgMD=new ImageIcon(Principal.class.getResource("/Images/CMoedas.png"));
        this.botaoMoedas.setIcon(new ImageIcon(imgMD.getImage().getScaledInstance(botaoMoedas.getWidth(), botaoMoedas.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botaoMoedasMouseExited

    private void botaoCamisetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCamisetasActionPerformed
       JIFramePerfil.botaoCamisetas();
    }//GEN-LAST:event_botaoCamisetasActionPerformed

    private void botaoHWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoHWActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCamisetas;
    private javax.swing.JButton botaoCartoes;
    private javax.swing.JButton botaoComics;
    private javax.swing.JButton botaoHW;
    private javax.swing.JButton botaoJogos;
    private javax.swing.JButton botaoMoedas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
