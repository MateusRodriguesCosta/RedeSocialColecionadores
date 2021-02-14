package ProgramaColecionadores;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
public class JIFrameRecado extends javax.swing.JInternalFrame {
    int idUserLogando=Principal.getIdUserLogando();
    int idUser;
    private Usuario usuario;
    public JIFrameRecado(int idUser) {
        this.idUser=idUser;
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior  
        this.setBorder(null);//retirar bordas 
                      enviar.addMouseListener(new MouseAdapter() {///apaga o texto da caixa
                      public void mouseClicked(MouseEvent arg0) {jTextAreaRecado.setText("");}
                      });   
        usuario=Dados.getUsuariosBD().get(idUser);
        List<Mensagem> listaMensagens=Dados.getMensagensUsuario(idUser);
        
        for(Mensagem mensagem:listaMensagens){
            if(mensagem.getIdUser().contains(idUserLogando)){
            ExibicaoMensagem e=new ExibicaoMensagem(mensagem);
            jPanelConteudo.add(e);
            }    
        }
        if(Principal.getIdUserLogando()!=idUser){
            jLabel1.setText("Conversas de "+Dados.getUsuariosBD().get(idUser).getNome()+" "+Dados.getUsuariosBD().get(idUser).getSobrenome());    
        }else{
            enviar.setVisible(false);
            jScrollPaneRecado.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneRedados = new javax.swing.JScrollPane();
        jPanelConteudo = new javax.swing.JPanel();
        jScrollPaneRecado = new javax.swing.JScrollPane();
        jTextAreaRecado = new javax.swing.JTextArea();
        enviar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setOpaque(true);

        jScrollPaneRedados.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneRedados.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneRedados.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 30, 51), 5, true));

        jPanelConteudo.setBackground(new java.awt.Color(246, 246, 246));
        jPanelConteudo.setForeground(new java.awt.Color(21, 30, 51));
        jPanelConteudo.setLayout(new javax.swing.BoxLayout(jPanelConteudo, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneRedados.setViewportView(jPanelConteudo);

        jScrollPaneRecado.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneRecado.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 30, 51), 3, true));

        jTextAreaRecado.setColumns(10);
        jTextAreaRecado.setLineWrap(true);
        jTextAreaRecado.setRows(2);
        jTextAreaRecado.setWrapStyleWord(true);
        jTextAreaRecado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextAreaRecado.setSelectionColor(new java.awt.Color(21, 30, 51));
        jScrollPaneRecado.setViewportView(jTextAreaRecado);

        enviar.setBackground(new java.awt.Color(21, 30, 51));
        enviar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        enviar.setForeground(java.awt.SystemColor.control);
        enviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enviar.setText("Iniciar conversa");
        enviar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setOpaque(true);
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minhas conversas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneRedados, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneRecado, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneRedados, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneRecado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        if(Principal.getIdUserLogando()!=idUser){
        String recado=jTextAreaRecado.getText();
        Mensagem mensagem=new Mensagem(idUserLogando,idUser,recado);
        jPanelConteudo.removeAll();
        List<Mensagem> listaMensagens=Dados.getMensagensUsuario(idUser);
        for(Mensagem men:listaMensagens){
            if(mensagem.getIdUser().contains(idUserLogando)){
            ExibicaoMensagem e=new ExibicaoMensagem(mensagem);
            jPanelConteudo.add(e);this.updateUI();((BasicInternalFrameUI)this.getUI()).setNorthPane(null);this.setBorder(null);
            }    
        }
        }
    }//GEN-LAST:event_enviarMouseClicked

    private void enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseEntered
        enviar.setOpaque(true);
        enviar.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_enviarMouseEntered

    private void enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseExited
        Color padrao=new Color(21,30,51);
        enviar.setBackground(padrao);
    }//GEN-LAST:event_enviarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JScrollPane jScrollPaneRecado;
    private javax.swing.JScrollPane jScrollPaneRedados;
    private javax.swing.JTextArea jTextAreaRecado;
    // End of variables declaration//GEN-END:variables
}
