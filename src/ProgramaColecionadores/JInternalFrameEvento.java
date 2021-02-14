package ProgramaColecionadores;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author casa
 */
public class JInternalFrameEvento extends javax.swing.JInternalFrame {
        int idUserLogando=Principal.getIdUserLogando();
        /**
        * Creates new form JInternalFrameEvento
        */
        public JInternalFrameEvento() {
            initComponents();
            ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
            this.setBorder(null);//retirar bordas
            for(int i=0;i<Dados.listaEventos.size();i++){
                JPanelItemEvento itemEvento=new JPanelItemEvento(i);
                jPanelConteudo.add(itemEvento);
                itemEvento.setVisible(true);
            }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelConteudo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonCriarEvento = new javax.swing.JButton();
        jButtonListarEvento = new javax.swing.JButton();

        jPanelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCadastro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(21, 30, 51)));
        jPanelCadastro.setMaximumSize(new java.awt.Dimension(274, 268));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setText("Título:");

        jTextFieldTitulo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldTitulo.setForeground(new java.awt.Color(21, 30, 51));
        jTextFieldTitulo.setSelectionColor(new java.awt.Color(21, 30, 51));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 30, 51));
        jLabel2.setText("Endereço:");

        jTextFieldEndereco.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(21, 30, 51));
        jTextFieldEndereco.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 30, 51));
        jLabel3.setText("Data:");

        jTextFieldData.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldData.setForeground(new java.awt.Color(21, 30, 51));
        jTextFieldData.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldData)
                            .addComponent(jTextFieldEndereco)
                            .addComponent(jTextFieldTitulo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(21, 30, 51));
        setMinimumSize(new java.awt.Dimension(494, 600));
        setVisible(true);

        jScrollPane2.setBorder(null);

        jPanelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConteudo.setLayout(new javax.swing.BoxLayout(jPanelConteudo, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane2.setViewportView(jPanelConteudo);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(21, 30, 51));

        jButtonCriarEvento.setBackground(new java.awt.Color(21, 30, 51));
        jButtonCriarEvento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonCriarEvento.setForeground(java.awt.SystemColor.control);
        jButtonCriarEvento.setText("CRIAR EVENTO");
        jButtonCriarEvento.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonCriarEvento.setContentAreaFilled(false);
        jButtonCriarEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCriarEvento.setOpaque(true);
        jButtonCriarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCriarEventoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCriarEventoMouseEntered(evt);
            }
        });
        jButtonCriarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarEventoActionPerformed(evt);
            }
        });

        jButtonListarEvento.setBackground(new java.awt.Color(21, 30, 51));
        jButtonListarEvento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonListarEvento.setForeground(java.awt.SystemColor.control);
        jButtonListarEvento.setText("LISTAR EVENTOS");
        jButtonListarEvento.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonListarEvento.setContentAreaFilled(false);
        jButtonListarEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonListarEvento.setOpaque(true);
        jButtonListarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonListarEventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonListarEventoMouseExited(evt);
            }
        });
        jButtonListarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCriarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCriarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        String titulo=jTextFieldTitulo.getText();
        String descricao=jTextAreaDescricao.getText();
        String endereco=jTextFieldEndereco.getText();
        String data=jTextFieldData.getText();
        Evento evento=new Evento(idUserLogando,titulo,descricao,endereco);
        evento.setData(data);
        JOptionPane.showMessageDialog(null,"Novo Evento Criado");
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        for(int i=0;i<Dados.listaEventos.size();i++){
            JPanelItemEvento itemEvento=new JPanelItemEvento(i);
            jPanelConteudo.add(itemEvento);
            itemEvento.setVisible(true);
        }
        this.updateUI();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCriarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarEventoActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        jTextFieldTitulo.setText("");
        this.jTextFieldData.setText("");
        this.jTextFieldEndereco.setText("");
        this.jTextAreaDescricao.setText("");
        jPanelConteudo.add(jPanelCadastro);  
        this.updateUI();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas
    }//GEN-LAST:event_jButtonCriarEventoActionPerformed

    private void jButtonListarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarEventoActionPerformed
        jPanelConteudo.removeAll();
        jPanelConteudo.repaint();
        for(int i=0;i<Dados.listaEventos.size();i++){
            JPanelItemEvento itemEvento=new JPanelItemEvento(i);
            jPanelConteudo.add(itemEvento);
            itemEvento.setVisible(true);
        }
        this.updateUI();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas
    }//GEN-LAST:event_jButtonListarEventoActionPerformed

    private void jButtonCriarEventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCriarEventoMouseEntered
        jButtonCriarEvento.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonCriarEventoMouseEntered

    private void jButtonCriarEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCriarEventoMouseExited
        Color padrao=new Color(21,30,51);
        jButtonCriarEvento.setBackground(padrao);
    }//GEN-LAST:event_jButtonCriarEventoMouseExited

    private void jButtonListarEventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListarEventoMouseEntered
        jButtonListarEvento.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonListarEventoMouseEntered

    private void jButtonListarEventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListarEventoMouseExited
        Color padrao=new Color(21,30,51);
        jButtonListarEvento.setBackground(padrao);
    }//GEN-LAST:event_jButtonListarEventoMouseExited

    private void jButtonConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseEntered
        jButtonConfirmar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonConfirmarMouseEntered

    private void jButtonConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseExited
        Color padrao=new Color(21,30,51);
        jButtonConfirmar.setBackground(padrao);
    }//GEN-LAST:event_jButtonConfirmarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonCriarEvento;
    private javax.swing.JButton jButtonListarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
