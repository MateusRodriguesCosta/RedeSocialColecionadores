package ProgramaColecionadores;

import Jogo.Cartas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.File;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class JIFrameCamiseta extends javax.swing.JInternalFrame {
    private final Camiseta camiseta;
    int idUserLogando=Principal.getIdUserLogando();
    private Atividade atividade;
    private Atividade atividadeEditar;
    private final boolean visitante;
    private Image img;
       
    public JIFrameCamiseta() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        this.camiseta = new Camiseta();
        solicitarTroca.setEnabled(true);
        this.Editar.setVisible(false);//oculta o botão editar
        this.Salvar.setVisible(false);//oculta o botão salvar
        this.visitante=false;
        
        Iterator<String> time = Dados.getTimes().iterator();
            while(time.hasNext()){
                String nomesitens = time.next();
                
                this.jComboBoxTime.addItem(nomesitens);
            }
            Iterator<String> cor = Dados.getCores().iterator();
            while(cor.hasNext()){
                String nomesitens = cor.next();
                
                this.jComboBoxCor.addItem(nomesitens);
        }  Trocar.setVisible(false);
    }
    public JIFrameCamiseta(Camiseta camiseta) {
        this.idUserLogando=Principal.getIdUserLogando();
        this.visitante = idUserLogando!=camiseta.getIdUsuario();
        this.camiseta=camiseta;
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas  
        Iterator<String> time = Dados.getTimes().iterator();
            while(time.hasNext()){
                String nomesitens = time.next();
                
                this.jComboBoxTime.addItem(nomesitens);
            }
        Iterator<String> cor = Dados.getCores().iterator();
            while(cor.hasNext()){
                String nomesitens = cor.next();
                
                this.jComboBoxCor.addItem(nomesitens);
        }
        
        this.CadastrarCa.setVisible(false);
        if(Principal.getIdUserLogando()!=camiseta.getIdUsuario()){ this.Editar.setVisible(false);}
//dentro da classe camiseta
        this.jTextFieldNome.setText(camiseta.getNome());
        this.jTextFieldModelo.setText(camiseta.o1.getModelo());
        this.jComboBoxTime.setSelectedIndex(camiseta.getIdTime());
        this.jTextFieldTamanho.setText(camiseta.o1.getTamanho());
        this.jComboBoxCor.setSelectedIndex(camiseta.o1.getIdCor());
 //      camiseta.o1.setMarca(this.jComboBoxMarca.getSelectedItem().toString());
        //dentro da classe item
        if(camiseta.getFoto()!=null){ 
        jLabelFoto.setSize(221,188);
        jLabelFoto.setIcon(new ImageIcon(camiseta.getFoto().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT)));}
        this.jTextFieldEdicao.setText(camiseta.getEdicao());
        this.jComboBoxEstado.setSelectedItem(camiseta.getEstadoPreservacao());
        this.jTextFieldDescricao.setText(camiseta.getDescricao());
        this.jTextFieldFabricacao.setText(camiseta.getFabricacao());
        this.jTextFieldAquisicao.setText(camiseta.getAquisicao());
        this.jTextFieldVFabricacao1.setText(camiseta.getVFabricacao());        
        this.jTextFieldVAquisicao1.setText(camiseta.getVAquisicao());      
        this.jComboBoxPrivacidade.setSelectedIndex(camiseta.getPrivacidade());
        /////desativa edicao
        this.jComboBoxPrivacidade.setEnabled(false);
        this.jTextFieldNome.setEditable(false);
        this.jTextFieldModelo.setEditable(false);
        this.jComboBoxTime.setEnabled(false);
        this.jTextFieldTamanho.setEditable(false);
        this.jComboBoxCor.setEnabled(false);
 //      camiseta.o1.setMarca(this.jComboBoxMarca.getSelectedItem().toString());
        //dentro da classe item
        this.jTextFieldEdicao.setEditable(false);
        this.jComboBoxEstado.setEnabled(false);
        this.jTextFieldDescricao.setEditable(false);
        this.jTextFieldFabricacao.setEditable(false);
        this.jTextFieldAquisicao.setEditable(false);
        this.jTextFieldVFabricacao1.setEditable(false);
        this.jTextFieldVAquisicao1.setEditable(false);
        this.jComboBoxMarca.setEnabled(false);
        
        this.Salvar.setVisible(false);//oculta o botão salvar
        
        if(idUserLogando==camiseta.getIdUsuario()){ this.Trocar.setVisible(false); }
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTroca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbListarCamiseta = new javax.swing.JTable();
        solicitarTroca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jTextFieldEdicao = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldTamanho = new javax.swing.JTextField();
        jTextFieldFabricacao = new javax.swing.JFormattedTextField();
        jTextFieldAquisicao = new javax.swing.JFormattedTextField();
        jTextFieldVFabricacao1 = new javax.swing.JFormattedTextField();
        jTextFieldVAquisicao1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldDescricao = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBoxPrivacidade = new javax.swing.JComboBox();
        jComboBoxTime = new javax.swing.JComboBox();
        jComboBoxCor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        Editar = new javax.swing.JLabel();
        Trocar = new javax.swing.JLabel();
        Salvar = new javax.swing.JLabel();
        CadastrarCa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanelTroca.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 3));

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
        jtbListarCamiseta.setMaximumSize(new java.awt.Dimension(225, 0));
        jScrollPane2.setViewportView(jtbListarCamiseta);

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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha um item seu para oferecer na troca");

        javax.swing.GroupLayout jPanelTrocaLayout = new javax.swing.GroupLayout(jPanelTroca);
        jPanelTroca.setLayout(jPanelTrocaLayout);
        jPanelTrocaLayout.setHorizontalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(jPanelTrocaLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(solicitarTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTrocaLayout.setVerticalGroup(
            jPanelTrocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrocaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(solicitarTroca)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMinimumSize(null);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 5));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Marca");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Modelo");

        jTextFieldModelo.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });

        jTextFieldNome.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Time");

        jComboBoxMarca.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jComboBoxMarca.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Cor");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Data de fabricação");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Data de aquisição");

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Valor (Aquisição)");

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Valor (Fabricação)");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Estado de preservação");

        jComboBoxEstado.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jComboBoxEstado.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Novo", "Usado", "Precário" }));
        jComboBoxEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldEdicao.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdicaoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Edição");

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Descrição");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Tamanho");

        jTextFieldTamanho.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTamanhoActionPerformed(evt);
            }
        });

        try {
            jTextFieldFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldFabricacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFabricacao.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFabricacaoActionPerformed(evt);
            }
        });

        try {
            jTextFieldAquisicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldAquisicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAquisicao.setSelectionColor(new java.awt.Color(21, 30, 51));

        jTextFieldVFabricacao1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jTextFieldVFabricacao1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldVFabricacao1.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldVFabricacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVFabricacao1ActionPerformed(evt);
            }
        });

        jTextFieldVAquisicao1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jTextFieldVAquisicao1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldVAquisicao1.setSelectionColor(new java.awt.Color(21, 30, 51));
        jTextFieldVAquisicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVAquisicao1ActionPerformed(evt);
            }
        });

        jTextFieldDescricao.setColumns(20);
        jTextFieldDescricao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextFieldDescricao.setLineWrap(true);
        jTextFieldDescricao.setRows(5);
        jTextFieldDescricao.setWrapStyleWord(true);
        jTextFieldDescricao.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane1.setViewportView(jTextFieldDescricao);

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("R$");

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("R$");

        jComboBoxPrivacidade.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jComboBoxPrivacidade.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxPrivacidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Público", "Amigos", "Privado" }));
        jComboBoxPrivacidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxTime.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jComboBoxTime.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTimeActionPerformed(evt);
            }
        });

        jComboBoxCor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jComboBoxCor.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(21, 30, 51));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 30, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Camiseta");

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Privacidade");

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enari - imagem(item).png"))); // NOI18N
        jLabelFoto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 30, 51), 2));
        jLabelFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Foto da camiseta");

        Voltar.setBackground(new java.awt.Color(21, 30, 51));
        Voltar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Voltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Voltar.setText("Cadastradas");
        Voltar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.setOpaque(true);
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarMouseExited(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(21, 30, 51));
        Editar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Editar.setText("Editar");
        Editar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Editar.setOpaque(true);
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditarMouseExited(evt);
            }
        });

        Trocar.setBackground(new java.awt.Color(21, 30, 51));
        Trocar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Trocar.setForeground(new java.awt.Color(255, 255, 255));
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

        Salvar.setBackground(new java.awt.Color(21, 30, 51));
        Salvar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Salvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salvar.setText("Salvar");
        Salvar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salvar.setOpaque(true);
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalvarMouseExited(evt);
            }
        });

        CadastrarCa.setBackground(new java.awt.Color(21, 30, 51));
        CadastrarCa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        CadastrarCa.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastrarCa.setText("Cadastrar camiseta");
        CadastrarCa.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CadastrarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarCa.setOpaque(true);
        CadastrarCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarCaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CadastrarCaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CadastrarCaMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(21, 30, 51));
        jSeparator1.setForeground(new java.awt.Color(21, 30, 51));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBoxCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxTime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldTamanho)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBoxPrivacidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldEdicao, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Trocar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CadastrarCa))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldVFabricacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextFieldFabricacao, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(jLabel25)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldVAquisicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldAquisicao))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(20, 20, 20))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPrivacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldVFabricacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jTextFieldVAquisicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel22)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel24)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Trocar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarCa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, "card2");

        getContentPane().add(jPanel7, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jTextFieldEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdicaoActionPerformed

    private void jTextFieldTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTamanhoActionPerformed

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        // TODO add your handling code here:
        String caminho;
        JFileChooser arquivo = new JFileChooser();//INSTANCIA O SELECIONADOR
        File diretorio = new File("C:\\Users\\aluno\\Pictures");//NOVO CODIGO PARA DEFINIR PASTA RAIZ DO FILE CHOOSER
        arquivo.setCurrentDirectory(diretorio);
        arquivo.showOpenDialog(null);
        jLabelFoto.setSize(221,188);
        caminho = arquivo.getSelectedFile().getAbsolutePath(); //VARIAVEL CAMINHO RECEBE O ENDEREÇO DA IMAGEM
        img = new ImageIcon(caminho).getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT);//NOVO COD PARA DEFINIR TAMANHO UNICO DE IMAGENS
        jLabelFoto.setIcon(new ImageIcon(img)); //LBIMAGEM RECEBERA A IMAGEM        // TODO add your handling code here:
        if(visitante==true){} else {
            camiseta.setFoto(img.getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
        }
    }//GEN-LAST:event_jLabelFotoMouseClicked

    private void jComboBoxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTimeActionPerformed
       if(this.jComboBoxTime.getSelectedIndex()==1){
           String novoTime=JOptionPane.showInputDialog("Qual é o time?").toUpperCase();
           Dados.getTimes().add(novoTime);
           jComboBoxTime.removeAllItems();
           Iterator<String> time = Dados.getTimes().iterator();
            while(time.hasNext()){
                String nomesitens = time.next();
                
                this.jComboBoxTime.addItem(nomesitens);
            }
       }
       
    }//GEN-LAST:event_jComboBoxTimeActionPerformed

    private void jComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorActionPerformed
             if(this.jComboBoxCor.getSelectedIndex()==1){
           String novaCor=JOptionPane.showInputDialog("Qual é a Cor?").toUpperCase();
           Dados.getCores().add(novaCor);
           jComboBoxCor.removeAllItems();
           Iterator<String> cor = Dados.getCores().iterator();
            while(cor.hasNext()){
                String nomesitens = cor.next();
                
                this.jComboBoxCor.addItem(nomesitens);
            }
       }
     
    }//GEN-LAST:event_jComboBoxCorActionPerformed

    private void solicitarTrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarTrocaActionPerformed
     if (jtbListarCamiseta.getSelectedRow() == -1) {
     JOptionPane.showMessageDialog(this, "Nenhuma camiseta selecionada.");}
     Integer idCamiseta = (Integer) jtbListarCamiseta.getValueAt(jtbListarCamiseta.getSelectedRow(), 0);
     Troca troca=new Troca(idUserLogando,camiseta.getIdUsuario(),1,(Item)Dados.getCamisetasBD().get(idCamiseta),(Item)camiseta);
     solicitarTroca.setText("Troca solicitada !");
     solicitarTroca.setEnabled(false);
     solicitarTroca.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_solicitarTrocaActionPerformed

    private void jTextFieldVFabricacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVFabricacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVFabricacao1ActionPerformed

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        JIFrameListarCamiseta jIFrameListarCamiseta = new JIFrameListarCamiseta(idUserLogando);
        jIFrameListarCamiseta.idUserLogando=Principal.getIdUserLogando();
        this.getDesktopPane().add(jIFrameListarCamiseta);
        jIFrameListarCamiseta.setVisible(true);
        try {jIFrameListarCamiseta.setMaximum(true);
         } catch (PropertyVetoException ex) {  }
        this.doDefaultCloseAction();//fim atual
    }//GEN-LAST:event_VoltarMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        atividadeEditar=new Atividade(camiseta.getIdItem(),1, idUserLogando, 3, "Editou","CAMISETA");
        atividadeEditar.lstItem.add((Item) Dados.getCamisetasBD().get(atividadeEditar.getIdItem()).clone());
        atividadeEditar.salvar();
        this.Salvar.setVisible(true);//oculta o botão salvar
        //////habilita a edicao dos campos
        this.jTextFieldNome.setEditable(true);
        this.jTextFieldModelo.setEditable(true);
        this.jComboBoxTime.setEnabled(true);
        this.jTextFieldTamanho.setEditable(true);
        this.jComboBoxCor.setEnabled(true);
        //      camiseta.o1.setMarca(this.jComboBoxMarca.getSelectedItem().toString());
        //dentro da classe item
        this.jTextFieldEdicao.setEditable(true);
        this.jComboBoxEstado.setEnabled(true);
        this.jTextFieldDescricao.setEditable(true);
        this.jTextFieldFabricacao.setEditable(true);
        this.jTextFieldAquisicao.setEditable(true);
        this.jTextFieldVFabricacao1.setEditable(true);
        this.jTextFieldVAquisicao1.setEditable(true);
        this.jComboBoxPrivacidade.setEnabled(true);
        this.jComboBoxMarca.setEnabled(true);
    }//GEN-LAST:event_EditarMouseClicked

    private void TrocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseClicked
        listarCarmiseta();
        JOptionPane.showMessageDialog(null,jPanelTroca);
    }//GEN-LAST:event_TrocarMouseClicked

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        //dentro da classe camiseta
        Camiseta novaCamiseta=Dados.getCamisetasBD().get(atividadeEditar.getIdItem());

        novaCamiseta.setPrivacidade(this.jComboBoxPrivacidade.getSelectedIndex());
        novaCamiseta.setNome(this.jTextFieldNome.getText());
        novaCamiseta.o1.setModelo(this.jTextFieldModelo.getText());
        novaCamiseta.setIdTime(this.jComboBoxTime.getSelectedIndex());
        novaCamiseta.o1.setTamanho(this.jTextFieldTamanho.getText());
        novaCamiseta.o1.setIdCor(this.jComboBoxCor.getSelectedIndex());
        //dentro da classe item
        novaCamiseta.setEdicao(this.jTextFieldEdicao.getText());
        novaCamiseta.setEstadoPreservacao(this.jComboBoxEstado.getSelectedItem().toString());
        novaCamiseta.setDescricao(this.jTextFieldDescricao.getText());
        novaCamiseta.setFabricacao(this.jTextFieldFabricacao.getText());
        novaCamiseta.setAquisicao(this.jTextFieldAquisicao.getText());
        novaCamiseta.setVFabricacao(jTextFieldVFabricacao1.getText());
        novaCamiseta.setVAquisicao(jTextFieldVAquisicao1.getText());
        novaCamiseta.setFoto(img);
        //armazena o id do item
      
        atividadeEditar.add(novaCamiseta);//adiciona nova versao de camiseta
        atividadeEditar.bloquearAtividades(idUserLogando);
        //cria tela com lista de camiseta
        JIFrameListarCamiseta jIFrameListarCamiseta = new JIFrameListarCamiseta(idUserLogando);
        jIFrameListarCamiseta.idUserLogando=Principal.getIdUserLogando();
        this.getDesktopPane().add(jIFrameListarCamiseta);
        jIFrameListarCamiseta.setVisible(true);
        try {jIFrameListarCamiseta.setMaximum(true);
         } catch (PropertyVetoException ex) {  }
        this.doDefaultCloseAction();//fim atual
    }//GEN-LAST:event_SalvarMouseClicked

    private void CadastrarCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarCaMouseClicked
        addCamiseta();        
    }//GEN-LAST:event_CadastrarCaMouseClicked

    private void VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseEntered
        Voltar.setOpaque(true);
        Voltar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_VoltarMouseEntered

    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited
        Color padrao=new Color(21,30,51);
        Voltar.setBackground(padrao);
    }//GEN-LAST:event_VoltarMouseExited

    private void EditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseEntered
        Editar.setOpaque(true);
        Editar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_EditarMouseEntered

    private void EditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseExited
        Color padrao=new Color(21,30,51);
        Editar.setBackground(padrao);
    }//GEN-LAST:event_EditarMouseExited

    private void TrocarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseEntered
        Trocar.setOpaque(true);
        Trocar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_TrocarMouseEntered

    private void TrocarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocarMouseExited
        Color padrao=new Color(21,30,51);
        Trocar.setBackground(padrao);
    }//GEN-LAST:event_TrocarMouseExited

    private void SalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseEntered
        Salvar.setOpaque(true);
        Salvar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_SalvarMouseEntered

    private void SalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseExited
        Color padrao=new Color(21,30,51);
        Salvar.setBackground(padrao);
    }//GEN-LAST:event_SalvarMouseExited

    private void CadastrarCaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarCaMouseEntered
        CadastrarCa.setOpaque(true);
        CadastrarCa.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_CadastrarCaMouseEntered

    private void CadastrarCaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarCaMouseExited
        Color padrao=new Color(21,30,51);
        CadastrarCa.setBackground(padrao);
    }//GEN-LAST:event_CadastrarCaMouseExited

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

    private void jTextFieldFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFabricacaoActionPerformed

    private void jTextFieldVAquisicao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVAquisicao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVAquisicao1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CadastrarCa;
    private javax.swing.JLabel Editar;
    private javax.swing.JLabel Salvar;
    private javax.swing.JLabel Trocar;
    private javax.swing.JLabel Voltar;
    private javax.swing.JComboBox jComboBoxCor;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxMarca;
    private javax.swing.JComboBox jComboBoxPrivacidade;
    private javax.swing.JComboBox jComboBoxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private static javax.swing.JPanel jPanelTroca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField jTextFieldAquisicao;
    private javax.swing.JTextArea jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEdicao;
    private javax.swing.JFormattedTextField jTextFieldFabricacao;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTamanho;
    private javax.swing.JFormattedTextField jTextFieldVAquisicao1;
    private javax.swing.JFormattedTextField jTextFieldVFabricacao1;
    private javax.swing.JTable jtbListarCamiseta;
    private javax.swing.JButton solicitarTroca;
    // End of variables declaration//GEN-END:variables
   
    public void addCamiseta(){
        String NOME = jTextFieldNome.getText();
       // Camiseta CAMISETA = new Camiseta();
        boolean existeCamiseta=false;
        for (int i = 0; i < Dados.getCamisetasBD().size(); i++) {//percorre a lista de usuarios "lst"
                Camiseta CAMISETA = Dados.getCamisetasBD().get(i);//paga o objeto da posição "i" e armazena no objeto "usuario" do tipo "Usuario"
            if (NOME.equals(CAMISETA.getNome())){
                jLabel8.setText("Camiseta já cadastrada");
                existeCamiseta=true;
            break;}
            
        }
        if(!existeCamiseta){    
        //definindo de quem é a camiseta
        camiseta.setIdUsuario(idUserLogando);
        //dentro da classe camiseta
        camiseta.setNome(this.jTextFieldNome.getText());
        
        camiseta.o1.setModelo(this.jTextFieldModelo.getText());
        camiseta.setIdTime(this.jComboBoxTime.getSelectedIndex());
        camiseta.o1.setTamanho(this.jTextFieldTamanho.getText());
        camiseta.o1.setIdCor(this.jComboBoxCor.getSelectedIndex());
        //Dentro da classe item
        camiseta.setPrivacidade(this.jComboBoxPrivacidade.getSelectedIndex());
        camiseta.setEdicao(this.jTextFieldEdicao.getText());
        camiseta.setEstadoPreservacao(this.jComboBoxEstado.getSelectedItem().toString());
        camiseta.setDescricao(this.jTextFieldDescricao.getText());
        camiseta.setFabricacao(this.jTextFieldFabricacao.getText());
        camiseta.setAquisicao(this.jTextFieldAquisicao.getText());
        camiseta.setVFabricacao(jTextFieldVFabricacao1.getText());
        camiseta.setVAquisicao(jTextFieldVAquisicao1.getText());    
        camiseta.setFoto(this.img);
        camiseta.salvar();//metodo que armazena a nova camiseta na lista de camisetas
         //add carta baralho 
        
        int idCarta=(int) (Math.random() *Cartas.getCamisetas().size()-1);
        if(idCarta<0){idCarta=0;}
        Dados.getUsuariosBD().get(idUserLogando).setCartaCamiseta(idCarta);
        //
        atividade=new Atividade(camiseta.getIdItem(),1, idUserLogando, 1, "Adicionou","CAMISETA");
        atividade.salvar();//metodo que salva a nova atividade na lista de atividades
        atividade.bloquearAtividades(idUserLogando);
        
        JIFrameListarCamiseta jIFrameListarCamiseta = new JIFrameListarCamiseta(idUserLogando);
        jIFrameListarCamiseta.idUserLogando=Principal.getIdUserLogando();
        this.getDesktopPane().add(jIFrameListarCamiseta);
        jIFrameListarCamiseta.setVisible(true);
        try {jIFrameListarCamiseta.setMaximum(true);
         } catch (PropertyVetoException ex) {  }
        
        this.doDefaultCloseAction();//fim atual
        Principal.atualizaInicial();
        }
}
    private void listarCarmiseta() {
        DefaultTableModel dtm = (DefaultTableModel) jtbListarCamiseta.getModel();
        dtm.setNumRows(0);
        
        for (Camiseta camisetas : Dados.getUsuariosBD().get(idUserLogando).getColecaoCamiseta()) {
               dtm.addRow(new Object[]{camisetas.getIdItem(),camisetas.getNome(), Dados.getTimes().get(camisetas.getIdTime())});
        }
    }
     
}
