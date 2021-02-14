package ProgramaColecionadores;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Casa
 */
public class JPanelTroca extends javax.swing.JPanel {
        int idUserLogando;
        Troca troca;
        /**
        * Creates new form JPanelTroca
        */
        public JPanelTroca(Troca troca) {
            this.idUserLogando = Principal.getIdUserLogando();
            this.troca=troca;
            initComponents();
            this.jLabelEstado.setText(troca.getEstadoTroca());
            jLabelNomeCriador.setText(troca.getUserCriador().getNome());  
            jLabelNomeItemInteresse.setText(troca.getItemDesejado().getNome());
            jLabelNomeItemOfertado.setText(troca.getItemOferta().getNome());
        
            iconeFoto.setSize(160,120);
            ImageIcon img=new ImageIcon(getClass().getResource("/Images/Icone_Troca.png"));
            iconeFoto.setIcon(new ImageIcon(img.getImage().getScaledInstance(iconeFoto.getWidth(), iconeFoto.getHeight(), Image.SCALE_SMOOTH)));                
        
            if(troca.getIdEstadoTroca()==2){
               ImageIcon img02=new ImageIcon(getClass().getResource("/Images/Icone_Troca_Aceita.png"));
               iconeFoto.setIcon(new ImageIcon(img02.getImage().getScaledInstance(iconeFoto.getWidth(), iconeFoto.getHeight(), Image.SCALE_SMOOTH)));                    
            }
            if(troca.getIdEstadoTroca()==0){
                ImageIcon img01=new ImageIcon(getClass().getResource("/Images/Icone_Troca_Recusada.png"));
                iconeFoto.setIcon(new ImageIcon(img01.getImage().getScaledInstance(iconeFoto.getWidth(), iconeFoto.getHeight(), Image.SCALE_SMOOTH)));                
            }
            int estadoTroca=troca.getIdEstadoMeuItem(idUserLogando);
            if(estadoTroca==0){
               this.jButtonAceitar.setVisible(true);               
            }else{
            this.jButtonAceitar.setVisible(false);            
            }
            if(troca.getIdEstadoTroca()==0||troca.getIdEstadoTroca()==1||troca.getIdEstadoTroca()==2){
            this.jButtonCancelar.setVisible(true);
            }else{
            this.jButtonCancelar.setVisible(false);
            }
            if((troca.getIdEstadoAmigo(idUserLogando)==2||
                troca.getIdEstadoAmigo(idUserLogando)==3)&&
                troca.getIdEstadoMeuItem(idUserLogando)!=3){
            this.jButtonRecebido.setVisible(true);
            }else{
            this.jButtonRecebido.setVisible(false);
            }
            if((troca.getIdEstadoAmigo(idUserLogando)==1||
                troca.getIdEstadoAmigo(idUserLogando)==2)&&
                troca.getIdEstadoMeuItem(idUserLogando)!=2){
            this.jButtonEnviado.setVisible(true);
            }else{
            this.jButtonEnviado.setVisible(false);
            }
            if(troca.getItemOferta().getFoto()!=null){
            ofereceuFoto.setSize(67,69);
            ofereceuFoto.setIcon(new ImageIcon(troca.getItemOferta().getFoto().getScaledInstance(ofereceuFoto.getWidth(), ofereceuFoto.getHeight(), Image.SCALE_DEFAULT)));
            }else{
            ofereceuFoto.setSize(67,69);
            }
            if(troca.getItemDesejado().getFoto()!=null){
            porFoto.setSize(67,69);
            porFoto.setIcon(new ImageIcon(troca.getItemDesejado().getFoto().getScaledInstance(porFoto.getWidth(), porFoto.getHeight(), Image.SCALE_DEFAULT)));
            }else{
            ofereceuFoto.setSize(67,69);
            }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelNomeCriador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNomeItemOfertado = new javax.swing.JLabel();
        ofereceuFoto = new javax.swing.JLabel();
        jButtonItemOferta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        porFoto = new javax.swing.JLabel();
        jLabelNomeItemInteresse = new javax.swing.JLabel();
        jButtonItemInteresse = new javax.swing.JButton();
        jButtonAceitar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEnviado = new javax.swing.JButton();
        jButtonRecebido = new javax.swing.JButton();
        iconeFoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(476, 298));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabelNomeCriador.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNomeCriador.setText("Nome Usuário");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Criou Troca");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Ofereceu");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 30, 51)));

        jLabelNomeItemOfertado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNomeItemOfertado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeItemOfertado.setText("Nome Item");

        ofereceuFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ofereceuFoto.setText("Foto");

        jButtonItemOferta.setBackground(new java.awt.Color(21, 30, 51));
        jButtonItemOferta.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonItemOferta.setForeground(java.awt.SystemColor.control);
        jButtonItemOferta.setText("Ver Item");
        jButtonItemOferta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonItemOferta.setContentAreaFilled(false);
        jButtonItemOferta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonItemOferta.setOpaque(true);
        jButtonItemOferta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonItemOfertaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonItemOfertaMouseExited(evt);
            }
        });
        jButtonItemOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonItemOfertaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Por");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 30, 51)));

        porFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        porFoto.setText("Foto");

        jLabelNomeItemInteresse.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNomeItemInteresse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeItemInteresse.setText("Nome Item");

        jButtonItemInteresse.setBackground(new java.awt.Color(21, 30, 51));
        jButtonItemInteresse.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonItemInteresse.setForeground(java.awt.SystemColor.control);
        jButtonItemInteresse.setText("Ver Item");
        jButtonItemInteresse.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonItemInteresse.setContentAreaFilled(false);
        jButtonItemInteresse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonItemInteresse.setOpaque(true);
        jButtonItemInteresse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonItemInteresseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonItemInteresseMouseExited(evt);
            }
        });
        jButtonItemInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonItemInteresseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelNomeCriador, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ofereceuFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeItemOfertado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonItemOferta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(porFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeItemInteresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonItemInteresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeCriador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelNomeItemOfertado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonItemOferta))
                    .addComponent(ofereceuFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelNomeItemInteresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonItemInteresse)))
                .addContainerGap())
        );

        jButtonAceitar.setBackground(new java.awt.Color(21, 30, 51));
        jButtonAceitar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonAceitar.setForeground(java.awt.SystemColor.control);
        jButtonAceitar.setText("Aceitar");
        jButtonAceitar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonAceitar.setContentAreaFilled(false);
        jButtonAceitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceitar.setOpaque(true);
        jButtonAceitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAceitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAceitarMouseExited(evt);
            }
        });
        jButtonAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceitarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado da Troca");

        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado.setText("Estado");
        jLabelEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setBackground(new java.awt.Color(21, 30, 51));
        jButtonCancelar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonCancelar.setForeground(java.awt.SystemColor.control);
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setOpaque(true);
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseExited(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEnviado.setBackground(new java.awt.Color(21, 30, 51));
        jButtonEnviado.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonEnviado.setForeground(java.awt.SystemColor.control);
        jButtonEnviado.setText("Enviado");
        jButtonEnviado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonEnviado.setContentAreaFilled(false);
        jButtonEnviado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviado.setOpaque(true);
        jButtonEnviado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviadoMouseExited(evt);
            }
        });
        jButtonEnviado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviadoActionPerformed(evt);
            }
        });

        jButtonRecebido.setBackground(new java.awt.Color(21, 30, 51));
        jButtonRecebido.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonRecebido.setForeground(java.awt.SystemColor.control);
        jButtonRecebido.setText("Recebido");
        jButtonRecebido.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonRecebido.setContentAreaFilled(false);
        jButtonRecebido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRecebido.setOpaque(true);
        jButtonRecebido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRecebidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRecebidoMouseExited(evt);
            }
        });
        jButtonRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecebidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAceitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonRecebido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEnviado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(iconeFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEstado)
                        .addGap(9, 9, 9)
                        .addComponent(iconeFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRecebido)
                            .addComponent(jButtonEnviado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAceitar)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecebidoActionPerformed
       troca.setItemRecebido(idUserLogando);
    }//GEN-LAST:event_jButtonRecebidoActionPerformed

    private void jButtonEnviadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviadoActionPerformed
       troca.setItemEnviado(idUserLogando);
    }//GEN-LAST:event_jButtonEnviadoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        troca.setTrocaCancelada();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceitarActionPerformed
        troca.setTrocaAceita();
    }//GEN-LAST:event_jButtonAceitarActionPerformed

    private void jButtonItemOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonItemOfertaActionPerformed
      int idTipoColecaoItem=troca.getIdTipoColecao(); 
      JInternalFrame f;
      ExibeItemColecao e;
      switch (idTipoColecaoItem){
          case 1:
          f = new JIFrameCamiseta((Camiseta) troca.getItemOferta());
          e = new ExibeItemColecao(f);
              break;
          case 2:
          f = new JIFrameCartao((Cartao) troca.getItemOferta());
          e = new ExibeItemColecao(f);
              break;
          case 3:
          f = new JIFrameJogo((Jogo) troca.getItemOferta());
          e = new ExibeItemColecao(f);
              break;
          case 4:
          f = new JIFrameMoeda((Moeda) troca.getItemOferta());
          e = new ExibeItemColecao(f);
              break;
          case 5:
          f = new JIFrameQuadrinho((Quadrinho)troca.getItemOferta());
          e = new ExibeItemColecao(f);
          default:
          f = new JIFramehWheels((hWheels) troca.getItemOferta());
          e=new ExibeItemColecao(f);
              break;
    }
    }//GEN-LAST:event_jButtonItemOfertaActionPerformed

    private void jButtonItemInteresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonItemInteresseActionPerformed
        int idTipoColecaoItem=troca.getIdTipoColecao(); 
        JInternalFrame f;
        ExibeItemColecao e;
        switch (idTipoColecaoItem){
          case 1:
          f = new JIFrameCamiseta((Camiseta) troca.getItemDesejado());
          e = new ExibeItemColecao(f);
              break;
          case 2:
          f = new JIFrameCartao((Cartao) troca.getItemDesejado());
          e = new ExibeItemColecao(f);
              break;
          case 3:
          f = new JIFrameJogo((Jogo) troca.getItemDesejado());
          e = new ExibeItemColecao(f);
              break;
          case 4:
          f = new JIFrameMoeda((Moeda) troca.getItemDesejado());
          e = new ExibeItemColecao(f);
              break;
          case 5:
          f = new JIFrameQuadrinho((Quadrinho)troca.getItemDesejado());
          e = new ExibeItemColecao(f); 
          default:
          f = new JIFramehWheels((hWheels) troca.getItemDesejado());
          e=new ExibeItemColecao(f);
              break;
    }      
    }//GEN-LAST:event_jButtonItemInteresseActionPerformed

    private void jButtonItemOfertaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonItemOfertaMouseEntered
        jButtonItemOferta.setOpaque(true);
        jButtonItemOferta.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonItemOfertaMouseEntered

    private void jButtonItemOfertaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonItemOfertaMouseExited
        Color padrao=new Color(21,30,51);
        jButtonItemOferta.setBackground(padrao);
    }//GEN-LAST:event_jButtonItemOfertaMouseExited

    private void jButtonItemInteresseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonItemInteresseMouseEntered
        jButtonItemInteresse.setOpaque(true);
        jButtonItemInteresse.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonItemInteresseMouseEntered

    private void jButtonItemInteresseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonItemInteresseMouseExited
        Color padrao=new Color(21,30,51);
        jButtonItemInteresse.setBackground(padrao);
    }//GEN-LAST:event_jButtonItemInteresseMouseExited

    private void jButtonRecebidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecebidoMouseEntered
        jButtonRecebido.setOpaque(true);
        jButtonRecebido.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonRecebidoMouseEntered

    private void jButtonRecebidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecebidoMouseExited
        Color padrao=new Color(21,30,51);
        jButtonRecebido.setBackground(padrao);
    }//GEN-LAST:event_jButtonRecebidoMouseExited

    private void jButtonEnviadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviadoMouseEntered
        jButtonEnviado.setOpaque(true);
        jButtonEnviado.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonEnviadoMouseEntered

    private void jButtonEnviadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviadoMouseExited
        Color padrao=new Color(21,30,51);
        jButtonEnviado.setBackground(padrao);
    }//GEN-LAST:event_jButtonEnviadoMouseExited

    private void jButtonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseEntered
        jButtonCancelar.setOpaque(true);
        jButtonCancelar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonCancelarMouseEntered

    private void jButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseExited
        Color padrao=new Color(21,30,51);
        jButtonCancelar.setBackground(padrao);
    }//GEN-LAST:event_jButtonCancelarMouseExited

    private void jButtonAceitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceitarMouseEntered
        jButtonAceitar.setOpaque(true);
        jButtonAceitar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_jButtonAceitarMouseEntered

    private void jButtonAceitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceitarMouseExited
        Color padrao=new Color(21,30,51);
        jButtonAceitar.setBackground(padrao);
    }//GEN-LAST:event_jButtonAceitarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconeFoto;
    private javax.swing.JButton jButtonAceitar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEnviado;
    private javax.swing.JButton jButtonItemInteresse;
    private javax.swing.JButton jButtonItemOferta;
    private javax.swing.JButton jButtonRecebido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNomeCriador;
    private javax.swing.JLabel jLabelNomeItemInteresse;
    private javax.swing.JLabel jLabelNomeItemOfertado;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel ofereceuFoto;
    private javax.swing.JLabel porFoto;
    // End of variables declaration//GEN-END:variables
}
