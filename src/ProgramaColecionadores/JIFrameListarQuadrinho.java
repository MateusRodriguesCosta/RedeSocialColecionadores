package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casai
 */
public class JIFrameListarQuadrinho extends javax.swing.JInternalFrame {
    Quadrinho quadrinho;
    public int idUser;
    public int idUserLogando=Principal.getIdUserLogando();
    Usuario usuario;
    private boolean visitante;
    private Image img;
    /**
     * Creates new form JIFrameListarQuadrinho
     * @param idUser
     */
    public JIFrameListarQuadrinho( int idUser) {
        this.idUser=idUser;
        usuario = Dados.getUsuariosBD().get(idUser);
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
       
        if(idUser!=Principal.getIdUserLogando()){
        this.adc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.adc.setVisible(false);
        this.Remover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.Remover.setVisible(false);
        }else{this.Trocar.setVisible(false);}
        this.quadrinho = new Quadrinho();
        listarQuadrinho();
        
    }
//    private void listarQuadrinho(){
//        DefaultTableModel dtm = (DefaultTableModel) jtbListarQuadrinho.getModel();
//        dtm.setNumRows(0);
//
//        for (Quadrinho quadrinho : usuario.getColecaoQuadrinho()) {
//             if(idUser==idUserLogando){
//                        dtm.addRow(new Object[]{quadrinho.getIdItem(),quadrinho.getTitulo(), quadrinho.getEdicao()});
//            }else
//            if (quadrinho.getIdUsuario()!=0)if(quadrinho.getPrivacidade()!=2){//se o usuario conter  id de administrador ou tiver perfil privado
//                if(quadrinho.getPrivacidade()==1){
//                    if(Dados.getUsuariosBD().get(quadrinho.getIdUsuario()).amigos.contains(idUserLogando)){
//                        dtm.addRow(new Object[]{quadrinho.getIdItem(),quadrinho.getTitulo(), quadrinho.getEdicao()});
//                    }
//                }else{dtm.addRow(new Object[]{quadrinho.getIdItem(),quadrinho.getTitulo(), quadrinho.getEdicao()});} 
//            } 
//        }
//    }
        private void listarQuadrinho() {
               DefaultTableModel dtm = (DefaultTableModel) jtbListarQuadrinho.getModel();
               dtm.setNumRows(0);
               DefaultTableModel dtm1 = (DefaultTableModel) jtbListarQuadrinho1.getModel();
               dtm1.setNumRows(0);
               for (Quadrinho quadrinhos : Dados.getUsuariosBD().get(idUser).getColecaoQuadrinho()) {
                      dtm.addRow(new Object[]{quadrinhos.getIdItem(),quadrinhos.getTitulo(), quadrinhos.getEdicao()});
               }
               for (Quadrinho quadrinhos : Dados.getUsuariosBD().get(idUserLogando).getColecaoQuadrinho()) {
                      dtm1.addRow(new Object[]{quadrinhos.getIdItem(),quadrinhos.getTitulo(), quadrinhos.getEdicao()});
               }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTroca = new javax.swing.JPanel();
        solicitarTroca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbListarQuadrinho1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbListarQuadrinho = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        adc = new javax.swing.JLabel();
        Remover = new javax.swing.JLabel();
        Trocar = new javax.swing.JLabel();
        Exibir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanelTroca.setBackground(new java.awt.Color(255, 255, 255));

        solicitarTroca.setBackground(new java.awt.Color(21, 30, 51));
        solicitarTroca.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        solicitarTroca.setForeground(java.awt.SystemColor.control);
        solicitarTroca.setText("Solicitar Troca");
        solicitarTroca.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        solicitarTroca.setContentAreaFilled(false);
        solicitarTroca.setOpaque(true);
        solicitarTroca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                solicitarTrocaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                solicitarTrocaMouseExited(evt);
            }
        });
        solicitarTroca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarTrocaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha um item seu para oferecer na troca");

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));

        jtbListarQuadrinho1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarQuadrinho1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Edição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarQuadrinho1.setMaximumSize(new java.awt.Dimension(225, 0));
        jScrollPane4.setViewportView(jtbListarQuadrinho1);

        javax.swing.GroupLayout jPanelTrocaLayout = new javax.swing.GroupLayout(jPanelTroca);
        jPanelTroca.setLayout(jPanelTrocaLayout);
        jPanelTrocaLayout.setHorizontalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(solicitarTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTrocaLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelTrocaLayout.setVerticalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                .addComponent(solicitarTroca)
                .addContainerGap())
            .addGroup(jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTrocaLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(458, 309));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jtbListarQuadrinho.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarQuadrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Edição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarQuadrinho.setMaximumSize(new java.awt.Dimension(422, 185));
        jtbListarQuadrinho.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarQuadrinho.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbListarQuadrinho);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        adc.setBackground(new java.awt.Color(0, 102, 0));
        adc.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        adc.setForeground(java.awt.SystemColor.control);
        adc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adc.setText("Adicionar");
        adc.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        adc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adc.setOpaque(true);
        adc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adcMouseExited(evt);
            }
        });

        Remover.setBackground(new java.awt.Color(153, 0, 0));
        Remover.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Remover.setForeground(java.awt.SystemColor.control);
        Remover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Remover.setText("Remover");
        Remover.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Remover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remover.setOpaque(true);
        Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RemoverMouseExited(evt);
            }
        });

        Trocar.setBackground(new java.awt.Color(21, 30, 51));
        Trocar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Trocar.setForeground(java.awt.SystemColor.control);
        Trocar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Trocar.setText("Trocar");
        Trocar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Trocar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Trocar.setOpaque(true);
        Trocar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrocarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TrocarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TrocarMouseExited(evt);
            }
        });

        Exibir.setBackground(new java.awt.Color(21, 30, 51));
        Exibir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Exibir.setForeground(java.awt.SystemColor.control);
        Exibir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exibir.setText("Exibir");
        Exibir.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Exibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exibir.setOpaque(true);
        Exibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExibirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExibirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExibirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(adc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Trocar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exibir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exibir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Trocar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 30, 51));
        jLabel2.setText("Quadrinhos cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMouseClicked
        if(idUser==Principal.getIdUserLogando()){
               JIFrameQuadrinho quadrinho=new JIFrameQuadrinho();
               ExibeItemColecao O=new ExibeItemColecao(quadrinho);
       }
    }//GEN-LAST:event_adcMouseClicked

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        if(idUser==Principal.getIdUserLogando()){
        if (jtbListarQuadrinho.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum quadrinho selecionado.");
            return ;
        }

        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o quadrinho?", "Remover Quadrinho", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
            return ;
        }
        Integer idExclusao = (Integer) jtbListarQuadrinho.getValueAt(jtbListarQuadrinho.getSelectedRow(), 0);

        Quadrinho quadrinho=Dados.getQuadrinhosBD().get(idExclusao);
        Atividade atividade=new Atividade(quadrinho.getIdItem(),5, idUserLogando, 2, "Excluiu o item "+quadrinho.getTitulo(),"(QUADRINHO)");
        JOptionPane.showMessageDialog(this, "Quadrinho"+quadrinho.getTitulo()+" excluído");
        atividade.salvar();
        atividade.bloquearAtividades(idUserLogando);
        Dados.getQuadrinhosBD().get(quadrinho.getIdItem()).setIdUsuario(0);
        }
    }//GEN-LAST:event_RemoverMouseClicked

    private void TrocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseClicked
        listarQuadrinho();
        JOptionPane.showMessageDialog(null,jPanelTroca);
    }//GEN-LAST:event_TrocarMouseClicked

    private void ExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseClicked
        if (jtbListarQuadrinho.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum quadrinho selecionado.");}
        Integer idQuadrinho = (Integer) jtbListarQuadrinho.getValueAt(jtbListarQuadrinho.getSelectedRow(), 0);

        JIFrameQuadrinho jIFrameQuadrinho = new JIFrameQuadrinho(Dados.getQuadrinhosBD().get(idQuadrinho));
        jIFrameQuadrinho.idUserLogando=Principal.getIdUserLogando();
        this.getDesktopPane().add(jIFrameQuadrinho);
        jIFrameQuadrinho.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExibirMouseClicked

    private void solicitarTrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarTrocaActionPerformed
         if (jtbListarQuadrinho1.getSelectedRow() == -1) {
     JOptionPane.showMessageDialog(this, "Nenhuma camiseta selecionada.");}
     Integer idCamiseta = (Integer) jtbListarQuadrinho1.getValueAt(jtbListarQuadrinho1.getSelectedRow(), 0);
     Troca troca=new Troca(idUserLogando,quadrinho.getIdUsuario(),1,(Item)Dados.getCamisetasBD().get(idCamiseta),(Item)quadrinho);
     solicitarTroca.setText("Troca solicitada !");
     solicitarTroca.setEnabled(false);
     solicitarTroca.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_solicitarTrocaActionPerformed

    private void adcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMouseEntered
        // TODO add your handling code here:
        Color padrao=new Color(0,153,0);
        adc.setBackground(padrao);
    }//GEN-LAST:event_adcMouseEntered

    private void adcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(0,102,0);
        adc.setBackground(padrao);
    }//GEN-LAST:event_adcMouseExited

    private void RemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseEntered
        // TODO add your handling code here:
        Color padrao=new Color(204,0,0);
        Remover.setBackground(padrao);
    }//GEN-LAST:event_RemoverMouseEntered

    private void RemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(153,0,0);
        Remover.setBackground(padrao);
    }//GEN-LAST:event_RemoverMouseExited

    private void TrocarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseEntered
        // TODO add your handling code here:
        Trocar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_TrocarMouseEntered

    private void TrocarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        Trocar.setBackground(padrao);
    }//GEN-LAST:event_TrocarMouseExited

    private void ExibirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseEntered
        // TODO add your handling code here:
        Exibir.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ExibirMouseEntered

    private void ExibirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        Exibir.setBackground(padrao);
    }//GEN-LAST:event_ExibirMouseExited

    private void solicitarTrocaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarTrocaMouseEntered
        if(solicitarTroca.isEnabled()==true){
        solicitarTroca.setOpaque(true);
        solicitarTroca.setBackground(Color.DARK_GRAY); 
        }
    }//GEN-LAST:event_solicitarTrocaMouseEntered

    private void solicitarTrocaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarTrocaMouseExited
        Color padrao=new Color(21,30,51);
        solicitarTroca.setBackground(padrao);
    }//GEN-LAST:event_solicitarTrocaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exibir;
    private javax.swing.JLabel Remover;
    private javax.swing.JLabel Trocar;
    private javax.swing.JLabel adc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTroca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtbListarQuadrinho;
    private javax.swing.JTable jtbListarQuadrinho1;
    private javax.swing.JButton solicitarTroca;
    // End of variables declaration//GEN-END:variables
}
