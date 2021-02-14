package ProgramaColecionadores;

import static ProgramaColecionadores.JIFramePerfil.idUsuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Casa
 */
public class ExibicaoItemAtividade extends javax.swing.JPanel {
    private Atividade atividade;
    private Integer idUserLogando=Principal.getIdUserLogando();
    
    
        public ExibicaoItemAtividade(Atividade atividade) {
        initComponents();
        ////EXIBINDO ATIVIDADE 1///////////////
        this.atividade=atividade;
        jLabelFotoItem.setSize(87, 81);
        if (atividade.getItem()!=null&&atividade.getItem().getFoto()!=null){
               jLabelFotoItem.setSize(87, 81);
               this.jLabelFotoItem.setIcon(new ImageIcon(atividade.getItem().getFoto().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)));}
        else if(atividade.idTipoColecaoItem==1){            
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/camisa_default.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
               }
        else if(atividade.idTipoColecaoItem==2){             
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/cartao_default.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
        }
        else if(atividade.idTipoColecaoItem==3){             
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/jogo_default.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
        }
        else if(atividade.idTipoColecaoItem==4){             
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/moeda_default.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
        }
        else if(atividade.idTipoColecaoItem==5){             
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/quadrinho_default.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
        }
        else if(atividade.idTipoColecaoItem==6){            
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/hotwheels_default.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
        }
        //se é atividade de NOVO usuario
        else if(atividade.idTipoAtividade==0){
               ImageIcon imgPath =new ImageIcon(getClass().getResource("/Images/Pin.png"));
               ImageIcon imgResized=new ImageIcon(imgPath.getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)) {};
               this.jLabelFotoItem.setIcon(imgResized);
        }
        //se é atividade de NOVO usuario        
        if(atividade.idTipoAtividade==0){
               this.jLabelFotoItem.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/New_user.png")).getImage().getScaledInstance(jLabelFotoItem.getWidth(), jLabelFotoItem.getHeight(), Image.SCALE_SMOOTH)));
               if(atividade.getTipoMural()!=null){               
                      this.Exibir.show(false);
                      jLabelFotoItem.show(false);
                      if(atividade.getFoto()==null){
                             this.jLabelImagemPost.setVisible(false);                    
                      }
                
        if(atividade.getFoto()!=null){
               jLabelImagemPost.setSize(523,300);
               jLabelImagemPost.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
               this.jLabelImagemPost.setIcon(new ImageIcon(atividade.getFoto().getScaledInstance(jLabelImagemPost.getWidth(),jLabelImagemPost.getHeight(), Image.SCALE_SMOOTH)));}   
               if((atividade.getTextoPostagem()==null)||(atividade.getTextoPostagem().equals(""))){
                      this.jTextCoonteudoPost.setVisible(false);                      
               }else{
                      this.jTextCoonteudoPost.setText("     "+atividade.getTextoPostagem());}
               }else{
                      jLabelFotoItem.setVisible(true);
                      this.jTextCoonteudoPost.setVisible(false);
                      jLabelImagemPost.setVisible(false);}
        }
        
        this.jButtonLike.setText("  "+this.atividade.getLike()+" ");
        Enviar.addMouseListener(new MouseAdapter() {///apaga o texto da caixa
               public void mouseClicked(MouseEvent arg0) {jTextComentario1.setText("");}
               });   
        String comentarios ="";
        for(Comentario c:atividade.getComentarios()){
        comentarios+="Usuario:"+Dados.getUsuariosBD().get(c.getIdUsuario()).getNomeUsuario()+
                  " - "+c.getConteudo()+"\n";
        }
        this.jTextComentario.setText(comentarios);
        jLabelIconeAtividade.setIcon(getIconeAtividade(atividade.getIdTipoAtividade()));
        jLabelNomeUsuario.setText(Dados.getUsuariosBD().get(atividade.getIdUsuario()).getNome()
                    +"  "+atividade.getTipoAcao()
                    +"  "+atividade.getNomeObjeto()
                    +"   "+atividade.getData().toString());    
        this.iconUser.setIdUser(atividade.getIdUsuario());
        this.iconUser.updateUI();    
        }
        private ImageIcon getIconeAtividade(int tipo){
        if (tipo==1){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/iconAdd.png"));        
            return Icon;
        }else
        if (tipo==2){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/iconRemove.png"));
            return Icon;
        }else
        if (tipo==3){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/iconEditar.png"));
            return Icon;
        }else
        if (tipo==41||tipo==42||tipo==43){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/iconUndo.png"));
            return Icon;
        }else
        if (tipo==51||tipo==52||tipo==53){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/iconRedo.png"));
            return Icon;
        }else{        
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/erro.png"));
     
        return Icon;}
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelAtividade = new javax.swing.JPanel();
        jLabelIconeAtividade = new javax.swing.JLabel();
        jLabelFotoItem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextComentario = new javax.swing.JTextArea();
        jButtonLike = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextComentario1 = new javax.swing.JTextArea();
        Exibir = new javax.swing.JLabel();
        Enviar = new javax.swing.JLabel();
        iconUser = new view.IconUser();
        jTextCoonteudoPost = new javax.swing.JLabel();
        jLabelImagemPost = new javax.swing.JLabel();
        views = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 10, 10, new java.awt.Color(255, 255, 255)));

        jPanelAtividade.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtividade.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(213, 213, 213)));
        jPanelAtividade.setForeground(new java.awt.Color(21, 30, 51));
        jPanelAtividade.setToolTipText("");

        jLabelIconeAtividade.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelFotoItem.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFotoItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabelFotoItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelFotoItem.setMaximumSize(new java.awt.Dimension(346, 195));
        jLabelFotoItem.setMinimumSize(new java.awt.Dimension(0, 0));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextComentario.setEditable(false);
        jTextComentario.setColumns(20);
        jTextComentario.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTextComentario.setForeground(new java.awt.Color(102, 102, 102));
        jTextComentario.setLineWrap(true);
        jTextComentario.setRows(2);
        jTextComentario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10), new java.awt.Color(153, 153, 153))); // NOI18N
        jTextComentario.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane1.setViewportView(jTextComentario);

        jButtonLike.setForeground(new java.awt.Color(21, 30, 51));
        jButtonLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/like.png"))); // NOI18N
        jButtonLike.setToolTipText("ISTO ME FAZ SORRIR!");
        jButtonLike.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 51)));
        jButtonLike.setContentAreaFilled(false);
        jButtonLike.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLike.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonLike.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonLike.setOpaque(true);
        jButtonLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLikeActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextComentario1.setColumns(20);
        jTextComentario1.setLineWrap(true);
        jTextComentario1.setRows(1);
        jTextComentario1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextComentario1.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPane2.setViewportView(jTextComentario1);

        Exibir.setBackground(new java.awt.Color(21, 30, 51));
        Exibir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Exibir.setForeground(new java.awt.Color(255, 255, 255));
        Exibir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exibir.setText("Exibir");
        Exibir.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Exibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exibir.setOpaque(true);
        Exibir.setPreferredSize(new java.awt.Dimension(51, 23));
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

        Enviar.setBackground(new java.awt.Color(21, 30, 51));
        Enviar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Enviar.setForeground(new java.awt.Color(255, 255, 255));
        Enviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Enviar.setText("Enviar");
        Enviar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enviar.setOpaque(true);
        Enviar.setPreferredSize(new java.awt.Dimension(87, 23));
        Enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnviarMouseExited(evt);
            }
        });

        jTextCoonteudoPost.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jTextCoonteudoPost.setForeground(new java.awt.Color(21, 30, 51));
        jTextCoonteudoPost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelImagemPost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagemPost.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        views.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        views.setForeground(new java.awt.Color(21, 30, 51));
        views.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        views.setText("Views: 0");

        jLabelNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(21, 30, 51));

        javax.swing.GroupLayout jPanelAtividadeLayout = new javax.swing.GroupLayout(jPanelAtividade);
        jPanelAtividade.setLayout(jPanelAtividadeLayout);
        jPanelAtividadeLayout.setHorizontalGroup(
            jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(views, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCoonteudoPost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE))
                            .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Exibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                        .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabelImagemPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabelIconeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFotoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanelAtividadeLayout.setVerticalGroup(
            jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAtividadeLayout.createSequentialGroup()
                .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIconeAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCoonteudoPost, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImagemPost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAtividadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAtividadeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelFotoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Exibir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAtividadeLayout.createSequentialGroup()
                                .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(views)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLike, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtividade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLikeActionPerformed
        this.atividade.setLike();
        this.jButtonLike.setText("  "+this.atividade.getLike()+" ");
    }//GEN-LAST:event_jButtonLikeActionPerformed

    private void ExibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseClicked
        itemView(atividade);
        atividade.setView();
        views.setText("Views: "+atividade.getView());
    }//GEN-LAST:event_ExibirMouseClicked

    private void EnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseClicked
        String novoComentario=jTextComentario1.getText();
        atividade.setComentario(idUserLogando, novoComentario);
        String comentarios ="";
        for(Comentario c:atividade.getComentarios()){
            comentarios+=""+Dados.getUsuariosBD().get(c.getIdUsuario()).getNomeUsuario()+
            ": "+c.getConteudo()+"\n";
        }
        this.jTextComentario.setText(comentarios);
    }//GEN-LAST:event_EnviarMouseClicked

    private void ExibirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseEntered
        Exibir.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ExibirMouseEntered

    private void ExibirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExibirMouseExited
        Color padrao=new Color(21,30,51);
        Exibir.setBackground(padrao);
    }//GEN-LAST:event_ExibirMouseExited

    private void EnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseEntered
        Enviar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_EnviarMouseEntered

    private void EnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseExited
        Color padrao=new Color(21,30,51);
        Enviar.setBackground(padrao);
    }//GEN-LAST:event_EnviarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enviar;
    private javax.swing.JLabel Exibir;
    private view.IconUser iconUser;
    private javax.swing.JButton jButtonLike;
    private javax.swing.JLabel jLabelFotoItem;
    private javax.swing.JLabel jLabelIconeAtividade;
    private javax.swing.JLabel jLabelImagemPost;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JPanel jPanelAtividade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextComentario;
    private javax.swing.JTextArea jTextComentario1;
    private javax.swing.JLabel jTextCoonteudoPost;
    private javax.swing.JLabel views;
    // End of variables declaration//GEN-END:variables
