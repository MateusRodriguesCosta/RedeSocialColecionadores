package view;

import ProgramaColecionadores.*;
import java.awt.Font;
import java.awt.Image;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Casa
 */
public class IconUser extends javax.swing.JPanel {
        Usuario user;
        private int idUser;
        /**
        * Creates new form IconUser
        */
    public IconUser(int idUser) {
        this.idUser=idUser;
        user=Dados.getUsuariosBD().get(idUser);
        initComponents();
        this.NomeUsuario.setText(user.getNome());
        if(user.getFoto()!=null){
               jLabelFoto.updateUI();
               jLabelFoto.setSize(69, 69);
               this.jLabelFoto.setIcon(new ImageIcon(user.getFoto().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH))); 
               jLabelFoto.updateUI();
        }else{
            jLabelFoto.updateUI();
            jLabelFoto.setSize(69, 69);
            ImageIcon img01= new ImageIcon(Principal.class.getResource("/Images/default_user_mini.png"));
            ImageIcon img02=new ImageIcon(img01.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH));
            jLabelFoto.setIcon(img02);}
            jLabelFoto.updateUI();
    }
    public IconUser() {
        initComponents();
        
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
        atualiza();
    }

    private void atualiza(){
         user=Dados.getUsuariosBD().get(idUser);
         this.NomeUsuario.setText(user.getNome());
        if(user.getFoto()!=null){
               jLabelFoto.updateUI();
               jLabelFoto.setSize(69, 69);
               this.jLabelFoto.setIcon(new ImageIcon(user.getFoto().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH))); 
               jLabelFoto.updateUI();
        }else{
            jLabelFoto.updateUI();
            jLabelFoto.setSize(69, 69);
            ImageIcon img01= new ImageIcon(Principal.class.getResource("/Images/default_user_mini.png"));
            ImageIcon img02=new ImageIcon(img01.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH));
            jLabelFoto.setIcon(img02);}
            jLabelFoto.updateUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        NomeUsuario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 2));
        jLabelFoto.setMaximumSize(new java.awt.Dimension(58, 69));
        jLabelFoto.setMinimumSize(new java.awt.Dimension(58, 69));
        jLabelFoto.setPreferredSize(new java.awt.Dimension(58, 69));

        NomeUsuario.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        NomeUsuario.setForeground(new java.awt.Color(21, 30, 51));
        NomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeUsuario.setText("NomeUser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeUsuario))
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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Principal.VisitaPerfil(idUser);
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeUsuario;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
