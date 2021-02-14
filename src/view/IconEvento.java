package view;

import ProgramaColecionadores.Evento;
import ProgramaColecionadores.JPanelItemEvento;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author casa
 */
public class IconEvento extends javax.swing.JPanel {
        Evento evento;
        /**
        * Creates new form IconEvento
        */
    public IconEvento(Evento evento) {
        this.evento=evento;
        initComponents();
        NomeEvento.setText(evento.getTitulo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        NomeEvento = new javax.swing.JLabel();

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
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Evento.png"))); // NOI18N
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

        NomeEvento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        NomeEvento.setForeground(new java.awt.Color(21, 30, 51));
        NomeEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeEvento.setText("Evento");
        NomeEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NomeEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NomeEventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomeEventoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NomeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JPanelItemEvento e=new JPanelItemEvento(evento.getIdEvento());
        JOptionPane.showMessageDialog(null,e); 
    }//GEN-LAST:event_jLabelFotoMouseClicked

    private void jLabelFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseEntered
        NomeEvento.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jLabelFotoMouseEntered

    private void jLabelFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseExited
        NomeEvento.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_jLabelFotoMouseExited

    private void jLabelFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMousePressed

    }//GEN-LAST:event_jLabelFotoMousePressed

    private void NomeEventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeEventoMouseEntered
        jPanel1.setBackground(Color.GRAY);
    }//GEN-LAST:event_NomeEventoMouseEntered

    private void NomeEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeEventoMouseExited
        NomeEvento.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_NomeEventoMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        NomeEvento.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        NomeEvento.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        JPanelItemEvento e=new JPanelItemEvento(evento.getIdEvento());
        JOptionPane.showMessageDialog(null,e); 
    }//GEN-LAST:event_jPanel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeEvento;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
