
package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Cursor;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class JIFrameListarCamiseta extends javax.swing.JInternalFrame {
    private final Camiseta camiseta;
    public int idUser;
    public int idUserLogando=Principal.getIdUserLogando();
    Usuario usuario;
    /**
     * Creates new form JIFrameListarCamiseta
     * @param idUser
     */
    public JIFrameListarCamiseta( int idUser) {
        this.idUser=idUser;
        usuario=Dados.getUsuariosBD().get(idUser);
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas
        listarCarmiseta();
        if(idUser!=Principal.getIdUserLogando()){
        this.adc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.adc.setVisible(false);
        this.Remover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.Remover.setVisible(false);
        }else{
            this.Trocar.setVisible(false);
        }
        this.camiseta = new Camiseta();  
        }

      private void listarCarmiseta() {
          DefaultTableModel dtm = (DefaultTableModel) jtbListarCamiseta.getModel();
          dtm.setNumRows(0);
          for (Camiseta camiseta : usuario.getColecaoCamiseta()) {
              if(idUser==idUserLogando){
                dtm.addRow(new Object[]{camiseta.getIdItem(),camiseta.getNome(), Dados.getTimes().get(camiseta.getIdTime())});              }else
                if (camiseta.getIdUsuario()!=0)if(camiseta.getPrivacidade()!=2){//se o usuario conter  id de administrador ou tiver perfil privado
                    if(camiseta.getPrivacidade()==1){
                        //se a camiseta for publica é adicionada na lista de camisetas
                        if(Dados.getUsuariosBD().get(camiseta.getIdUsuario()).amigos.contains(idUserLogando)){
                            dtm.addRow(new Object[]{camiseta.getIdItem(),camiseta.getNome(), Dados.getTimes().get(camiseta.getIdTime())});
                        }
                    }else{
                        dtm.addRow(new Object[]{camiseta.getIdItem(),camiseta.getNome(), Dados.getTimes().get(camiseta.getIdTime())});}
                }
          }
          DefaultTableModel dtm1 = (DefaultTableModel) jtbListarCamiseta1.getModel();
          dtm1.setNumRows(0);
          for (Camiseta camiseta : Dados.getUsuarios().get(idUserLogando).getColecaoCamiseta()) {
              if(idUser!=idUserLogando){
                  dtm1.addRow(new Object[]{camiseta.getIdItem(),camiseta.getNome(), Dados.getTimes().get(camiseta.getIdTime())});
              }
          }
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTroca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbListarCamiseta1 = new javax.swing.JTable();
        solicitarTroca = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbListarCamiseta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        adc = new javax.swing.JLabel();
        Remover = new javax.swing.JLabel();
        Trocar = new javax.swing.JLabel();
        Exibir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanelTroca.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));

        jtbListarCamiseta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Time"
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
        jtbListarCamiseta1.setMaximumSize(new java.awt.Dimension(225, 0));
        jtbListarCamiseta1.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jScrollPane2.setViewportView(jtbListarCamiseta1);

        solicitarTroca.setBackground(new java.awt.Color(21, 30, 51));
        solicitarTroca.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        solicitarTroca.setForeground(java.awt.SystemColor.control);
        solicitarTroca.setText("Solicitar Troca");
        solicitarTroca.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        solicitarTroca.setContentAreaFilled(false);
        solicitarTroca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escolha um item seu para oferecer na troca");

        javax.swing.GroupLayout jPanelTrocaLayout = new javax.swing.GroupLayout(jPanelTroca);
        jPanelTroca.setLayout(jPanelTrocaLayout);
        jPanelTrocaLayout.setHorizontalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTrocaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(solicitarTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTrocaLayout.setVerticalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(solicitarTroca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(458, 309));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jtbListarCamiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Time"
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
        jtbListarCamiseta.setGridColor(new java.awt.Color(21, 30, 51));
        jtbListarCamiseta.setMaximumSize(new java.awt.Dimension(422, 185));
        jtbListarCamiseta.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarCamiseta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbListarCamiseta);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(323, 47));

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RemoverMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RemoverMouseEntered(evt);
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
                .addContainerGap(128, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exibir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Trocar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setText("Camisetas cadastradas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adcMouseClicked
        if(idUser==Principal.getIdUserLogando()){
               JIFrameCamiseta camiseta=new JIFrameCamiseta();
               ExibeItemColecao O=new ExibeItemColecao(camiseta);
       }
    }//GEN-LAST:event_adcMouseClicked

    private void RemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseClicked
        if(idUser==Principal.getIdUserLogando()){
        if (jtbListarCamiseta.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma camiseta selecionada.");
            return ;
        }
        
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover a camiseta?", "Remover Camiseta", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
            return ;
        }
        Integer idExclusao = (Integer) jtbListarCamiseta.getValueAt(jtbListarCamiseta.getSelectedRow(), 0);
        
        Camiseta camiseta=Dados.getCamisetasBD().get(idExclusao);
        Atividade atividade=new Atividade(camiseta.getIdItem(),1, idUserLogando, 2, "Excluiu o item "+camiseta.getNome(),"(CAMISETA)");
        JOptionPane.showMessageDialog(this, "Camiseta"+camiseta.getNome()+" excluída");
        atividade.salvar();
        atividade.bloquearAtividades(idUserLogando);
        Dados.getCamisetasBD().get(camiseta.getIdItem()).setIdUsuario(0);  
    }
        listarCarmiseta();
    }//GEN-LAST:event_RemoverMouseClicked

    private void TrocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseClicked
        listarCarmiseta();
        JOptionPane.showMessageDialog(null,jPanelTroca);
    }//GEN-LAST:event_TrocarMouseClicked

    private void ExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseClicked
        // TODO add your handling code here:
        if (jtbListarCamiseta.getSelectedRow() == -1) {
               JOptionPane.showMessageDialog(this, "Nenhuma camiseta selecionada.");}
        Integer idCamiseta = (Integer) jtbListarCamiseta.getValueAt(jtbListarCamiseta.getSelectedRow(), 0);
        JIFrameCamiseta jIFrameCamiseta = new JIFrameCamiseta(Dados.getCamisetasBD().get(idCamiseta));
        jIFrameCamiseta.idUserLogando=Principal.getIdUserLogando();
        this.getDesktopPane().add(jIFrameCamiseta);
        jIFrameCamiseta.setVisible(true);
        this.show(false);
        this.getDesktopPane().updateUI();
    }//GEN-LAST:event_ExibirMouseClicked

    private void solicitarTrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarTrocaActionPerformed
        if (jtbListarCamiseta1.getSelectedRow() == -1) {
     JOptionPane.showMessageDialog(this, "Nenhuma camiseta selecionada.");}
     Integer idCamiseta = (Integer) jtbListarCamiseta1.getValueAt(jtbListarCamiseta1.getSelectedRow(), 0);
     Troca troca=new Troca(idUserLogando,camiseta.getIdUsuario(),1,(Item)Dados.getCamisetasBD().get(idCamiseta),(Item)camiseta);
     solicitarTroca.setText("Troca solicitada !");
     solicitarTroca.setEnabled(false);
     solicitarTroca.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_solicitarTrocaActionPerformed

    private void TrocarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseEntered
        // TODO add your handling code here:
        Trocar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_TrocarMouseEntered

    private void ExibirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseEntered
        // TODO add your handling code here:
        Exibir.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ExibirMouseEntered

    private void ExibirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        Exibir.setBackground(padrao);
    }//GEN-LAST:event_ExibirMouseExited

    private void TrocarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        Trocar.setBackground(padrao);
    }//GEN-LAST:event_TrocarMouseExited

    private void RemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseEntered
        // TODO add your handling code here:[204,0,0]
        Color padrao=new Color(204,0,0);
        Remover.setBackground(padrao);
    }//GEN-LAST:event_RemoverMouseEntered

    private void RemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(153,0,0);
        Remover.setBackground(padrao);
    }//GEN-LAST:event_RemoverMouseExited

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
    private static javax.swing.JPanel jPanelTroca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbListarCamiseta;
    private javax.swing.JTable jtbListarCamiseta1;
    private javax.swing.JButton solicitarTroca;
    // End of variables declaration//GEN-END:variables
}
