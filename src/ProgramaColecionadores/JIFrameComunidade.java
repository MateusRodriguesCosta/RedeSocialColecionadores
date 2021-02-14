
package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class JIFrameComunidade extends javax.swing.JInternalFrame {
       int idUserLogando;
       Integer idUser;
       Image img;
    /**
     * Creates new form JIFrameAtividade
     */
    public JIFrameComunidade() {
        this.isMaximum=true;
        this. idUserLogando=Principal.getIdUserLogando();
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas
        PainelComunidade();      
        jPanelConteudo.updateUI();
        jLabelFoto.setText("Foto");
        Dono.setText(Dados.getUsuarios().get(Principal.getIdUserLogando()).getNome());
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Dono = new javax.swing.JLabel();
        MenuInferior = new javax.swing.JPanel();
        minhasComunidade = new javax.swing.JButton();
        AmigosComunidade = new javax.swing.JButton();
        geralComunidade = new javax.swing.JButton();
        Comunidade = new javax.swing.JLabel();
        jPanelConteudo = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(21, 30, 51)));

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextAreaDescricao.setForeground(new java.awt.Color(21, 30, 51));
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setWrapStyleWord(true);
        jTextAreaDescricao.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 30, 51));
        jLabel4.setText("Descrição:");

        jTextFieldTipo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldTipo.setForeground(new java.awt.Color(21, 30, 51));
        jTextFieldTipo.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 30, 51));
        jLabel2.setText("Tipo:");

        jTextFieldTitulo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldTitulo.setForeground(new java.awt.Color(21, 30, 51));
        jTextFieldTitulo.setSelectionColor(new java.awt.Color(21, 30, 51));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setText("Nome:");

        jButtonConfirmar.setBackground(new java.awt.Color(21, 30, 51));
        jButtonConfirmar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar.setText("Confimar");
        jButtonConfirmar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonConfirmar.setContentAreaFilled(false);
        jButtonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmar.setOpaque(true);
        jButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseExited(evt);
            }
        });
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comunidade_Azul.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 30, 51));
        jLabel5.setText("Criar comunidade");

        jLabelFoto.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setText("Foto");
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jLabelFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dono");

        Dono.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Dono.setForeground(new java.awt.Color(21, 30, 51));
        Dono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(Dono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfirmar)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentY(-4.0F);
        setMinimumSize(new java.awt.Dimension(717, 398));

        MenuInferior.setBackground(new java.awt.Color(21, 30, 51));
        MenuInferior.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        MenuInferior.setMaximumSize(new java.awt.Dimension(0, 30));
        MenuInferior.setMinimumSize(new java.awt.Dimension(0, 30));

        minhasComunidade.setBackground(new java.awt.Color(21, 30, 51));
        minhasComunidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        minhasComunidade.setForeground(new java.awt.Color(255, 255, 255));
        minhasComunidade.setText("MINHAS");
        minhasComunidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        minhasComunidade.setContentAreaFilled(false);
        minhasComunidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minhasComunidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minhasComunidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minhasComunidadeMouseExited(evt);
            }
        });
        minhasComunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minhasComunidadeActionPerformed(evt);
            }
        });

        AmigosComunidade.setBackground(new java.awt.Color(21, 30, 51));
        AmigosComunidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        AmigosComunidade.setForeground(new java.awt.Color(255, 255, 255));
        AmigosComunidade.setText("AMIGOS");
        AmigosComunidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        AmigosComunidade.setContentAreaFilled(false);
        AmigosComunidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AmigosComunidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AmigosComunidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AmigosComunidadeMouseExited(evt);
            }
        });
        AmigosComunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmigosComunidadeActionPerformed(evt);
            }
        });

        geralComunidade.setBackground(new java.awt.Color(21, 30, 51));
        geralComunidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        geralComunidade.setForeground(new java.awt.Color(255, 255, 255));
        geralComunidade.setText("GERAL");
        geralComunidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        geralComunidade.setContentAreaFilled(false);
        geralComunidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geralComunidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                geralComunidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                geralComunidadeMouseExited(evt);
            }
        });
        geralComunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geralComunidadeActionPerformed(evt);
            }
        });

        Comunidade.setBackground(new java.awt.Color(21, 30, 51));
        Comunidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Comunidade.setForeground(new java.awt.Color(255, 255, 255));
        Comunidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comunidade.setText("CRIAR COMUNIDADE");
        Comunidade.setToolTipText("Crie sua comunidade clicando aqui!");
        Comunidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Comunidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comunidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComunidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComunidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComunidadeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuInferiorLayout = new javax.swing.GroupLayout(MenuInferior);
        MenuInferior.setLayout(MenuInferiorLayout);
        MenuInferiorLayout.setHorizontalGroup(
            MenuInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minhasComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AmigosComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(geralComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Comunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        MenuInferiorLayout.setVerticalGroup(
            MenuInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minhasComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmigosComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geralComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConteudo.setLayout(new java.awt.GridLayout(4, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minhasComunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minhasComunidadeActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        PainelComunidadeMinha();
        jPanelConteudo.updateUI();
        jPanelConteudo.revalidate();
        this.updateUI();
       ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        try {this.setMaximum(true);
        } catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_minhasComunidadeActionPerformed

    private void AmigosComunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmigosComunidadeActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        PainelComunidadeAmigos();
        jPanelConteudo.updateUI();
        this.updateUI();
       ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        try {this.setMaximum(true);
        } catch (PropertyVetoException ex) {  }  
    }//GEN-LAST:event_AmigosComunidadeActionPerformed

    private void geralComunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geralComunidadeActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        PainelComunidade();
        jPanelConteudo.updateUI();
        jPanelConteudo.revalidate();         
    }//GEN-LAST:event_geralComunidadeActionPerformed

    private void minhasComunidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhasComunidadeMouseEntered
        minhasComunidade.setOpaque(true);
        minhasComunidade.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_minhasComunidadeMouseEntered

    private void minhasComunidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhasComunidadeMouseExited
        Color padrao=new Color(21,30,51);
        minhasComunidade.setBackground(padrao);
    }//GEN-LAST:event_minhasComunidadeMouseExited

    private void AmigosComunidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmigosComunidadeMouseEntered
        AmigosComunidade.setOpaque(true);
        AmigosComunidade.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_AmigosComunidadeMouseEntered

    private void AmigosComunidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmigosComunidadeMouseExited
        Color padrao=new Color(21,30,51);
        AmigosComunidade.setBackground(padrao);
    }//GEN-LAST:event_AmigosComunidadeMouseExited

    private void geralComunidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geralComunidadeMouseEntered
        geralComunidade.setOpaque(true);
        geralComunidade.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_geralComunidadeMouseEntered

    private void geralComunidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geralComunidadeMouseExited
        Color padrao=new Color(21,30,51);
        geralComunidade.setBackground(padrao);
    }//GEN-LAST:event_geralComunidadeMouseExited

    private void ComunidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComunidadeMouseClicked
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        jTextFieldTitulo.setText("");
        jTextAreaDescricao.setText("");
        jTextFieldTipo.setText("");
        jPanelConteudo.add(jPanel1);
        jPanelConteudo.updateUI();
        this.updateUI();
       ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        try {this.setMaximum(true);
        } catch (PropertyVetoException ex) {  }
        
                
    }//GEN-LAST:event_ComunidadeMouseClicked

    private void ComunidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComunidadeMouseEntered
        Comunidade.setOpaque(true);
        Comunidade.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ComunidadeMouseEntered

    private void ComunidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComunidadeMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        Comunidade.setBackground(padrao);
    }//GEN-LAST:event_ComunidadeMouseExited

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoActionPerformed

    private void jButtonConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseEntered
        // TODO add your handling code here:
        jButtonConfirmar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonConfirmarMouseEntered

    private void jButtonConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseExited
        // TODO add your handling code here:
        Color padrao=new Color(21,30,51);
        jButtonConfirmar.setBackground(padrao);
    }//GEN-LAST:event_jButtonConfirmarMouseExited

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        String titulo=jTextFieldTitulo.getText();
        String descricao=jTextAreaDescricao.getText();
        String tipo=jTextFieldTipo.getText();
        Comunidade comunidade=new Comunidade(idUserLogando,titulo,tipo,descricao);
        comunidade.setFotoComunidade(img);
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        PainelComunidade();
        jPanelConteudo.updateUI();
        this.updateUI();
       ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        try {this.setMaximum(true);
        } catch (PropertyVetoException ex) {  }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        String caminho;        
        JFileChooser arquivo = new JFileChooser();//INSTANCIA O SELECIONADOR
        File diretorio = new File("C:\\Users\\aluno\\Pictures");//NOVO CODIGO PARA DEFINIR PASTA RAIZ DO FILE CHOOSER
        arquivo.setCurrentDirectory(diretorio);
        arquivo.showOpenDialog(null);
        caminho = arquivo.getSelectedFile().getAbsolutePath(); //VARIAVEL CAMINHO RECEBE O ENDEREÇO DA IMAGEM
        img=new ImageIcon(caminho).getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH);                    
        jLabelFoto.setIcon(new ImageIcon(img)); //LBIMAGEM RECEBERA A IMAGEM        // TODO add your handling code here:
        img=new ImageIcon(caminho).getImage().getScaledInstance(240, 202, Image.SCALE_SMOOTH); 
        if (jLabelFoto.getIcon()!=null){
        jLabelFoto.setText("");
        }
    }//GEN-LAST:event_jLabelFotoMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmigosComunidade;
    private javax.swing.JLabel Comunidade;
    private javax.swing.JLabel Dono;
    private javax.swing.JPanel MenuInferior;
    private javax.swing.JButton geralComunidade;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JButton minhasComunidade;
    // End of variables declaration//GEN-END:variables

        public void PainelComunidade(){
               for(int i=0;i<Dados.getComunidadesBD().size();i++){
               view.IconComunidade icone=new view.IconComunidade(i);
               jPanelConteudo.add(icone);
               icone.setVisible(true);
               }
        }
        public void PainelComunidadeAmigos(){
               for(Usuario amigo:Dados.getAmigos(idUserLogando)){            
                      for(Comunidade comunity:Dados.getComunidadeAmigo(amigo.getIdUsuario())){
                      view.IconComunidade icone=new view.IconComunidade(comunity.getIdComunidade());
                      jPanelConteudo.add(icone);
                      icone.setVisible(true);
                      }            
               }
        }
        public void PainelComunidadeMinha(){
               for(Comunidade comunity:Dados.getComunidadeAmigo(idUserLogando)){
               view.IconComunidade icone=new view.IconComunidade(comunity.getIdComunidade());
               jPanelConteudo.add(icone);
               icone.setVisible(true);
               }
        }
}