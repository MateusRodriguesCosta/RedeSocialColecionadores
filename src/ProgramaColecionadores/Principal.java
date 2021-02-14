package ProgramaColecionadores;

import Jogo.Cartas;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {
    static Integer idUserLog;
    static int idUserLogando;
    static Cartas cartas=new Cartas();
    //metodo que recebe o id do usuario logando e armazena este id nas variaveis idUserLog e idUserLogando da classe principal.
    public static void setIdUserLogando(int idUserLogando) {
        Principal.idUserLogando = idUserLogando;
        Principal.idUserLog=idUserLogando;
    }
    //Metodo que retorna o Id do usuario logando
    public static int getIdUserLogando() {
        return idUserLogando;
    }
    private JIFrameUsuariosRede jIFramePefil;
    
    //metodo construtor
    public Principal() {
         //Faz com qe o estado inicial do frame seja maximizado(Inicia o programa maximizado)
        setExtendedState(JFrame.MAXIMIZED_BOTH);  
        //inicializa todos os componentes internos do Frame
        initComponents();
        jButtonPerfil.setContentAreaFilled(false);
        ImageIcon icone = new ImageIcon(Principal.class.getResource("/Images/icone.png"));
        setIconImage(icone.getImage());
        
        //Scrollzinho básico
        JScrollPane scrPane = new JScrollPane(jPanelConteudo);
        scrPane.setWheelScrollingEnabled(true);
        scrPane.setViewportView(jPanelConteudo);
        scrPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.jPanelConteudo.updateUI();
        add(scrPane);
        cartas.preecherListas();
        jPanelMenu.setVisible(false);          
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        topo = new javax.swing.JPanel();
        jPanelColecoes = new javax.swing.JPanel();
        jButtonPerfil = new javax.swing.JButton();
        jPanelResto = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        bemVindo = new javax.swing.JLabel();
        BVfoto = new javax.swing.JLabel();
        jPanelMarca = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelMarca = new javax.swing.JLabel();
        shopping = new javax.swing.JButton();
        jogos = new javax.swing.JButton();
        jPanelConteudo = new javax.swing.JPanel();
        jDPPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jIFrameLogin1 = new ProgramaColecionadores.JIFrameLogin();
        jIFrameCadastroUser1 = new ProgramaColecionadores.JIFrameCadastroUser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integra");
        setMinimumSize(new java.awt.Dimension(900, 200));

        jPanelMenu.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(1024, 30));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1024, 30));

        topo.setBackground(new java.awt.Color(240, 255, 255));
        topo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(21, 30, 51)));
        topo.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        topo.setPreferredSize(new java.awt.Dimension(1084, 30));
        topo.setLayout(new javax.swing.BoxLayout(topo, javax.swing.BoxLayout.LINE_AXIS));

        jPanelColecoes.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanelColecoes.setMinimumSize(new java.awt.Dimension(1024, 30));
        jPanelColecoes.setPreferredSize(new java.awt.Dimension(1024, 30));

        jButtonPerfil.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPerfil.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        jButtonPerfil.setText("PERFIL");
        jButtonPerfil.setBorder(null);
        jButtonPerfil.setContentAreaFilled(false);
        jButtonPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPerfil.setMaximumSize(new java.awt.Dimension(85, 61));
        jButtonPerfil.setMinimumSize(new java.awt.Dimension(97, 61));
        jButtonPerfil.setOpaque(true);
        jButtonPerfil.setPreferredSize(new java.awt.Dimension(97, 61));
        jButtonPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPerfilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPerfilMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPerfilMouseEntered(evt);
            }
        });
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });

        jPanelResto.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResto.setAlignmentX(0.0F);
        jPanelResto.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanelResto.setMinimumSize(null);

        jButtonSair.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(21, 30, 51));
        jButtonSair.setText("SAIR");
        jButtonSair.setBorder(null);
        jButtonSair.setBorderPainted(false);
        jButtonSair.setContentAreaFilled(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSair.setMaximumSize(new java.awt.Dimension(85, 50));
        jButtonSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sairPress.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        bemVindo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bemVindo.setForeground(new java.awt.Color(21, 30, 51));
        bemVindo.setToolTipText("Usuário logado");
        bemVindo.setPreferredSize(new java.awt.Dimension(245, 31));

        javax.swing.GroupLayout jPanelRestoLayout = new javax.swing.GroupLayout(jPanelResto);
        jPanelResto.setLayout(jPanelRestoLayout);
        jPanelRestoLayout.setHorizontalGroup(
            jPanelRestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BVfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 566, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelRestoLayout.setVerticalGroup(
            jPanelRestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRestoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelRestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BVfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelMarca.setBackground(new java.awt.Color(254, 254, 254));
        jPanelMarca.setPreferredSize(new java.awt.Dimension(122, 30));

        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 4, 0, new java.awt.Color(254, 254, 254)), javax.swing.BorderFactory.createEtchedBorder()));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(21, 30, 51));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 244, 244));
        jButton1.setText("  Buscar  ");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(21, 30, 51));
        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("  Postar  ");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 4, 0, new java.awt.Color(254, 254, 254)));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icone.png"))); // NOI18N
        jLabelMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMarca.setMaximumSize(new java.awt.Dimension(150, 61));
        jLabelMarca.setMinimumSize(new java.awt.Dimension(150, 61));
        jLabelMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMarcaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMarcaLayout = new javax.swing.GroupLayout(jPanelMarca);
        jPanelMarca.setLayout(jPanelMarcaLayout);
        jPanelMarcaLayout.setHorizontalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMarcaLayout.setVerticalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMarcaLayout.createSequentialGroup()
                .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        shopping.setBackground(new java.awt.Color(255, 255, 255));
        shopping.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        shopping.setText("SHOPPING");
        shopping.setBorder(null);
        shopping.setContentAreaFilled(false);
        shopping.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopping.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shopping.setMaximumSize(new java.awt.Dimension(85, 61));
        shopping.setMinimumSize(new java.awt.Dimension(97, 61));
        shopping.setOpaque(true);
        shopping.setPreferredSize(new java.awt.Dimension(97, 61));
        shopping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shoppingMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shoppingMouseEntered(evt);
            }
        });
        shopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingActionPerformed(evt);
            }
        });

        jogos.setBackground(new java.awt.Color(255, 255, 255));
        jogos.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        jogos.setText("Ajuda");
        jogos.setBorder(null);
        jogos.setContentAreaFilled(false);
        jogos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jogos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jogos.setMaximumSize(new java.awt.Dimension(85, 61));
        jogos.setMinimumSize(new java.awt.Dimension(97, 61));
        jogos.setOpaque(true);
        jogos.setPreferredSize(new java.awt.Dimension(97, 61));
        jogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jogosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jogosMouseExited(evt);
            }
        });
        jogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelColecoesLayout = new javax.swing.GroupLayout(jPanelColecoes);
        jPanelColecoes.setLayout(jPanelColecoesLayout);
        jPanelColecoesLayout.setHorizontalGroup(
            jPanelColecoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColecoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shopping, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jogos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelResto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelColecoesLayout.setVerticalGroup(
            jPanelColecoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColecoesLayout.createSequentialGroup()
                .addGroup(jPanelColecoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelColecoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(shopping, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jogos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelResto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topo.add(jPanelColecoes);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topo, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanelMenu, java.awt.BorderLayout.PAGE_START);

        jPanelConteudo.setMaximumSize(new java.awt.Dimension(1248, 1000));
        jPanelConteudo.setMinimumSize(new java.awt.Dimension(900, 400));
        jPanelConteudo.setPreferredSize(new java.awt.Dimension(1248, 652));

        jDPPrincipal.setBackground(new java.awt.Color(254, 254, 254));
        jDPPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDPPrincipal.setMaximumSize(new java.awt.Dimension(1248, 200));
        jDPPrincipal.setPreferredSize(new java.awt.Dimension(1248, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDPPrincipal.add(jLabel1);
        jLabel1.setBounds(50, 380, 1390, 640);

        jIFrameLogin1.setVisible(true);
        jDPPrincipal.add(jIFrameLogin1);
        jIFrameLogin1.setBounds(180, 70, 350, 320);

        jIFrameCadastroUser1.setVisible(true);
        jDPPrincipal.add(jIFrameCadastroUser1);
        jIFrameCadastroUser1.setBounds(580, 70, 700, 323);

        javax.swing.GroupLayout jPanelConteudoLayout = new javax.swing.GroupLayout(jPanelConteudo);
        jPanelConteudo.setLayout(jPanelConteudoLayout);
        jPanelConteudoLayout.setHorizontalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelConteudoLayout.setVerticalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelConteudo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        //RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();
        //Verificação de usuario logado...se estiver, então ele exibe internalFrame de Perfil e recebe o usuario que está logado, senão exibe mensagem com burro.
        if (idUserLog!=null){ Dados.Rank();
        //JIFramePerfil recebendo o ID de usuario logando
        JIFrameUsuariosRede jIFramePefil = new JIFrameUsuariosRede(Principal.getIdUserLogando());
        //Add adicionando JIFramePerfil que foi criado ao JDesktioFrame(jDPPrincipal)          
        jDPPrincipal.add(jIFramePefil);       
        //tornando frame Perfil visivel ao usuario
        jIFramePefil.setVisible(true);
        //setMaximum para adaptar internalFrame/componentes do frame atividades ao DesktopFrame em dimensões(tamanho).
        try {jIFramePefil.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
        }else{
            //Caso o usuario tenha feito logoff:
               adcMenuPrincipal();
        }
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        //RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();  
        //Para que o usuario não perca suas informações, tais como dados, rank, atividades...
        //eles são salvos no momento em que ele pressionar o botao Sair. Assim, bloqueando as 
        //atividades daquele usuario que estava logado anteriormante(bloqueio usado para utilização do UNDO e REDO).
        if (idUserLog!=null){
               Dados.Rank();
               Atividade atividade=new Atividade();
               atividade.bloquearAtividades(idUserLogando);
               idUserLog=null;
               adcMenuPrincipal();
               bemVindo.setText("");
               BVfoto.setIcon(null);
               jDPPrincipal.updateUI();
        }else{
               adcMenuPrincipal();
               jDPPrincipal.updateUI();            
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPerfilMouseClicked

    }//GEN-LAST:event_jButtonPerfilMouseClicked

    private void jButtonPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPerfilMouseEntered
        Color padrao=new Color(21,30,51);
        jButtonPerfil.setBackground(padrao);
        jButtonPerfil.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonPerfilMouseEntered

    private void jButtonPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPerfilMouseExited
        Color padrao=new Color(21,30,51);
        jButtonPerfil.setBackground(Color.WHITE);
        jButtonPerfil.setForeground(padrao);
    }//GEN-LAST:event_jButtonPerfilMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void shoppingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingMouseExited
        Color padrao=new Color(21,30,51);
        shopping.setBackground(Color.WHITE);
        shopping.setForeground(padrao);        
    }//GEN-LAST:event_shoppingMouseExited

    private void shoppingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoppingMouseEntered
        Color padrao=new Color(21,30,51);
        shopping.setBackground(padrao);
        shopping.setForeground(Color.WHITE);
    }//GEN-LAST:event_shoppingMouseEntered

    private void shoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingActionPerformed
       //RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();
        if (idUserLog!=null){
            JIFrameVenda comunidade=new JIFrameVenda();
            jDPPrincipal.add(comunidade);
            comunidade.setVisible(true);
            try {comunidade.setMaximum(true);}
            catch (PropertyVetoException ex) {  }
        }else{
            adcMenuPrincipal();
        }
                    
    }//GEN-LAST:event_shoppingActionPerformed

    private void jogosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogosMouseExited
        Color padrao=new Color(21,30,51);
        jogos.setBackground(Color.WHITE);
        jogos.setForeground(padrao);
    }//GEN-LAST:event_jogosMouseExited

    private void jogosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogosMouseEntered
        Color padrao=new Color(21,30,51);
        jogos.setBackground(padrao);
        jogos.setForeground(Color.WHITE);
    }//GEN-LAST:event_jogosMouseEntered

    private void jogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogosActionPerformed
        try {
            DisplayHtml display=new DisplayHtml();         
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jogosActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
            
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String conteudoBusca=jTextField1.getText();
        //RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();  
        if (idUserLog!=null){//RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();
        JIFrameBusca frameBusca =new JIFrameBusca(conteudoBusca);
        jDPPrincipal.add(frameBusca);try {frameBusca.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
        frameBusca.setVisible(true);
        }else{
               adcMenuPrincipal();
        }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMarcaMouseClicked
        //RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();
        //Verificação de usuario logado...se estiver, então ele exibe internalFrame de Perfil e recebe o usuario que está logado, senão exibe mensagem com burro.
        if (idUserLog!=null){ Dados.Rank();
        //JIFramePerfil recebendo o ID de usuario logando
        jIFramePefil = new JIFrameUsuariosRede();
        //Add adicionando JIFramePerfil que foi criado ao JDesktioFrame(jDPPrincipal)          
        jDPPrincipal.add(jIFramePefil);       
        //tornando frame Perfil visivel ao usuario
        jIFramePefil.setVisible(true);
        //setMaximum para adaptar internalFrame/componentes do frame atividades ao DesktopFrame em dimensões(tamanho).
        try {jIFramePefil.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
        }else{
            //Caso o usuario tenha feito logoff:
               adcMenuPrincipal();
        } 
    }//GEN-LAST:event_jLabelMarcaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String conteudoBusca=jTextField1.getText();
        Atividade atividade=new Atividade(idUserLogando,conteudoBusca,Atividade.tipoMural.perfil);
        atividade.salvar();
        //RemoveAll - remove todos os componentes de dentro do DesktopFrame
        jDPPrincipal.removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        jDPPrincipal.repaint();                
        //JIFramePerfil recebendo o ID de usuario logando
        jIFramePefil = new JIFrameUsuariosRede();
        //Add adicionando JIFramePerfil que foi criado ao JDesktioFrame(jDPPrincipal)          
        jDPPrincipal.add(jIFramePefil);       
        //tornando frame Perfil visivel ao usuario
        jIFramePefil.setVisible(true);
        //setMaximum para adaptar internalFrame/componentes do frame atividades ao DesktopFrame em dimensões(tamanho).
        try {jIFramePefil.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
        
    }//GEN-LAST:event_jButton2ActionPerformed
        /**
        * @param args the command line arguments
        */
        public static void main(String args[]) {
        //Layout do windows
        try {  
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                //Torna a janela principal(JDesktopFrame) visivel ao usuario.                
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BVfoto;
    public static javax.swing.JLabel bemVindo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSair;
    private static javax.swing.JDesktopPane jDPPrincipal;
    private ProgramaColecionadores.JIFrameCadastroUser jIFrameCadastroUser1;
    private ProgramaColecionadores.JIFrameLogin jIFrameLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JPanel jPanelColecoes;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelMarca;
    private static javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelResto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jogos;
    private javax.swing.JButton shopping;
    private javax.swing.JPanel topo;
    // End of variables declaration//GEN-END:variables
        public static void VisitaPerfil(int idUser){
               JIFrameUsuariosRede jIFramePefil = new JIFrameUsuariosRede(idUser);
               jDPPrincipal.removeAll();
               jDPPrincipal.repaint();
               jDPPrincipal.add(jIFramePefil);
               jIFramePefil.setVisible(true);
               try {jIFramePefil.setMaximum(true);} 
               catch (PropertyVetoException ex) {  }
               if(Principal.getIdUserLogando()!=0){
                    Principal.setBemVindo();
               }
        }

        public static JDesktopPane getjDPPrincipal() {
            return jDPPrincipal;
        }
        
        public void adcMenuPrincipal(){
            jPanelMenu.setVisible(false);
            jDPPrincipal.add(jIFrameLogin1);
            jDPPrincipal.add(jIFrameCadastroUser1);
            jDPPrincipal.add(jLabel1);
        }
        
        public static void setBemVindo(){
        Usuario usuario=Dados.getUsuariosBD().get(idUserLog);        
        bemVindo.setText(usuario.getNome()+" "+usuario.getSobrenome());
        ImageIcon img01= new ImageIcon(Principal.class.getResource("/Images/Online.png"));
        ImageIcon img02=new ImageIcon(img01.getImage().getScaledInstance(BVfoto.getWidth(), BVfoto.getHeight(), Image.SCALE_SMOOTH));
        BVfoto.setIcon(img02);
        jPanelMenu.setVisible(true);
        npc();
        }
       public static void  atualizaInicial(){
            Principal.getjDPPrincipal().removeAll();
        //Repaint - faz a atualização do conteúdo(componentes) de dentro do DesktopFrame
        Principal.getjDPPrincipal().repaint();
           //JIFramePerfil recebendo o ID de usuario logando
           JIFrameUsuariosRede jIFramePefil = new JIFrameUsuariosRede();
        //Add adicionando JIFramePerfil que foi criado ao JDesktioFrame(jDPPrincipal)          
        Principal.getjDPPrincipal().add(jIFramePefil);       
        //tornando frame Perfil visivel ao usuario
        jIFramePefil.setVisible(true);
        //setMaximum para adaptar internalFrame/componentes do frame atividades ao DesktopFrame em dimensões(tamanho).
        try {jIFramePefil.setMaximum(true);} 
        catch (PropertyVetoException ex) {  }
        }

    private static void npc() {
        int delay = 3000;   // delay de 3 seg.
        int interval = 5000;  // intervalo de 5 seg.
       
       Timer timer = new Timer();
       //tela.atualizaTela();
       
       timer.scheduleAtFixedRate(new TimerTask() {
           int tempo = 1;
           private Image img;
           private String postMural;
           private Atividade atividade;
           public void run() {
                // colocar tarefas aqui ...
            if(idUserLogando==Dados.idPrimeiroLog){
                    Usuario leticia= new Usuario();
                    leticia = Dados.getUsuariosBD().get(1);
                    Usuario uri =Dados.getUsuariosBD().get(2);
                    switch(tempo){
                        case 1:
                             img=new ImageIcon(getClass().getResource("/Images/leticiabola.jpg")).getImage(); 
                             leticia.setFoto(img);                             
                             img=new ImageIcon(getClass().getResource("/Images/uri.jpg")).getImage(); 
                             uri.setFoto(img);
                             leticia.addAmigo(idUserLogando);
                        case 2:
                            if(leticia.getQuantidadeItensColecoes()<5){
                            Camiseta demo=new Camiseta(1,"linda");
                            img=new ImageIcon(getClass().getResource("/Jogo/cm01.jpg")).getImage(); 
                            demo.setFoto(img);
                            }break;
                        case 3:
                             if(uri.getQuantidadeItensColecoes()<5){   
                             Camiseta demo1=new Camiseta(2,"Fedida");
                             img=new ImageIcon(getClass().getResource("/Jogo/cm02.jpg")).getImage();demo1.setFoto(img);
                             img=new ImageIcon(getClass().getResource("/Jogo/moeda08.jpg")).getImage(); 
                             postMural="Eu tenho 1000 dessas!!";
                             atividade=new Atividade(2,postMural,img,Atividade.tipoMural.perfil);
                             atividade.salvar();
                             }
                             break;
                        case 4:
                             if(leticia.getQuantidadeItensColecoes()<5){
                             Camiseta demo2=new Camiseta(1,"Feio");
                             img=new ImageIcon(getClass().getResource("/Jogo/cm03.jpg")).getImage(); 
                             demo2.setFoto(img);
                             }break;
                        case 5:
                             if(uri.getQuantidadeItensColecoes()<5){
                             Camiseta demo3=new Camiseta(2,"lindw");
                             img=new ImageIcon(getClass().getResource("/Jogo/cm04.jpg")).getImage(); 
                             demo3.setFoto(img);}break;
                        case 6:
                             if(leticia.getQuantidadeItensColecoes()<5){
                             img=new ImageIcon(getClass().getResource("/Jogo/cm05.jpg")).getImage();
                             Camiseta demo4=new Camiseta(1,"linde");
                             demo4.setFoto(img);}
                            break;
                        case 7:
                             String teste="Bom dia!";
                             atividade=new Atividade(2,teste,Atividade.tipoMural.perfil);
                             atividade.salvar();break;
                        case 8:
                            uri.addAmigo(idUserLogando);
                            img=new ImageIcon(getClass().getResource("/Jogo/hq13.jpg")).getImage(); 
                            postMural="Tãnãnãnã tãnãnãnã ops musica errada!!";
                            atividade=new Atividade(2,postMural,img,Atividade.tipoMural.perfil);
                            atividade.setComentario(1, "retardado");
                            atividade.salvar();
                            break;
                        default:
                            break;
                    }tempo++;  
                     Dados.getAtividadesBD().get(sorteiaAtividade()).setLike();
               }    
             } 
        }, delay, interval);
    }
     private static int sorteiaAtividade(){
        int idAtividade=(int) (Math.random() *Dados.getAtividadesBD().size()-1);
        if(idAtividade<0){sorteiaAtividade();}
        return idAtividade;
     }   
}