private void itemView(Atividade atividade) {
        int idTipoColecaoItem=atividade.getIdTipoColecaoItem(); 
        if(idTipoColecaoItem==1){
            JIFrameCamiseta f = new JIFrameCamiseta((Camiseta) atividade.getItem());
            ExibeItemColecao e=new ExibeItemColecao(f);
            JOptionPane.showMessageDialog(null,e,"Camiseta!!!",JOptionPane.PLAIN_MESSAGE); 
        }
      
        if(idTipoColecaoItem==2){
            JIFrameCartao f = new JIFrameCartao((Cartao) atividade.getItem());
            ExibeItemColecao e=new ExibeItemColecao(f);
            JOptionPane.showMessageDialog(null,e,"Cartão!!!",JOptionPane.PLAIN_MESSAGE); 
        }
      
        if(idTipoColecaoItem==3){
            JIFrameJogo f = new JIFrameJogo((Jogo) atividade.getItem());
            ExibeItemColecao e=new ExibeItemColecao(f);
            JOptionPane.showMessageDialog(null,e,"Jogo!!!",JOptionPane.PLAIN_MESSAGE); 
        }
       
        if(idTipoColecaoItem==4){
            JIFrameMoeda f = new JIFrameMoeda((Moeda) atividade.getItem());
            ExibeItemColecao e=new ExibeItemColecao(f);
            JOptionPane.showMessageDialog(null,e,"Jogo!!!",JOptionPane.PLAIN_MESSAGE); 
        }
        if(idTipoColecaoItem==5){
            JIFrameQuadrinho f = new JIFrameQuadrinho((Quadrinho) atividade.getItem());
            ExibeItemColecao e=new ExibeItemColecao(f);
            JOptionPane.showMessageDialog(null,e,"quadrinho!!!",JOptionPane.PLAIN_MESSAGE); 
        }
        if(idTipoColecaoItem==6){
            JIFramehWheels f = new JIFramehWheels((hWheels) atividade.getItem());
            ExibeItemColecao e=new ExibeItemColecao(f);
            JOptionPane.showMessageDialog(null,e,"Hot Whheels!!!",JOptionPane.PLAIN_MESSAGE); 
        }
        if(atividade.idTipoAtividade==0){
             Principal.VisitaPerfil(atividade.idUsuario);
        }
    }
}
