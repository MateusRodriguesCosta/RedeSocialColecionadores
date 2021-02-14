package ProgramaColecionadores;

import java.awt.Color;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casa
 */
public class JIFrameListarUsuarios extends javax.swing.JInternalFrame {
   public int idUsuario;
    public int idUserLogando=Principal.getIdUserLogando();
    /**
     * Creates new form JIFrameListarUsuarios
     */
    public JIFrameListarUsuarios() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        
        listarUsuarios();
        this.jButtonRemoverAmigo1.setVisible(false);
    }
     public JIFrameListarUsuarios(int idUsuario) {
         this.idUsuario=idUsuario;
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        
        listarAmigos();
        this.jButtonAdicionarAmigo1.setVisible(false);
    }   
    private void listarUsuarios() {

        DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
        dtm.setNumRows(0);

        for (Usuario usuario : Dados.getUsuarios()) {//percorre a lista de usuarios
            if(usuario.getIdUsuario()!=0)if(usuario.getPrivacidade()!=2){//se o usuario conter  id de administrador ou tiver perfil privado
                if(usuario.getPrivacidade()==1){
                    if(usuario.amigos.contains(idUserLogando)){
                        dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getIdioma(),
                        usuario.getEmail(),
                        usuario.getTelefone(),
                        });
                    }
                }else{
                    dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getIdioma(),
                        usuario.getEmail(),
                        usuario.getTelefone()});
                }
            }
        }
    }
     private void listarAmigos() {
        
        DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
        dtm.setNumRows(0);

        for (Usuario usuario : Dados.getAmigos(idUsuario)) {//percorre a lista de usuarios
            if(usuario.getIdUsuario()!=0)if(usuario.getPrivacidade()!=2){//se o usuario conter  id de administrador ou tiver perfil privado
                if(usuario.getPrivacidade()==1){
                    if(usuario.amigos.contains(idUserLogando)){
                        dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getTelefone()});
                    }
                }else{
                    dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getTelefone()});}
            }
        }
    
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbListarCliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonVisualizar1 = new javax.swing.JButton();
        jButtonAdicionarAmigo1 = new javax.swing.JButton();
        jButtonRemoverAmigo1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));

        jtbListarCliente.setBackground(new java.awt.Color(240, 240, 240));
        jtbListarCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarCliente.setForeground(new java.awt.Color(21, 30, 51));
        jtbListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Rank", "Idioma", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarCliente.setGridColor(new java.awt.Color(21, 30, 51));
        jtbListarCliente.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbListarCliente);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButtonVisualizar1.setBackground(new java.awt.Color(21, 30, 51));
        jButtonVisualizar1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonVisualizar1.setForeground(java.awt.SystemColor.control);
        jButtonVisualizar1.setText("Visualizar");
        jButtonVisualizar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonVisualizar1.setContentAreaFilled(false);
        jButtonVisualizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVisualizar1.setFocusPainted(false);
        jButtonVisualizar1.setOpaque(true);
        jButtonVisualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVisualizar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVisualizar1MouseExited(evt);
            }
        });
        jButtonVisualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizar1ActionPerformed(evt);
            }
        });

        jButtonAdicionarAmigo1.setBackground(new java.awt.Color(0, 102, 0));
        jButtonAdicionarAmigo1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonAdicionarAmigo1.setForeground(java.awt.SystemColor.control);
        jButtonAdicionarAmigo1.setText("Adicionar Amigo");
        jButtonAdicionarAmigo1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonAdicionarAmigo1.setContentAreaFilled(false);
        jButtonAdicionarAmigo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarAmigo1.setFocusPainted(false);
        jButtonAdicionarAmigo1.setOpaque(true);
        jButtonAdicionarAmigo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAdicionarAmigo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAdicionarAmigo1MouseExited(evt);
            }
        });
        jButtonAdicionarAmigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarAmigo1ActionPerformed(evt);
            }
        });

        jButtonRemoverAmigo1.setBackground(new java.awt.Color(153, 0, 0));
        jButtonRemoverAmigo1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonRemoverAmigo1.setForeground(java.awt.SystemColor.control);
        jButtonRemoverAmigo1.setText("Remover Amigo");
        jButtonRemoverAmigo1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonRemoverAmigo1.setContentAreaFilled(false);
        jButtonRemoverAmigo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverAmigo1.setFocusPainted(false);
        jButtonRemoverAmigo1.setOpaque(true);
        jButtonRemoverAmigo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRemoverAmigo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRemoverAmigo1MouseExited(evt);
            }
        });
        jButtonRemoverAmigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverAmigo1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(21, 30, 51));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.control);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pendentes");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRemoverAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionarAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVisualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonRemoverAmigo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonVisualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionarAmigo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizar1ActionPerformed
    if (jtbListarCliente.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum usuário selecionado");}
     Integer idUsuario = (Integer) jtbListarCliente.getValueAt(jtbListarCliente.getSelectedRow(), 0);
     
     JIFramePerfil jIFramePefil = new JIFramePerfil(idUsuario);
     jIFramePefil.idUserLogando=Principal.getIdUserLogando();
     this.getDesktopPane().add(jIFramePefil);
     jIFramePefil.setVisible(true);
     try {
         jIFramePefil.setMaximum(true);
     } catch (PropertyVetoException ex) {  }
     this.show(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVisualizar1ActionPerformed

    private void jButtonAdicionarAmigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarAmigo1ActionPerformed
     if (jtbListarCliente.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Nenhum usuário selecionado");
    }
    idUsuario = (Integer) jtbListarCliente.getValueAt(jtbListarCliente.getSelectedRow(), 0);
    Usuario e =Dados.getUsuariosBD().get(idUserLogando);
    e.addAmigo(idUsuario);
    DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
        dtm.setNumRows(0);

        for (Usuario usuario : Dados.getAmigosPendentes(idUsuario)) {//percorre a lista de usuarios
            if(usuario.getIdUsuario()!=0)if(usuario.getPrivacidade()==0){//se o usuario conter  id de administrador ou tiver perfil privado
            dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getTelefone()});}
        }      
        JOptionPane.showMessageDialog(null,"Solicitação de amizade enviada!");
      this.listarUsuarios();   
    }//GEN-LAST:event_jButtonAdicionarAmigo1ActionPerformed

    private void jButtonRemoverAmigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverAmigo1ActionPerformed
     if (jtbListarCliente.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Nenhum usuário selecionado");
    }
        idUsuario = (Integer) jtbListarCliente.getValueAt(jtbListarCliente.getSelectedRow(), 0);
        Usuario e = Dados.getUsuariosBD().get(idUsuario);
        for(int i = 0; i < e.amigos.size(); i++){
        Integer p = e.amigos.get(i);
        if(p.equals(Principal.getIdUserLogando()))
        {e.amigos.remove(p);break;}
        }
        
        Usuario userLogin = Dados.getUsuariosBD().get(idUserLogando);
        for(int i = 0; i < userLogin.amigos.size(); i++){
        Integer p = userLogin.amigos.get(i);
        if(p.equals(idUsuario))
        {userLogin.amigos.remove(p);break;}
        }
        DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
        dtm.setNumRows(0);

        for (Usuario usuario : Dados.getAmigos(idUsuario)) {//percorre a lista de usuarios
            if(usuario.getIdUsuario()!=0)if(usuario.getPrivacidade()==0){//se o usuario conter  id de administrador ou tiver perfil privado
            dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getTelefone()});}
        }
        JOptionPane.showMessageDialog(null,"Amizade desfeita!");
        this.listarUsuarios();
    }//GEN-LAST:event_jButtonRemoverAmigo1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
        dtm.setNumRows(0);

        for (Usuario usuario : Dados.getAmigosPendentes(Principal.getIdUserLogando())) {//percorre a lista de usuarios
            if(usuario.getIdUsuario()!=0)if(usuario.getPrivacidade()==0){//se o usuario conter  id de administrador ou tiver perfil privado
            dtm.addRow(new Object[]{usuario.getIdUsuario(),
                        usuario.getNome(),
                        usuario.getRank(),
                        usuario.getTelefone()});}
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButtonRemoverAmigo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoverAmigo1MouseEntered
        // TODO add your handling code here:
        Color padrao=new Color(204,0,0);
        jButtonRemoverAmigo1.setBackground(padrao);
    }//GEN-LAST:event_jButtonRemoverAmigo1MouseEntered

    private void jButtonRemoverAmigo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoverAmigo1MouseExited
        // TODO add your handling code here:
        Color padrao=new Color(153,0,0);
        jButtonRemoverAmigo1.setBackground(padrao);
    }//GEN-LAST:event_jButtonRemoverAmigo1MouseExited

    private void jButtonAdicionarAmigo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarAmigo1MouseEntered
        // TODO add your handling code here:
        Color padrao=new Color(0,153,0);
        jButtonAdicionarAmigo1.setBackground(padrao);
    }//GEN-LAST:event_jButtonAdicionarAmigo1MouseEntered

    private void jButtonAdicionarAmigo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarAmigo1MouseExited
        // TODO add your handling code here:
        Color padrao=new Color(0,102,0);
        jButtonAdicionarAmigo1.setBackground(padrao);
    }//GEN-LAST:event_jButtonAdicionarAmigo1MouseExited

    private void jButtonVisualizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVisualizar1MouseEntered
        // TODO add your handling code here:
        jButtonVisualizar1.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonVisualizar1MouseEntered

    private void jButtonVisualizar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVisualizar1MouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        jButtonVisualizar1.setBackground(padrao);
    }//GEN-LAST:event_jButtonVisualizar1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        jLabel1.setBackground(padrao);
    }//GEN-LAST:event_jLabel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarAmigo1;
    private javax.swing.JButton jButtonRemoverAmigo1;
    private javax.swing.JButton jButtonVisualizar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbListarCliente;
    // End of variables declaration//GEN-END:variables
    
}
