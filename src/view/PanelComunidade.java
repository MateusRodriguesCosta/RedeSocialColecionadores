package view;

import ProgramaColecionadores.Dados;
import ProgramaColecionadores.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Casa
 */
public class PanelComunidade extends javax.swing.JInternalFrame {
    int idComunidade;
    ProgramaColecionadores.Comunidade comunidade;
    private JPanelAtividadeRede jPanelAtividadeRede1;
    private Atividade atividade;
    private Image img;
    /**
     * Creates new form Comunidade
     */
    public PanelComunidade(int idComunidade) {
        this.idComunidade=idComunidade;
        comunidade=Dados.getComunidadePorID().get(idComunidade);
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        jLabelNomeComunidade.setText(comunidade.getNome());
        jLabelFoto.setSize(238, 146);
        if(comunidade.getImageComunidade()!=null){
            this.jLabelFoto.setIcon(new ImageIcon(comunidade.getImageComunidade().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH)));
        }else{
            this.jLabelFoto.setIcon(new ImageIcon(new ImageIcon(Principal.class.getResource("/Images/Comunidade_Nofoto.png")).getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH)));
        }
        this.jTextAreaDescricaoComunidade.setText(comunidade.getDescricao());
        jPanelConteudo.add(jPanelMural);
        this.jPanelAtividadeRede1=new JPanelAtividadeRede();
        this.jPanelAtividadeRede1.muralComunidade(idComunidade);
        jPanelRecados.add(jPanelAtividadeRede1);
        jPanelMural.setVisible(true);
        jPanelMural.updateUI();
        this.jPanelConteudo.updateUI();
        jPanelAtividadeRede.muralComunidade(idComunidade);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMembros = new javax.swing.JPanel();
        jPanelMural = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPergunta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelImagemPost = new javax.swing.JLabel();
        jPanelRecados = new javax.swing.JPanel();
        jPanelAtividadeRede = new ProgramaColecionadores.JPanelAtividadeRede();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonMembros = new javax.swing.JButton();
        jButtonMembros1 = new javax.swing.JButton();
        Participar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelNomeComunidade = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricaoComunidade = new javax.swing.JTextArea();
        jPanelConteudo = new javax.swing.JPanel();

        jPanelMembros.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMembros.setLayout(new java.awt.GridLayout(6, 6, 2, 2));

        jPanelMural.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        jPanel4.setMaximumSize(new java.awt.Dimension(505, 146));
        jPanel4.setMinimumSize(new java.awt.Dimension(505, 146));

        jScrollPane2.setBorder(null);

        jTextAreaPergunta.setColumns(20);
        jTextAreaPergunta.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTextAreaPergunta.setLineWrap(true);
        jTextAreaPergunta.setRows(2);
        jTextAreaPergunta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextAreaPergunta.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane2.setViewportView(jTextAreaPergunta);

        jButton1.setBackground(new java.awt.Color(21, 30, 51));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Postar");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(21, 30, 51));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Adicionar Foto");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelImagemPost, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImagemPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelRecadosLayout = new javax.swing.GroupLayout(jPanelRecados);
        jPanelRecados.setLayout(jPanelRecadosLayout);
        jPanelRecadosLayout.setHorizontalGroup(
            jPanelRecadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtividadeRede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelRecadosLayout.setVerticalGroup(
            jPanelRecadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecadosLayout.createSequentialGroup()
                .addComponent(jPanelAtividadeRede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanelMuralLayout = new javax.swing.GroupLayout(jPanelMural);
        jPanelMural.setLayout(jPanelMuralLayout);
        jPanelMuralLayout.setHorizontalGroup(
            jPanelMuralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMuralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMuralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRecados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMuralLayout.setVerticalGroup(
            jPanelMuralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMuralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRecados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(21, 30, 51));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jButtonMembros.setBackground(new java.awt.Color(21, 30, 51));
        jButtonMembros.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonMembros.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMembros.setText("   MEMBROS   ");
        jButtonMembros.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonMembros.setContentAreaFilled(false);
        jButtonMembros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMembros.setFocusPainted(false);
        jButtonMembros.setPreferredSize(new java.awt.Dimension(110, 25));
        jButtonMembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMembrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMembrosMouseExited(evt);
            }
        });
        jButtonMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMembrosActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMembros);

        jButtonMembros1.setBackground(new java.awt.Color(21, 30, 51));
        jButtonMembros1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonMembros1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMembros1.setText("   MURAL   ");
        jButtonMembros1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonMembros1.setContentAreaFilled(false);
        jButtonMembros1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMembros1.setFocusPainted(false);
        jButtonMembros1.setPreferredSize(new java.awt.Dimension(110, 25));
        jButtonMembros1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMembros1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMembros1MouseExited(evt);
            }
        });
        jButtonMembros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMembros1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMembros1);

        Participar.setBackground(new java.awt.Color(21, 30, 51));
        Participar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Participar.setForeground(new java.awt.Color(255, 255, 255));
        Participar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Participar.setText("PARTICIPAR");
        Participar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Participar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Participar.setOpaque(true);
        Participar.setPreferredSize(new java.awt.Dimension(110, 25));
        Participar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParticiparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParticiparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParticiparMouseExited(evt);
            }
        });
        jPanel2.add(Participar);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNomeComunidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNomeComunidade.setForeground(new java.awt.Color(21, 30, 51));
        jLabelNomeComunidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeComunidade.setText("Nome da Comunidade");

        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(null);

        jTextAreaDescricaoComunidade.setEditable(false);
        jTextAreaDescricaoComunidade.setColumns(20);
        jTextAreaDescricaoComunidade.setLineWrap(true);
        jTextAreaDescricaoComunidade.setRows(5);
        jTextAreaDescricaoComunidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12), new java.awt.Color(21, 30, 51))); // NOI18N
        jTextAreaDescricaoComunidade.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane1.setViewportView(jTextAreaDescricaoComunidade);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNomeComunidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelNomeComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConteudo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));
        jPanelConteudo.setLayout(new java.awt.GridLayout(3, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParticiparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParticiparMouseClicked
        comunidade.setUsuario(Principal.getIdUserLogando());
    }//GEN-LAST:event_ParticiparMouseClicked

    private void ParticiparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParticiparMouseEntered
        Participar.setOpaque(true);
        Participar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_ParticiparMouseEntered

    private void ParticiparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParticiparMouseExited
        Color padrao=new Color(21,30,51);
        Participar.setBackground(padrao);
    }//GEN-LAST:event_ParticiparMouseExited

    private void jButtonMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMembrosActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        for(Integer idUser:comunidade.getMembros()){
            IconUser icon=new IconUser(idUser);
            jPanelConteudo.add(icon);
            icon.setVisible(true);
        }
        this.jPanelConteudo.revalidate();

    }//GEN-LAST:event_jButtonMembrosActionPerformed

    private void jButtonMembrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMembrosMouseExited
        Color padrao=new Color(21,30,51);
        jButtonMembros.setBackground(padrao);
    }//GEN-LAST:event_jButtonMembrosMouseExited

    private void jButtonMembrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMembrosMouseEntered
        jButtonMembros.setOpaque(true);
        jButtonMembros.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonMembrosMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String postMural=this.jTextAreaPergunta.getText();
        if(img!=null){
           atividade=new Atividade(Principal.getIdUserLogando(),postMural,img,idComunidade);
        }else{
           atividade=new Atividade(Principal.getIdUserLogando(),postMural,idComunidade);    
        }
        atividade.salvar();
        PanelComunidade janelaComunidade=new PanelComunidade(idComunidade);
        janelaComunidade.jPanelAtividadeRede.muralComunidade(idComunidade);
        JOptionPane.getDesktopPaneForComponent(this).add(janelaComunidade);
        janelaComunidade.setVisible(true);
        try {janelaComunidade.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMembros1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMembros1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMembros1MouseExited

    private void jButtonMembros1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMembros1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMembros1MouseEntered

    private void jButtonMembros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMembros1ActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        jPanelConteudo.add(jPanelMural);
        this.jPanelAtividadeRede1=new JPanelAtividadeRede();
        this.jPanelAtividadeRede1.muralComunidade(idComunidade);
        jPanelRecados.add(jPanelAtividadeRede1);
        jPanelMural.setVisible(true);
        jPanelMural.updateUI();
        this.jPanelConteudo.updateUI();
    }//GEN-LAST:event_jButtonMembros1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String caminho;
            JFileChooser arquivo = new JFileChooser();//INSTANCIA O SELECIONADOR
            File diretorio = new File("C:\\Users\\aluno\\Pictures");//NOVO CODIGO PARA DEFINIR PASTA RAIZ DO FILE CHOOSER
            arquivo.setCurrentDirectory(diretorio);
            arquivo.showOpenDialog(null);
            jLabelImagemPost.setSize(234,202);
            caminho = arquivo.getSelectedFile().getAbsolutePath(); //VARIAVEL CAMINHO RECEBE O ENDEREÇO DA IMAGEM
            img=new ImageIcon(caminho).getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT);
            jLabelImagemPost.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setOpaque(true);
        jButton2.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        Color padrao=new Color(21,30,51);
        jButton2.setBackground(padrao);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setOpaque(true);
        jButton1.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        Color padrao=new Color(21,30,51);
        jButton1.setBackground(padrao);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Participar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonMembros;
    private javax.swing.JButton jButtonMembros1;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelImagemPost;
    private javax.swing.JLabel jLabelNomeComunidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private ProgramaColecionadores.JPanelAtividadeRede jPanelAtividadeRede;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelMembros;
    private javax.swing.JPanel jPanelMural;
    private javax.swing.JPanel jPanelRecados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDescricaoComunidade;
    private javax.swing.JTextArea jTextAreaPergunta;
    // End of variables declaration//GEN-END:variables
}
