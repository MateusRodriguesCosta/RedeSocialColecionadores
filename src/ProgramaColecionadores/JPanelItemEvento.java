package ProgramaColecionadores;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casa
 */
public class JPanelItemEvento extends javax.swing.JPanel {
        Evento evento;
        int idUserLogando=Principal.getIdUserLogando();
         /**
        * Creates new form JPanelItemEvento
        */
        public JPanelItemEvento(int idEvento) {
            initComponents();
            evento=Dados.listaEventos.get(idEvento);
            jLabelData.setText(evento.getData().toString());
            jLabelTitulo.setText(evento.getTitulo());
            jLabelLocal.setText(evento.getEndereco());
            jTextAreaDescricao.setText(evento.getDescricao());
            listarParticipantes();
            listarIndecisos();
            listarConvidados();
        }
        private void listarParticipantes(){
            DefaultTableModel dtm = (DefaultTableModel) jtbListarCliente.getModel();
            dtm.setNumRows(0);
            for (Usuario usuario : evento.getParticipantesConfirmado()) {//percorre a lista de usuarios
                dtm.addRow(new Object[]{usuario.getIdUsuario(),usuario.getNome()});
            } 
            jTabbedPane.revalidate();
        }
        private void listarIndecisos(){
            DefaultTableModel dtm = (DefaultTableModel) jtbListarIndecisos.getModel();
            dtm.setNumRows(0);
            for (Usuario usuario : evento.getParticipantesIndecisos()) {//percorre a lista de usuarios
                    dtm.addRow(new Object[]{usuario.getIdUsuario(),usuario.getNome()});
            } 
            jTabbedPane.revalidate();
        }
        private void listarConvidados(){
            DefaultTableModel dtm = (DefaultTableModel) jtbListarConvidados.getModel();
            dtm.setNumRows(0);
            for (Usuario usuario : evento.getParticipantesConvidados()) {//percorre a lista de usuarios
                    dtm.addRow(new Object[]{usuario.getIdUsuario(),usuario.getNome()});
            } 
            jTabbedPane.revalidate();
        }
        private void listarConvidar(){
            DefaultTableModel dtma = (DefaultTableModel) jtbListarConvidar.getModel();
            dtma.setNumRows(0);
            for (Usuario usuario : Dados.getUsuarios()) {
                dtma.addRow(new Object[]{usuario.getIdUsuario(),usuario.getNome()}); 
            }
            jPanelConvite.revalidate();
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConvite = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtbListarConvidar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonEnviarConvite = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelConfirmado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbListarCliente = new javax.swing.JTable();
        jPanelTalvez = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbListarIndecisos = new javax.swing.JTable();
        jPanelConvidados = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtbListarConvidados = new javax.swing.JTable();
        jPanelComentario = new javax.swing.JPanel();
        jPanelCronograma = new javax.swing.JPanel();
        jButtonConvidar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonParticipar = new javax.swing.JButton();
        jButtonIndeciso = new javax.swing.JButton();
        jButtonRecusar = new javax.swing.JButton();

        jPanelConvite.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane6.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 30, 51), 1, true));

        jtbListarConvidar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarConvidar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarConvidar.setGridColor(new java.awt.Color(21, 30, 51));
        jtbListarConvidar.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarConvidar.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jtbListarConvidar);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setText("Escolha usuários para enviar convite:");

        jButtonEnviarConvite.setBackground(new java.awt.Color(21, 30, 51));
        jButtonEnviarConvite.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonEnviarConvite.setForeground(java.awt.SystemColor.control);
        jButtonEnviarConvite.setText("Convidar");
        jButtonEnviarConvite.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonEnviarConvite.setContentAreaFilled(false);
        jButtonEnviarConvite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarConvite.setOpaque(true);
        jButtonEnviarConvite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviarConviteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviarConviteMouseExited(evt);
            }
        });
        jButtonEnviarConvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarConviteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConviteLayout = new javax.swing.GroupLayout(jPanelConvite);
        jPanelConvite.setLayout(jPanelConviteLayout);
        jPanelConviteLayout.setHorizontalGroup(
            jPanelConviteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConviteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConviteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConviteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEnviarConvite, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelConviteLayout.setVerticalGroup(
            jPanelConviteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConviteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEnviarConvite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabelData.setForeground(new java.awt.Color(21, 30, 51));

        jLabelLocal.setForeground(new java.awt.Color(21, 30, 51));

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextAreaDescricao.setForeground(new java.awt.Color(21, 30, 51));
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(4);
        jTextAreaDescricao.setText("Descrição");
        jTextAreaDescricao.setWrapStyleWord(true);
        jTextAreaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 2));
        jTextAreaDescricao.setDisabledTextColor(new java.awt.Color(21, 30, 51));
        jTextAreaDescricao.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jScrollPane2.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 30, 51), 2, true));
        jScrollPane2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jScrollPane2.setMinimumSize(null);

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jTabbedPane.setOpaque(true);

        jPanelConfirmado.setPreferredSize(new java.awt.Dimension(100, 100));

        jScrollPane3.setBorder(null);

        jtbListarCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarCliente.setForeground(new java.awt.Color(21, 30, 51));
        jtbListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarCliente.setGridColor(new java.awt.Color(21, 30, 51));
        jtbListarCliente.setMinimumSize(null);
        jtbListarCliente.setPreferredSize(null);
        jtbListarCliente.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtbListarCliente);

        javax.swing.GroupLayout jPanelConfirmadoLayout = new javax.swing.GroupLayout(jPanelConfirmado);
        jPanelConfirmado.setLayout(jPanelConfirmadoLayout);
        jPanelConfirmadoLayout.setHorizontalGroup(
            jPanelConfirmadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        jPanelConfirmadoLayout.setVerticalGroup(
            jPanelConfirmadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Confirmado", jPanelConfirmado);

        jPanelTalvez.setOpaque(false);

        jScrollPane4.setBorder(null);

        jtbListarIndecisos.setBackground(java.awt.SystemColor.control);
        jtbListarIndecisos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarIndecisos.setForeground(new java.awt.Color(21, 30, 51));
        jtbListarIndecisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarIndecisos.setGridColor(new java.awt.Color(21, 30, 51));
        jtbListarIndecisos.setOpaque(false);
        jtbListarIndecisos.setPreferredSize(null);
        jtbListarIndecisos.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarIndecisos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jtbListarIndecisos);

        javax.swing.GroupLayout jPanelTalvezLayout = new javax.swing.GroupLayout(jPanelTalvez);
        jPanelTalvez.setLayout(jPanelTalvezLayout);
        jPanelTalvezLayout.setHorizontalGroup(
            jPanelTalvezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        jPanelTalvezLayout.setVerticalGroup(
            jPanelTalvezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTalvezLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jTabbedPane.addTab("Talvez", jPanelTalvez);

        jScrollPane5.setBorder(null);

        jtbListarConvidados.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtbListarConvidados.setForeground(new java.awt.Color(21, 30, 51));
        jtbListarConvidados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbListarConvidados.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarConvidados.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtbListarConvidados);

        javax.swing.GroupLayout jPanelConvidadosLayout = new javax.swing.GroupLayout(jPanelConvidados);
        jPanelConvidados.setLayout(jPanelConvidadosLayout);
        jPanelConvidadosLayout.setHorizontalGroup(
            jPanelConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        jPanelConvidadosLayout.setVerticalGroup(
            jPanelConvidadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConvidadosLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane.addTab("Convidado", jPanelConvidados);

        jPanelComentario.setForeground(new java.awt.Color(21, 30, 51));
        jPanelComentario.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanelComentarioLayout = new javax.swing.GroupLayout(jPanelComentario);
        jPanelComentario.setLayout(jPanelComentarioLayout);
        jPanelComentarioLayout.setHorizontalGroup(
            jPanelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanelComentarioLayout.setVerticalGroup(
            jPanelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Comentários", jPanelComentario);

        jPanelCronograma.setForeground(new java.awt.Color(21, 30, 51));
        jPanelCronograma.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanelCronogramaLayout = new javax.swing.GroupLayout(jPanelCronograma);
        jPanelCronograma.setLayout(jPanelCronogramaLayout);
        jPanelCronogramaLayout.setHorizontalGroup(
            jPanelCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanelCronogramaLayout.setVerticalGroup(
            jPanelCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Cronograma", jPanelCronograma);

        jScrollPane2.setViewportView(jTabbedPane);

        jButtonConvidar.setBackground(new java.awt.Color(21, 30, 51));
        jButtonConvidar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonConvidar.setForeground(java.awt.SystemColor.control);
        jButtonConvidar.setText("Convidar");
        jButtonConvidar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonConvidar.setContentAreaFilled(false);
        jButtonConvidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConvidar.setOpaque(true);
        jButtonConvidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConvidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConvidarMouseExited(evt);
            }
        });
        jButtonConvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvidarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 30, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Evento:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 30, 51));
        jLabel3.setText("Data:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 30, 51));
        jLabel4.setText("Local:");

        jButtonParticipar.setBackground(new java.awt.Color(21, 30, 51));
        jButtonParticipar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonParticipar.setForeground(java.awt.SystemColor.control);
        jButtonParticipar.setText("Participar");
        jButtonParticipar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonParticipar.setContentAreaFilled(false);
        jButtonParticipar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonParticipar.setOpaque(true);
        jButtonParticipar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonParticiparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonParticiparMouseExited(evt);
            }
        });
        jButtonParticipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParticiparActionPerformed(evt);
            }
        });

        jButtonIndeciso.setBackground(new java.awt.Color(21, 30, 51));
        jButtonIndeciso.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonIndeciso.setForeground(java.awt.SystemColor.control);
        jButtonIndeciso.setText("Não sei");
        jButtonIndeciso.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonIndeciso.setContentAreaFilled(false);
        jButtonIndeciso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIndeciso.setOpaque(true);
        jButtonIndeciso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIndecisoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIndecisoMouseExited(evt);
            }
        });
        jButtonIndeciso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIndecisoActionPerformed(evt);
            }
        });

        jButtonRecusar.setBackground(new java.awt.Color(21, 30, 51));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonParticipar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonIndeciso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecusar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConvidar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonParticipar, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonIndeciso, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonRecusar, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonConvidar, javax.swing.GroupLayout.Alignment.CENTER))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParticiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParticiparActionPerformed
        evento.confirmarPresenca(idUserLogando);
        listarParticipantes();
        listarIndecisos();
        listarConvidados();
    }//GEN-LAST:event_jButtonParticiparActionPerformed

    private void jButtonIndecisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIndecisoActionPerformed
        evento.confirmarPossibilidadePresenca(idUserLogando);
        listarParticipantes();
        listarIndecisos();
        listarConvidados();
    }//GEN-LAST:event_jButtonIndecisoActionPerformed

    private void jButtonRecusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecusarActionPerformed
        evento.recusarPresenca(idUserLogando);
        listarParticipantes();
        listarIndecisos();
        listarConvidados();
    }//GEN-LAST:event_jButtonRecusarActionPerformed

    private void jButtonEnviarConviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarConviteActionPerformed
        int idUsuario = (Integer) jtbListarConvidar.getValueAt(jtbListarConvidar.getSelectedRow(), 0);
        evento.convidarUsuario(idUsuario);
        JOptionPane.showMessageDialog(null, "Convite Enviado");
    }//GEN-LAST:event_jButtonEnviarConviteActionPerformed

    private void jButtonConvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvidarActionPerformed
        listarConvidar();
        JOptionPane.showMessageDialog(null,jPanelConvite);
        listarParticipantes();
        listarIndecisos();
        listarConvidados();
    }//GEN-LAST:event_jButtonConvidarActionPerformed

    private void jButtonParticiparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonParticiparMouseEntered
        jButtonParticipar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonParticiparMouseEntered

    private void jButtonParticiparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonParticiparMouseExited
        Color padrao=new Color(21,30,51);
        jButtonParticipar.setBackground(padrao);
    }//GEN-LAST:event_jButtonParticiparMouseExited

    private void jButtonIndecisoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIndecisoMouseEntered
       jButtonIndeciso.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonIndecisoMouseEntered

    private void jButtonIndecisoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIndecisoMouseExited
        Color padrao=new Color(21,30,51);
        jButtonIndeciso.setBackground(padrao);
    }//GEN-LAST:event_jButtonIndecisoMouseExited

    private void jButtonRecusarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecusarMouseEntered
        jButtonRecusar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonRecusarMouseEntered

    private void jButtonRecusarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecusarMouseExited
        Color padrao=new Color(21,30,51);
        jButtonRecusar.setBackground(padrao);
    }//GEN-LAST:event_jButtonRecusarMouseExited

    private void jButtonConvidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConvidarMouseEntered
        jButtonConvidar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonConvidarMouseEntered

    private void jButtonConvidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConvidarMouseExited
        Color padrao=new Color(21,30,51);
        jButtonConvidar.setBackground(padrao);
    }//GEN-LAST:event_jButtonConvidarMouseExited

    private void jButtonEnviarConviteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarConviteMouseEntered
        jButtonEnviarConvite.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButtonEnviarConviteMouseEntered

    private void jButtonEnviarConviteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarConviteMouseExited
        Color padrao=new Color(21,30,51);
        jButtonEnviarConvite.setBackground(padrao);
    }//GEN-LAST:event_jButtonEnviarConviteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvidar;
    private javax.swing.JButton jButtonEnviarConvite;
    private javax.swing.JButton jButtonIndeciso;
    private javax.swing.JButton jButtonParticipar;
    private javax.swing.JButton jButtonRecusar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelComentario;
    private javax.swing.JPanel jPanelConfirmado;
    private javax.swing.JPanel jPanelConvidados;
    private javax.swing.JPanel jPanelConvite;
    private javax.swing.JPanel jPanelCronograma;
    private javax.swing.JPanel jPanelTalvez;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTable jtbListarCliente;
    private javax.swing.JTable jtbListarConvidados;
    private javax.swing.JTable jtbListarConvidar;
    private javax.swing.JTable jtbListarIndecisos;
    // End of variables declaration//GEN-END:variables
}
