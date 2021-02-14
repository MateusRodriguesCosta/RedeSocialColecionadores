package view;

import ProgramaColecionadores.Camiseta;
import ProgramaColecionadores.Cartao;
import ProgramaColecionadores.ExibeItemColecao;
import ProgramaColecionadores.Item;
import ProgramaColecionadores.JIFrameCamiseta;
import ProgramaColecionadores.JIFrameCartao;
import ProgramaColecionadores.JIFrameJogo;
import ProgramaColecionadores.JIFrameMoeda;
import ProgramaColecionadores.JIFrameQuadrinho;
import ProgramaColecionadores.JIFramehWheels;
import ProgramaColecionadores.Jogo;
import ProgramaColecionadores.Moeda;
import ProgramaColecionadores.Quadrinho;
import ProgramaColecionadores.hWheels;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author casa
 */
public class IconItem extends javax.swing.JPanel {
        int idItem;
        int tipoColecao;
        ProgramaColecionadores.Item item;
        /**
        * Creates new form iconItem
        * @param item
        */
    public IconItem(Item item) {
        this.idItem=item.getIdItem();
        this.tipoColecao=item.getTipoItem();
        initComponents();
        this.item=item;
        NomeItem.setText(item.getNome());
        if(item.getFoto()!=null){
        jLabelFoto.setSize(67,69);
        jLabelFoto.setIcon(new ImageIcon(item.getFoto().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH)));
        }else{
            jLabelFoto.setSize(67,69);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        NomeItem = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabelFoto.setForeground(new java.awt.Color(240, 240, 240));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enari - imagem(item).png"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 2));
        jLabelFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFotoMousePressed(evt);
            }
        });

        NomeItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        NomeItem.setForeground(new java.awt.Color(21, 30, 51));
        NomeItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeItem.setText("Item");
        NomeItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NomeItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NomeItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomeItemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NomeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        JInternalFrame f;
        JFrame e;
        switch (tipoColecao){
          case 1:
          f = new JIFrameCamiseta((Camiseta) item);
          e = new ExibeItemColecao(f);
              break;
          case 2:
          f = new JIFrameCartao((Cartao) item);
          e = new ExibeItemColecao(f);
              break;
          case 3:
          f = new JIFrameJogo((Jogo)item);
          e = new ExibeItemColecao(f);
              break;
          case 4:
          f = new JIFrameMoeda((Moeda)item);
          e = new ExibeItemColecao(f);
              break;
          case 5:
          f = new JIFrameQuadrinho((Quadrinho)item);
          e = new ExibeItemColecao(f);
          default:
          f = new JIFramehWheels((hWheels) item);
          e=new ExibeItemColecao(f);
              break;
        }
        
    }//GEN-LAST:event_jLabelFotoMouseClicked

    private void jLabelFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseEntered
        NomeItem.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jLabelFotoMouseEntered

    private void jLabelFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseExited
        NomeItem.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_jLabelFotoMouseExited

    private void jLabelFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMousePressed
     
    }//GEN-LAST:event_jLabelFotoMousePressed

    private void NomeItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeItemMouseEntered
        NomeItem.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_NomeItemMouseEntered

    private void NomeItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeItemMouseExited
        NomeItem.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_NomeItemMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        NomeItem.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        NomeItem.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      
      JInternalFrame f;
      JFrame e;
      switch (tipoColecao){
          case 1:
          f = new JIFrameCamiseta((Camiseta) item);
          e = new ExibeItemColecao(f);
              break;
          case 2:
          f = new JIFrameCartao((Cartao) item);
          e = new ExibeItemColecao(f);
              break;
          case 3:
          f = new JIFrameJogo((Jogo)item);
          e = new ExibeItemColecao(f);
              break;
          case 4:
          f = new JIFrameMoeda((Moeda)item);
          e = new ExibeItemColecao(f);
              break;
          case 5:
          f = new JIFrameQuadrinho((Quadrinho)item);
          e = new ExibeItemColecao(f);
          default:
          f = new JIFramehWheels((hWheels) item);
          e=new ExibeItemColecao(f);
              break;
      }
    }//GEN-LAST:event_jPanel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeItem;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public Item getItem() {
        return item;
    }
}

