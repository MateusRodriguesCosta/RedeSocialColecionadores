package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casa
 */
public class JIFrameListarJogo extends javax.swing.JInternalFrame {
    Jogo jogo;
    public int idUser;
    public int idUserLogando=Principal.getIdUserLogando();
    private boolean visitante;
    private Image img;
    Usuario usuario;
    /**
     * Creates new form JIFrameListarJogo
     * @param idUser
     */
    public JIFrameListarJogo(int idUser) {
        this.idUser=idUser;
        this.usuario = Dados.getUsuariosBD().get(idUser);
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
      
        if(idUser!=Principal.getIdUserLogando()){
        this.adc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.adc.setVisible(false);
        this.Remover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.Remover.setVisible(false);
        }else{this.Trocar.setVisible(false);}
        this.jogo = new Jogo();
        listarJogo();
        
    }
    private void listarJogo(){
        DefaultTableModel dtm = (DefaultTableModel) jtbListarJogo.getModel();
        dtm.setNumRows(0);
        DefaultTableModel dtm1 = (DefaultTableModel) jtbListarJogo1.getModel();
        dtm1.setNumRows(0);
        System.out.print(usuario.getIdUsuario());
        for (Jogo jogo : usuario.getColecaoJogo()) {
           //  if(idUser==idUserLogando){
                        dtm.addRow(new Object[]{jogo.getIdItem(),jogo.getNome(), jogo.getPlataforma()});
        /* }else
            if(jogo.getPrivacidade()!=2){//se o usuario conter  id de administrador ou tiver perfil privado
                if(jogo.getPrivacidade()==1){
                    if(Dados.getUsuariosBD().get(jogo.getIdUsuario()).amigos.contains(idUserLogando)){
                        dtm.addRow(new Object[]{jogo.getIdItem(),jogo.getNome(), jogo.getPlataforma()});
                    }
                } 
            } else {dtm.addRow(new Object[]{jogo.getIdItem(),jogo.getNome(), jogo.getPlataforma()});
         */
        }
        for (Jogo jogo : usuario.getColecaoJogo()) {
           dtm1.addRow(new Object[]{jogo.getIdItem(),jogo.getNome(), jogo.getPlataforma()});
        }
        //}
    }
//        private void listarJogo() {
//               DefaultTableModel dtm = (DefaultTableModel) jtbListarJogo.getModel();
//               dtm.setNumRows(0);
//               DefaultTableModel dtm1 = (DefaultTableModel) jtbListarJogo1.getModel();
//               dtm1.setNumRows(0);
//               for (Jogo jogos : Dados.getUsuariosBD().get(idUser).getColecaoJogo()) {
//                      dtm.addRow(new Object[]{jogos.getIdItem(),jogos.getNome(), jogos.getPlataforma()});
//               }
//               for (Jogo jogos : Dados.getUsuariosBD().get(idUserLogando).getColecaoJogo()) {
//                      dtm1.addRow(new Object[]{jogos.getIdItem(),jogos.getNome(), jogos.getPlataforma()});
//               }
//        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTroca = new javax.swing.JPanel();
        solicitarTroca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbListarJogo1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbListarJogo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Exibir = new javax.swing.JLabel();
        Trocar = new javax.swing.JLabel();
        Remover = new javax.swing.JLabel();
        adc = new javax.swing.JLabel();
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

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));

        jtbListarJogo1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarJogo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Plataforma"
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
        jtbListarJogo1.setMaximumSize(new java.awt.Dimension(225, 0));
        jScrollPane3.setViewportView(jtbListarJogo1);

        javax.swing.GroupLayout jPanelTrocaLayout = new javax.swing.GroupLayout(jPanelTroca);
        jPanelTroca.setLayout(jPanelTrocaLayout);
        jPanelTrocaLayout.setHorizontalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(solicitarTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTrocaLayout.setVerticalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solicitarTroca)
                .addContainerGap())
        );

        setPreferredSize(new java.awt.Dimension(458, 309));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jtbListarJogo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarJogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Plataforma"
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
        jtbListarJogo.setMaximumSize(new java.awt.Dimension(422, 185));
        jtbListarJogo.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarJogo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbListarJogo);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel2.setText("Jogos cadastrados");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseClicked
        if (jtbListarJogo.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum jogo selecionado.");}
        Integer idJogo = (Integer) jtbListarJogo.getValueAt(jtbListarJogo.getSelectedRow(), 0);
        JIFrameJogo jIFrameJogo = new JIFrameJogo(Dados.getJogosBD().get(idJogo));
        jIFrameJogo.idUserLogando=Principal.getIdUserLogando();
        this.getDesktopPane().add(jIFrameJogo);
        jIFrameJogo.setVisible(true);
    }//GEN-LAST:event_ExibirMouseClicked

    private void TrocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseClicked
        listarJogo();
        JOptionPane.showMessageDialog(null,jPanelTroca);
    }//GEN-LAST:event_TrocarMouseClicked

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        if(idUser==Principal.getIdUserLogando()){
        if (jtbListarJogo.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum jogo selecionado.");
            return ;
        }

        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o jogo?", "Remover Jogo", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
            return ;
        }
        Integer idExclusao = (Integer) jtbListarJogo.getValueAt(jtbListarJogo.getSelectedRow(), 0);

        Jogo jogo=Dados.getJogosBD().get(idExclusao);
        Atividade atividade=new Atividade(jogo.getIdItem(),3, idUserLogando, 2, "Excluiu o item "+jogo.getNome(),"(JOGO)");
        JOptionPane.showMessageDialog(this, "Jogo"+jogo.getNome()+" excluído");
        atividade.salvar();
        atividade.bloquearAtividades(idUserLogando);
        Dados.getJogosBD().get(jogo.getIdItem()).setIdUsuario(0);
        }
    }//GEN-LAST:event_RemoverMouseClicked

    private void adcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMouseClicked
        if(idUser==Principal.getIdUserLogando()){
               JIFrameJogo jogo=new JIFrameJogo();
               ExibeItemColecao O=new ExibeItemColecao(jogo);
       }
    }//GEN-LAST:event_adcMouseClicked

    private void solicitarTrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarTrocaActionPerformed
         if (jtbListarJogo1.getSelectedRow() == -1) {
     JOptionPane.showMessageDialog(this, "Nenhuma camiseta selecionada.");}
     Integer idCamiseta = (Integer) jtbListarJogo1.getValueAt(jtbListarJogo1.getSelectedRow(), 0);
     Troca troca=new Troca(idUserLogando,jogo.getIdUsuario(),1,(Item)Dados.getCamisetasBD().get(idCamiseta),(Item)jogo);
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbListarJogo;
    private javax.swing.JTable jtbListarJogo1;
    private javax.swing.JButton solicitarTroca;
    // End of variables declaration//GEN-END:variables
}
