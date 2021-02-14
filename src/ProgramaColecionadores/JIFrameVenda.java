package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casa
 */
public class JIFrameVenda extends javax.swing.JInternalFrame {
        int idUserLogando=Principal.getIdUserLogando();
        /**
       * Creates new form JIlFrameVenda
       */
        public JIFrameVenda() {
            initComponents();
            ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
            this.setBorder(null);//retirar bordas  
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTeste = new javax.swing.JPanel();
        jPanelTroca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbListarItem = new javax.swing.JTable();
        adicionarItemLoja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        removerItemLoja = new javax.swing.JButton();
        visualizarItem = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        recebido = new javax.swing.JButton();
        MenuInferior2 = new javax.swing.JPanel();
        MinhasVendas = new javax.swing.JButton();
        MinhasCompras = new javax.swing.JButton();
        MinhaLoja = new javax.swing.JButton();
        LojaAmigos = new javax.swing.JButton();
        LojasRede = new javax.swing.JButton();
        jButtonaCriarVenda = new javax.swing.JButton();
        jPanelConteudo = new javax.swing.JPanel();

        jPanelTroca.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));

        jtbListarItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jtbListarItem.setMaximumSize(new java.awt.Dimension(225, 0));
        jtbListarItem.setSelectionBackground(new java.awt.Color(21, 30, 51));
        jtbListarItem.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtbListarItem);

        adicionarItemLoja.setBackground(new java.awt.Color(21, 30, 51));
        adicionarItemLoja.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        adicionarItemLoja.setForeground(java.awt.SystemColor.control);
        adicionarItemLoja.setText("Adicionar à Loja");
        adicionarItemLoja.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        adicionarItemLoja.setContentAreaFilled(false);
        adicionarItemLoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarItemLoja.setFocusPainted(false);
        adicionarItemLoja.setOpaque(true);
        adicionarItemLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adicionarItemLojaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adicionarItemLojaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adicionarItemLojaMousePressed(evt);
            }
        });
        adicionarItemLoja.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                adicionarItemLojaMouseDragged(evt);
            }
        });
        adicionarItemLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarItemLojaActionPerformed(evt);
            }
        });

        removerItemLoja.setBackground(new java.awt.Color(21, 30, 51));
        removerItemLoja.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        removerItemLoja.setForeground(java.awt.SystemColor.control);
        removerItemLoja.setText("Remover da Loja");
        removerItemLoja.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        removerItemLoja.setContentAreaFilled(false);
        removerItemLoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerItemLoja.setFocusPainted(false);
        removerItemLoja.setOpaque(true);
        removerItemLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removerItemLojaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removerItemLojaMouseExited(evt);
            }
        });
        removerItemLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerItemLojaActionPerformed(evt);
            }
        });

        visualizarItem.setBackground(new java.awt.Color(21, 30, 51));
        visualizarItem.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        visualizarItem.setForeground(java.awt.SystemColor.control);
        visualizarItem.setText("Visualizar");
        visualizarItem.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        visualizarItem.setContentAreaFilled(false);
        visualizarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visualizarItem.setFocusPainted(false);
        visualizarItem.setOpaque(true);
        visualizarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visualizarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visualizarItemMouseExited(evt);
            }
        });
        visualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarItemActionPerformed(evt);
            }
        });

        comprar.setBackground(new java.awt.Color(21, 30, 51));
        comprar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        comprar.setForeground(java.awt.SystemColor.control);
        comprar.setText("Comprar");
        comprar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        comprar.setContentAreaFilled(false);
        comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprar.setFocusPainted(false);
        comprar.setOpaque(true);
        comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comprarMouseExited(evt);
            }
        });
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        enviar.setBackground(new java.awt.Color(21, 30, 51));
        enviar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        enviar.setForeground(java.awt.SystemColor.control);
        enviar.setText("Enviar");
        enviar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        enviar.setContentAreaFilled(false);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setFocusPainted(false);
        enviar.setOpaque(true);
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarMouseExited(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        recebido.setBackground(new java.awt.Color(21, 30, 51));
        recebido.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        recebido.setForeground(java.awt.SystemColor.control);
        recebido.setText("Recebido");
        recebido.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        recebido.setContentAreaFilled(false);
        recebido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recebido.setFocusPainted(false);
        recebido.setOpaque(true);
        recebido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recebidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recebidoMouseExited(evt);
            }
        });
        recebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTrocaLayout = new javax.swing.GroupLayout(jPanelTroca);
        jPanelTroca.setLayout(jPanelTrocaLayout);
        jPanelTrocaLayout.setHorizontalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTrocaLayout.createSequentialGroup()
                        .addComponent(adicionarItemLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerItemLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visualizarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recebido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelTrocaLayout.setVerticalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarItemLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerItemLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recebido, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanelTesteLayout = new javax.swing.GroupLayout(jPanelTeste);
        jPanelTeste.setLayout(jPanelTesteLayout);
        jPanelTesteLayout.setHorizontalGroup(
            jPanelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(jPanelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTroca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTesteLayout.setVerticalGroup(
            jPanelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
            .addGroup(jPanelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTroca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBorder(null);

        MenuInferior2.setBackground(new java.awt.Color(21, 30, 51));
        MenuInferior2.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        MenuInferior2.setMaximumSize(new java.awt.Dimension(0, 30));
        MenuInferior2.setMinimumSize(new java.awt.Dimension(0, 30));

        MinhasVendas.setBackground(new java.awt.Color(255, 255, 255));
        MinhasVendas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MinhasVendas.setForeground(new java.awt.Color(255, 255, 255));
        MinhasVendas.setText("MINHAS VENDAS");
        MinhasVendas.setContentAreaFilled(false);
        MinhasVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinhasVendas.setFocusPainted(false);
        MinhasVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MinhasVendas.setPreferredSize(new java.awt.Dimension(190, 27));
        MinhasVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinhasVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinhasVendasMouseExited(evt);
            }
        });
        MinhasVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinhasVendasActionPerformed(evt);
            }
        });
        MenuInferior2.add(MinhasVendas);

        MinhasCompras.setBackground(new java.awt.Color(255, 255, 255));
        MinhasCompras.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MinhasCompras.setForeground(new java.awt.Color(255, 255, 255));
        MinhasCompras.setText("MINHAS COMPRAS");
        MinhasCompras.setContentAreaFilled(false);
        MinhasCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinhasCompras.setFocusPainted(false);
        MinhasCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MinhasCompras.setPreferredSize(new java.awt.Dimension(190, 27));
        MinhasCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinhasComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinhasComprasMouseExited(evt);
            }
        });
        MinhasCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinhasComprasActionPerformed(evt);
            }
        });
        MenuInferior2.add(MinhasCompras);

        MinhaLoja.setBackground(new java.awt.Color(255, 255, 255));
        MinhaLoja.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MinhaLoja.setForeground(new java.awt.Color(255, 255, 255));
        MinhaLoja.setText("MINHA LOJA");
        MinhaLoja.setContentAreaFilled(false);
        MinhaLoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinhaLoja.setFocusPainted(false);
        MinhaLoja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MinhaLoja.setPreferredSize(new java.awt.Dimension(190, 27));
        MinhaLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinhaLojaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinhaLojaMouseExited(evt);
            }
        });
        MinhaLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinhaLojaActionPerformed(evt);
            }
        });
        MenuInferior2.add(MinhaLoja);

        LojaAmigos.setBackground(new java.awt.Color(255, 255, 255));
        LojaAmigos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LojaAmigos.setForeground(new java.awt.Color(255, 255, 255));
        LojaAmigos.setText("LOJA DE AMIGOS");
        LojaAmigos.setContentAreaFilled(false);
        LojaAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LojaAmigos.setFocusPainted(false);
        LojaAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LojaAmigos.setPreferredSize(new java.awt.Dimension(190, 27));
        LojaAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LojaAmigosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LojaAmigosMouseExited(evt);
            }
        });
        LojaAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LojaAmigosActionPerformed(evt);
            }
        });
        MenuInferior2.add(LojaAmigos);

        LojasRede.setBackground(new java.awt.Color(255, 255, 255));
        LojasRede.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LojasRede.setForeground(new java.awt.Color(255, 255, 255));
        LojasRede.setText("LOJAS DA REDE");
        LojasRede.setContentAreaFilled(false);
        LojasRede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LojasRede.setFocusPainted(false);
        LojasRede.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LojasRede.setPreferredSize(new java.awt.Dimension(190, 27));
        LojasRede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LojasRedeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LojasRedeMouseExited(evt);
            }
        });
        LojasRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LojasRedeActionPerformed(evt);
            }
        });
        MenuInferior2.add(LojasRede);

        jButtonaCriarVenda.setBackground(new java.awt.Color(255, 255, 255));
        jButtonaCriarVenda.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonaCriarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonaCriarVenda.setText("CRIAR VENDA");
        jButtonaCriarVenda.setContentAreaFilled(false);
        jButtonaCriarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonaCriarVenda.setFocusPainted(false);
        jButtonaCriarVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonaCriarVenda.setPreferredSize(new java.awt.Dimension(190, 27));
        jButtonaCriarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonaCriarVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonaCriarVendaMouseExited(evt);
            }
        });
        jButtonaCriarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaCriarVendaActionPerformed(evt);
            }
        });
        MenuInferior2.add(jButtonaCriarVenda);

        jPanelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConteudo.setLayout(new javax.swing.BoxLayout(jPanelConteudo, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuInferior2, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
            .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuInferior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinhasVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinhasVendasMouseExited
        MinhasVendas.setFont(new Font("Verdana",Font.PLAIN,14));
    }//GEN-LAST:event_MinhasVendasMouseExited

    private void MinhasVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinhasVendasMouseEntered
        MinhasVendas.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_MinhasVendasMouseEntered

    private void MinhasVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinhasVendasActionPerformed
       this.removerItemLoja.setVisible(false);
       this.adicionarItemLoja.setVisible(false);
       this.recebido.setVisible(false);
       this.comprar.setVisible(false);
       this.enviar.setVisible(true);
       listarVendas();
       this.jPanelConteudo.removeAll();
       this.jPanelConteudo.repaint();
       this.jPanelConteudo.add(jPanelTroca);
       this.jPanelConteudo.updateUI();
    }//GEN-LAST:event_MinhasVendasActionPerformed

    private void LojaAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LojaAmigosActionPerformed
       this.removerItemLoja.setVisible(false);
       this.adicionarItemLoja.setVisible(false);
       this.comprar.setVisible(true);
       this.enviar.setVisible(false);
       this.listarItemLojaAmigos();
       this.jPanelConteudo.removeAll();
       this.jPanelConteudo.repaint();
       this.jPanelConteudo.add(jPanelTroca);
       this.jPanelConteudo.updateUI();
    }//GEN-LAST:event_LojaAmigosActionPerformed

    private void LojasRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LojasRedeActionPerformed
       this.removerItemLoja.setVisible(false);
       this.adicionarItemLoja.setVisible(false);
       this.recebido.setVisible(false);
       this.comprar.setVisible(true);
       this.enviar.setVisible(false);
       this.listarItemShopping();
       this.jPanelConteudo.removeAll();
       this.jPanelConteudo.repaint();
       this.jPanelConteudo.add(jPanelTroca);
       this.jPanelConteudo.updateUI();
    }//GEN-LAST:event_LojasRedeActionPerformed

    private void jButtonaCriarVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaCriarVendaMouseExited
        jButtonaCriarVenda.setFont(new Font("Verdana",Font.PLAIN,14));
    }//GEN-LAST:event_jButtonaCriarVendaMouseExited

    private void jButtonaCriarVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaCriarVendaMouseEntered
        jButtonaCriarVenda.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_jButtonaCriarVendaMouseEntered

    private void jButtonaCriarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaCriarVendaActionPerformed
       this.removerItemLoja.setVisible(false);
       this.adicionarItemLoja.setVisible(true);
       this.recebido.setVisible(false);
       this.comprar.setVisible(false);
       this.enviar.setVisible(false);
       this.listarItemForaLoja();
       this.jPanelConteudo.removeAll();
       this.jPanelConteudo.repaint();
       this.jPanelConteudo.add(jPanelTroca);
       this.jPanelTroca.setVisible(true);
       this.jPanelConteudo.updateUI();
    }//GEN-LAST:event_jButtonaCriarVendaActionPerformed

    private void MinhasComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinhasComprasActionPerformed
       this.recebido.setVisible(true);  
       this.removerItemLoja.setVisible(false);
       this.adicionarItemLoja.setVisible(false);
       this.comprar.setVisible(false);
        this.enviar.setVisible(false);
       listarCompras();
       this.jPanelConteudo.removeAll();
       this.jPanelConteudo.repaint();
       this.jPanelConteudo.add(jPanelTroca);
       this.jPanelConteudo.updateUI();
                
    }//GEN-LAST:event_MinhasComprasActionPerformed

    private void adicionarItemLojaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarItemLojaMouseEntered
        if(adicionarItemLoja.isEnabled()==true){
            adicionarItemLoja.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_adicionarItemLojaMouseEntered

    private void adicionarItemLojaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarItemLojaMouseExited
        Color padrao=new Color(21,30,51);
        adicionarItemLoja.setBackground(padrao);
    }//GEN-LAST:event_adicionarItemLojaMouseExited

    private void adicionarItemLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarItemLojaActionPerformed
       if (jtbListarItem.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Nenhum item selecionada.");}
        Integer idItem = (Integer) jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 0);
        String tipoColecao= jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 2).toString();
        Integer tipoColecaoItem=1;
                for(String teste:Dados.getNomesTiposColecao().values()){
                    if (teste == null ? tipoColecao == null : teste.equals(tipoColecao)){
                    break;
                    }else{
                    tipoColecaoItem++;    
                    }
                }
        Item item=Item.getItem(idItem, tipoColecaoItem); 
        item.setDisponivelVenda(true);
        listarItemForaLoja();
        adicionarItemLoja.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));      
    }//GEN-LAST:event_adicionarItemLojaActionPerformed

    private void MinhaLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinhaLojaActionPerformed
        this.removerItemLoja.setVisible(true);
        this.adicionarItemLoja.setVisible(false);
        this.comprar.setVisible(false);
        this.enviar.setVisible(false);
        this.listarItemLoja();
        this.jPanelConteudo.removeAll();
        this.jPanelConteudo.repaint();
        this.jPanelConteudo.add(jPanelTroca);
        this.jPanelConteudo.updateUI();
    }//GEN-LAST:event_MinhaLojaActionPerformed

    private void removerItemLojaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerItemLojaMouseExited
        Color padrao=new Color(21,30,51);
        removerItemLoja.setBackground(padrao);
    }//GEN-LAST:event_removerItemLojaMouseExited

    private void removerItemLojaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerItemLojaMouseEntered
        removerItemLoja.setOpaque(true);
        removerItemLoja.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_removerItemLojaMouseEntered

    private void removerItemLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItemLojaActionPerformed
        if (jtbListarItem.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Nenhum item selecionada.");}
        Integer idItem = (Integer) jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 0);
        String tipoColecao= jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 2).toString();
        Integer tipoColecaoItem=1;
                for(String teste:Dados.getNomesTiposColecao().values()){
                    if (teste == null ? tipoColecao == null : teste.equals(tipoColecao)){
                    break;
                    }else{
                    tipoColecaoItem++;    
                    }
                }
       Item item=Item.getItem(idItem, tipoColecaoItem); 
       item.setDisponivelVenda(false);
        //adicionarItemLoja.setText("Item adicionada à Loja!");
       listarItemLoja();
    }//GEN-LAST:event_removerItemLojaActionPerformed

    private void visualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarItemActionPerformed
      if (jtbListarItem.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Nenhum item selecionada.");}
        Integer idItem = (Integer) jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 0);
        String tipoColecao= jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 2).toString();
        Integer tipoColecaoItem=1;
                for(String teste:Dados.getNomesTiposColecao().values()){
                    if (teste == null ? tipoColecao == null : teste.equals(tipoColecao)){
                    break;
                    }else{
                    tipoColecaoItem++;    
                    }
                }
      Item item=Item.getItem(idItem, tipoColecaoItem); 
      JInternalFrame f;
      JFrame e;
      switch (tipoColecaoItem){
          case 1:
          f = new JIFrameCamiseta((Camiseta) item);
          e = new ExibeItemColecao(f);
      JOptionPane.showMessageDialog(null,e,"Camiseta",JOptionPane.INFORMATION_MESSAGE); 
              break;
          case 2:
          f = new JIFrameCartao((Cartao) item);
          e = new ExibeItemColecao(f);
      JOptionPane.showMessageDialog(null,e,"Cartão",JOptionPane.INFORMATION_MESSAGE); 
              break;
          case 3:
          f = new JIFrameJogo((Jogo)item);
          e = new ExibeItemColecao(f);
      JOptionPane.showMessageDialog(null,e,"Jogo",JOptionPane.INFORMATION_MESSAGE); 
              break;
          case 4:
          f = new JIFrameMoeda((Moeda)item);
          e = new ExibeItemColecao(f);
      JOptionPane.showMessageDialog(null,e,"Moeda",JOptionPane.INFORMATION_MESSAGE); 
              break;
          case 5:
          f = new JIFrameQuadrinho((Quadrinho)item);
          e = new ExibeItemColecao(f);
      JOptionPane.showMessageDialog(null,e,"quadrinho!!!",JOptionPane.INFORMATION_MESSAGE); 
          default:
          f = new JIFramehWheels((hWheels) item);
          e=new ExibeItemColecao(f);
      JOptionPane.showMessageDialog(null,e,"Hot Whheels!!!",JOptionPane.INFORMATION_MESSAGE); 
              break;
    }
    }//GEN-LAST:event_visualizarItemActionPerformed

    private void visualizarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarItemMouseEntered
        visualizarItem.setOpaque(true);
        visualizarItem.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_visualizarItemMouseEntered

    private void visualizarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarItemMouseExited
        Color padrao=new Color(21,30,51);
        visualizarItem.setBackground(padrao);
    }//GEN-LAST:event_visualizarItemMouseExited

    private void comprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseExited
        Color padrao=new Color(21,30,51);
        comprar.setBackground(padrao);
    }//GEN-LAST:event_comprarMouseExited

    private void comprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseEntered
        comprar.setOpaque(true);
        comprar.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_comprarMouseEntered

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        if (jtbListarItem.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Nenhum item selecionada.");}
        Integer idItem = (Integer) jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 0);
        String tipoColecao= jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 2).toString();
        Integer tipoColecaoItem=1;
                for(String teste:Dados.getNomesTiposColecao().values()){
                    if (teste == null ? tipoColecao == null : teste.equals(tipoColecao)){
                    break;
                    }else{
                    tipoColecaoItem++;    
                    }
                }
        Item item=Item.getItem(idItem, tipoColecaoItem); 
        item.setDisponivelVenda(false);
        Venda venda=new Venda(idItem,tipoColecaoItem,idUserLogando);
    }//GEN-LAST:event_comprarActionPerformed

    private void enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseExited
        Color padrao=new Color(21,30,51);
        enviar.setBackground(padrao);
    }//GEN-LAST:event_enviarMouseExited

    private void enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseEntered
        enviar.setOpaque(true);
        enviar.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_enviarMouseEntered

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (jtbListarItem.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionada.");}
        Integer idItem = (Integer) jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 0);
        Venda venda=Venda.listaVenda.get(idItem);
        venda.setEstadoVenda(Venda.estadoVenda.Enviado);
        this.listarVendas();
    }//GEN-LAST:event_enviarActionPerformed

    private void recebidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recebidoMouseExited
        Color padrao=new Color(21,30,51);
        recebido.setBackground(padrao);
    }//GEN-LAST:event_recebidoMouseExited

    private void recebidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recebidoMouseEntered
        recebido.setOpaque(true);
        recebido.setBackground(Color.DARK_GRAY); 
    }//GEN-LAST:event_recebidoMouseEntered

    private void recebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebidoActionPerformed
    if (jtbListarItem.getSelectedRow() == -1) {
       JOptionPane.showMessageDialog(this, "Nenhum item selecionada.");}
       Integer idItem = (Integer) jtbListarItem.getValueAt(jtbListarItem.getSelectedRow(), 0);
       Venda venda=Venda.listaVenda.get(idItem);
       venda.setEstadoVenda(Venda.estadoVenda.Recebido);
       this.listarCompras();
    }//GEN-LAST:event_recebidoActionPerformed

    private void adicionarItemLojaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarItemLojaMouseDragged
     adicionarItemLoja.getLocation().move(evt.getX(),evt.getY());  
    }//GEN-LAST:event_adicionarItemLojaMouseDragged

    private void adicionarItemLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarItemLojaMousePressed
    // TODO add your handling code here:
    }//GEN-LAST:event_adicionarItemLojaMousePressed

    private void MinhasComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinhasComprasMouseEntered
        MinhasCompras.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_MinhasComprasMouseEntered

    private void MinhasComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinhasComprasMouseExited
        MinhasCompras.setFont(new Font("Verdana",Font.PLAIN,14));
    }//GEN-LAST:event_MinhasComprasMouseExited

    private void MinhaLojaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinhaLojaMouseEntered
        MinhaLoja.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_MinhaLojaMouseEntered

    private void MinhaLojaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinhaLojaMouseExited
        MinhaLoja.setFont(new Font("Verdana",Font.PLAIN,14));
    }//GEN-LAST:event_MinhaLojaMouseExited

    private void LojaAmigosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LojaAmigosMouseEntered
        LojaAmigos.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_LojaAmigosMouseEntered

    private void LojaAmigosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LojaAmigosMouseExited
        LojaAmigos.setFont(new Font("Verdana",Font.PLAIN,14));
    }//GEN-LAST:event_LojaAmigosMouseExited

    private void LojasRedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LojasRedeMouseEntered
        LojasRede.setFont(new Font("Verdana",Font.BOLD,14));
    }//GEN-LAST:event_LojasRedeMouseEntered

    private void LojasRedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LojasRedeMouseExited
        LojasRede.setFont(new Font("Verdana",Font.PLAIN,14));
    }//GEN-LAST:event_LojasRedeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LojaAmigos;
    private javax.swing.JButton LojasRede;
    private javax.swing.JPanel MenuInferior2;
    private javax.swing.JButton MinhaLoja;
    private javax.swing.JButton MinhasCompras;
    private javax.swing.JButton MinhasVendas;
    private javax.swing.JButton adicionarItemLoja;
    private javax.swing.JButton comprar;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButtonaCriarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelTeste;
    private static javax.swing.JPanel jPanelTroca;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbListarItem;
    private javax.swing.JButton recebido;
    private javax.swing.JButton removerItemLoja;
    private javax.swing.JButton visualizarItem;
    // End of variables declaration//GEN-END:variables
        private void listarItemForaLoja() {
            DefaultTableModel dtm = (DefaultTableModel) jtbListarItem.getModel();
            dtm.setNumRows(0);
            for (Item item:Item.getListaItensUsuarioInvendivel(idUserLogando)) {
                dtm.addRow(new Object[]{item.getIdItem(),item.getNome(),item.getTipoColecao()});
            }
        }
        private void listarItemLojaAmigos() {
            DefaultTableModel dtm = (DefaultTableModel) jtbListarItem.getModel();
            dtm.setNumRows(0);
            for (Item item:Item.getListaItens()) {
                if((item.isDisponivelVenda()==true)&&(Dados.getUsuariosBD().get(idUserLogando).amigos.contains(item.getIdUsuario()))){
                    dtm.addRow(new Object[]{item.getIdItem(),item.getNome(),item.getTipoColecao()});}
            }
        }
        private void listarItemShopping() {
            DefaultTableModel dtm = (DefaultTableModel) jtbListarItem.getModel();
            dtm.setNumRows(0);
            for (Item item:Item.getListaItens()) {
                if(
                    (item.isDisponivelVenda()==true)&&
                    (item.getIdUsuario()!=idUserLogando)&&
                    (item.getIdUsuario()!=0)
                ){
                    dtm.addRow(new Object[]{item.getIdItem(),item.getNome(),item.getTipoColecao()});}
            }
        }
        private void listarItemLoja() {
            DefaultTableModel dtm = (DefaultTableModel) jtbListarItem.getModel();
            dtm.setNumRows(0);
            for (Item item:Item.getListaItensUsuarioVendivel(idUserLogando)) {
                dtm.addRow(new Object[]{item.getIdItem(),item.getNome(),item.getTipoColecao()});
            }
        }
        private void listarVendas() {
            DefaultTableModel dtm = (DefaultTableModel) jtbListarItem.getModel();
            dtm.setNumRows(0);
            for (Venda venda:Venda.getListaVendasUsuario(idUserLogando)) {
                dtm.addRow(new Object[]{
                venda.getIdVenda(),venda.getItem().getNome(),venda.getEstado()});
            }
        }

        private void listarCompras(){
            DefaultTableModel dtm = (DefaultTableModel) jtbListarItem.getModel();
            dtm.setNumRows(0);
            for (Venda venda:Venda.getListaComprasUsuario(idUserLogando)) {
                dtm.addRow(new Object[]{
                venda.getIdVenda(),venda.getItem().getNome(),venda.getEstado()});
            }
        }
}