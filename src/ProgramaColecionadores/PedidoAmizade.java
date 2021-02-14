package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Casa
 */
public class PedidoAmizade extends javax.swing.JPanel {
    private Usuario e;

    /**
    * Creates new form PedidoAmizade
    * @param e
    */
    public PedidoAmizade(Usuario e) {
        this.e=e;
        initComponents();
        jLabelNome.setText(e.getNome()+" deseja ser seu amigo.");
        this.jLabelFotoUsuario.setSize(73,75);
        if(e.getFoto()!=null){                
                this.jLabelFotoUsuario.setIcon(new ImageIcon(e.getFoto().getScaledInstance(jLabelFotoUsuario.getWidth(), jLabelFotoUsuario.getHeight(), Image.SCALE_SMOOTH)));}
        else{ this.jLabelFotoUsuario.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/default_user_mini.png")).getImage().getScaledInstance(jLabelFotoUsuario.getWidth(), jLabelFotoUsuario.getHeight(), Image.SCALE_SMOOTH)));}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPedidoAmizade = new javax.swing.JPanel();
        jLabelFotoUsuario = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jButtonAceitar = new javax.swing.JButton();
        jButtonRecusar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelPedidoAmizade.setBackground(new java.awt.Color(255, 255, 255));

        jLabelFotoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelFotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFotoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(21, 30, 51)));

        jLabelNome.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(21, 30, 51));
        jLabelNome.setText("Nome Usuario");

        jButtonAceitar.setBackground(new java.awt.Color(0, 102, 0));
        jButtonAceitar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonAceitar.setForeground(java.awt.SystemColor.control);
        jButtonAceitar.setText("Aceitar");
        jButtonAceitar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonAceitar.setContentAreaFilled(false);
        jButtonAceitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceitar.setOpaque(true);
        jButtonAceitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAceitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAceitarMouseExited(evt);
            }
        });
        jButtonAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceitarActionPerformed(evt);
            }
        });

        jButtonRecusar.setBackground(new java.awt.Color(153, 0, 0));
        jButtonRecusar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonRecusar.setForeground(java.awt.SystemColor.control);
        jButtonRecusar.setText("Recusar");
        jButtonRecusar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonRecusar.setContentAreaFilled(false);
        jButtonRecusar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRecusar.setOpaque(true);
        jButtonRecusar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRecusarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRecusarMouseExited(evt);
            }
        });
        jButtonRecusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecusarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPedidoAmizadeLayout = new javax.swing.GroupLayout(jPanelPedidoAmizade);
        jPanelPedidoAmizade.setLayout(jPanelPedidoAmizadeLayout);
        jPanelPedidoAmizadeLayout.setHorizontalGroup(
            jPanelPedidoAmizadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoAmizadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPedidoAmizadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidoAmizadeLayout.createSequentialGroup()
                        .addComponent(jButtonAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecusar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanelPedidoAmizadeLayout.setVerticalGroup(
            jPanelPedidoAmizadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoAmizadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidoAmizadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFotoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPedidoAmizadeLayout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPedidoAmizadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRecusar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAceitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPedidoAmizade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPedidoAmizade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceitarActionPerformed
        Dados.getUsuariosBD().get(Principal.getIdUserLogando()).addAmigo(e.getIdUsuario());
        this.setVisible(false);
        this.getParent().getParent().getParent().setVisible(false);
        JIFrameUsuariosRede.Refresh();
    }//GEN-LAST:event_jButtonAceitarActionPerformed

    private void jButtonRecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecusarActionPerformed
        for(int i = 0; i < e.amigos.size(); i++){
            Integer p = e.amigos.get(i);
            if(p.equals(Principal.getIdUserLogando())){
                e.amigos.remove(p);break;}
            }
            this.setVisible(false);
    }//GEN-LAST:event_jButtonRecusarActionPerformed

    private void jButtonAceitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceitarMouseEntered
        Color padrao=new Color(0,153,0);
        jButtonAceitar.setBackground(padrao);
    }//GEN-LAST:event_jButtonAceitarMouseEntered

    private void jButtonAceitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceitarMouseExited
        Color padrao=new Color(0,102,0);
        jButtonAceitar.setBackground(padrao);
    }//GEN-LAST:event_jButtonAceitarMouseExited

    private void jButtonRecusarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecusarMouseEntered
        Color padrao=new Color(204,0,0);
        jButtonRecusar.setBackground(padrao);
    }//GEN-LAST:event_jButtonRecusarMouseEntered

    private void jButtonRecusarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecusarMouseExited
        Color padrao=new Color(153,0,0);
        jButtonRecusar.setBackground(padrao);
    }//GEN-LAST:event_jButtonRecusarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceitar;
    private javax.swing.JButton jButtonRecusar;
    private javax.swing.JLabel jLabelFotoUsuario;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelPedidoAmizade;
    // End of variables declaration//GEN-END:variables
}
