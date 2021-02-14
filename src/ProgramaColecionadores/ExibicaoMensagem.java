package ProgramaColecionadores;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class ExibicaoMensagem extends javax.swing.JPanel {

    Mensagem mensagem;
    int idUserLogando = Principal.getIdUserLogando();
    Integer idUsuario;

        public ExibicaoMensagem(Mensagem mensagem) {
            this.mensagem = mensagem;
            initComponents();
            String conteudo = "";
        for (ItemMensagem itemMensagem : mensagem.listarRespostas()) {
            conteudo += Dados.getUsuariosBD().get(itemMensagem.getIdUser()).getNome() + ":" + itemMensagem.getConteudo() + "\n";
        }
            this.jTextconteudo.setText(conteudo);
            this.jLabelNome.setText("Mensagem enviada por "+Dados.getUsuariosBD().get(mensagem.getIdUser().get(1)).getNome()+" "+Dados.getUsuariosBD().get(mensagem.getIdUser().get(1)).getSobrenome()+" para "+Dados.getUsuariosBD().get(mensagem.getIdUser().get(0)).getNome()+" "+Dados.getUsuariosBD().get(mensagem.getIdUser().get(0)).getSobrenome());
        }

        private void listarAmigos() {
            DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
            dtm.setNumRows(0);
            for (Usuario usuario : Dados.getAmigos(idUserLogando)) {//percorre a lista de usuarios
                dtm.addRow(new Object[]{usuario.getIdUsuario(),
                    usuario.getNome(),
                    usuario.getRank(),
                    usuario.getTelefone()});
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelListaUser = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbListarCliente = new javax.swing.JTable();
        jButtonAdicionarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextconteudo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextResposta = new javax.swing.JTextArea();
        Responder = new javax.swing.JLabel();
        Responder1 = new javax.swing.JLabel();

        jPanelListaUser.setBackground(new java.awt.Color(255, 255, 255));

        jtbListarCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Rank", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtbListarCliente);

        jButtonAdicionarUsuario.setBackground(new java.awt.Color(21, 30, 51));
        jButtonAdicionarUsuario.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonAdicionarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdicionarUsuario.setText("Adicionar na conversa");
        jButtonAdicionarUsuario.setContentAreaFilled(false);
        jButtonAdicionarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarUsuario.setOpaque(true);
        jButtonAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setText("Adicionar amigo na conversa");

        javax.swing.GroupLayout jPanelListaUserLayout = new javax.swing.GroupLayout(jPanelListaUser);
        jPanelListaUser.setLayout(jPanelListaUserLayout);
        jPanelListaUserLayout.setHorizontalGroup(
            jPanelListaUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListaUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaUserLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaUserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAdicionarUsuario)))
                .addContainerGap())
        );
        jPanelListaUserLayout.setVerticalGroup(
            jPanelListaUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionarUsuario)
                .addGap(8, 8, 8))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(344, 251));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabelNome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(21, 30, 51));
        jLabelNome.setText("Nome Conversa");

        jScrollPane1.setBorder(null);

        jTextconteudo.setEditable(false);
        jTextconteudo.setColumns(15);
        jTextconteudo.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTextconteudo.setForeground(new java.awt.Color(102, 102, 102));
        jTextconteudo.setLineWrap(true);
        jTextconteudo.setRows(5);
        jTextconteudo.setWrapStyleWord(true);
        jTextconteudo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextconteudo.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane1.setViewportView(jTextconteudo);

        jTextResposta.setColumns(15);
        jTextResposta.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTextResposta.setLineWrap(true);
        jTextResposta.setRows(2);
        jTextResposta.setWrapStyleWord(true);
        jTextResposta.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane2.setViewportView(jTextResposta);

        Responder.setBackground(new java.awt.Color(21, 30, 51));
        Responder.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Responder.setForeground(new java.awt.Color(255, 255, 255));
        Responder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Responder.setText("Responder");
        Responder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Responder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Responder.setOpaque(true);
        Responder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResponderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResponderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResponderMouseExited(evt);
            }
        });

        Responder1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Responder1.setForeground(new java.awt.Color(21, 30, 51));
        Responder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Responder1.setText("+Pessoa no bate-papo");
        Responder1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Responder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Responder1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Responder1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Responder, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Responder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Responder1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarUsuarioActionPerformed
        if (jtbListarCliente.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum usuário selecionado.");
        }
        idUsuario = (Integer) jtbListarCliente.getValueAt(jtbListarCliente.getSelectedRow(), 0);
        mensagem.setUsuario(idUsuario);
        JOptionPane.showMessageDialog(null, "Usuário adicionado na conversa.");
    }//GEN-LAST:event_jButtonAdicionarUsuarioActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JFrame janela = new JFrame("Chat");
        janela.setSize(344, 275);
        janela.setVisible(true);
        janela.setResizable(false);
        janela.add(this);
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        String conteudo = "";
        for (ItemMensagem itemMensagem : mensagem.listarRespostas()) {
            conteudo += Dados.getUsuariosBD().get(itemMensagem.getIdUser()).getNome() + ":" + itemMensagem.getConteudo() + "\n";
        }
        this.jTextconteudo.setText(conteudo);
    }//GEN-LAST:event_formMouseMoved

    private void ResponderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponderMouseClicked
        String resposta = this.jTextResposta.getText();
        mensagem.setResposta(idUserLogando, resposta);
        String conteudo = "";
        for (ItemMensagem itemMensagem : mensagem.listarRespostas()) {
            conteudo += Dados.getUsuariosBD().get(itemMensagem.getIdUser()).getNome() + ":" + itemMensagem.getConteudo() + "\n";
        }
        this.jTextconteudo.setText(conteudo);
        this.jTextResposta.setText("");
    }//GEN-LAST:event_ResponderMouseClicked

    private void Responder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Responder1MouseClicked
        listarAmigos();
        JOptionPane.showMessageDialog(null, jPanelListaUser);
    }//GEN-LAST:event_Responder1MouseClicked

    private void ResponderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponderMouseEntered
        Responder.setOpaque(true);
        Responder.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_ResponderMouseEntered

    private void ResponderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponderMouseExited
        Color padrao=new Color(21,30,51);
        Responder.setBackground(padrao);
    }//GEN-LAST:event_ResponderMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Responder;
    private javax.swing.JLabel Responder1;
    private javax.swing.JButton jButtonAdicionarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelListaUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextResposta;
    private javax.swing.JTextArea jTextconteudo;
    private javax.swing.JTable jtbListarCliente;
    // End of variables declaration//GEN-END:variables
}
