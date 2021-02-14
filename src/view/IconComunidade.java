package view;

import ProgramaColecionadores.Comunidade;
import ProgramaColecionadores.Dados;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Casa
 */
public class IconComunidade extends javax.swing.JPanel {
        private final int idComunidade;
        /**
        * Creates new form IconComunidade
        * @param idComunidade
        */
    public IconComunidade(int idComunidade) {
        this.idComunidade=idComunidade;
        initComponents();
        ProgramaColecionadores.Comunidade comunidade=Dados.getComunidadePorID().get(idComunidade);
        NomeComunidade.setText(comunidade.getNome());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        NomeComunidade = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comunidade_Azul.png"))); // NOI18N
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

        NomeComunidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        NomeComunidade.setForeground(new java.awt.Color(21, 30, 51));
        NomeComunidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeComunidade.setText("Comunidade");
        NomeComunidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NomeComunidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomeComunidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NomeComunidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomeComunidadeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NomeComunidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        PanelComunidade janelaComunidade=new PanelComunidade(idComunidade);
        JOptionPane.getDesktopPaneForComponent(this).add(janelaComunidade);
        janelaComunidade.setVisible(true);
        try {janelaComunidade.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        PanelComunidade janelaComunidade=new PanelComunidade(idComunidade);
        JOptionPane.getDesktopPaneForComponent(this).add(janelaComunidade);
        janelaComunidade.setVisible(true);
        try {janelaComunidade.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_jLabelFotoMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        PanelComunidade janelaComunidade=new PanelComunidade(idComunidade);
        JOptionPane.getDesktopPaneForComponent(this).add(janelaComunidade);
        janelaComunidade.setVisible(true);
        try {janelaComunidade.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabelFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMousePressed
        PanelComunidade janelaComunidade=new PanelComunidade(idComunidade);
        JOptionPane.getDesktopPaneForComponent(this).add(janelaComunidade);
        janelaComunidade.setVisible(true);
        try {janelaComunidade.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_jLabelFotoMousePressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        NomeComunidade.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        NomeComunidade.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_jPanel1MouseExited

    private void NomeComunidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeComunidadeMouseEntered
        NomeComunidade.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_NomeComunidadeMouseEntered

    private void NomeComunidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeComunidadeMouseExited
        NomeComunidade.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_NomeComunidadeMouseExited

    private void jLabelFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseEntered
        NomeComunidade.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jLabelFotoMouseEntered

    private void jLabelFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseExited
        NomeComunidade.setFont(new Font("Verdana",Font.BOLD,12));
    }//GEN-LAST:event_jLabelFotoMouseExited

    private void NomeComunidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomeComunidadeMouseClicked
        PanelComunidade janelaComunidade=new PanelComunidade(idComunidade);
        JOptionPane.getDesktopPaneForComponent(this).add(janelaComunidade);
        janelaComunidade.setVisible(true);
        try {janelaComunidade.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_NomeComunidadeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeComunidade;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
