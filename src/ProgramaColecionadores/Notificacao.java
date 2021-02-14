package ProgramaColecionadores;

import java.awt.Dialog;

/**
 *
 * @author Mateus
 */
public class Notificacao extends javax.swing.JFrame {
    private int solicitacoes;
    public Notificacao() {
        initComponents();
        for(Usuario e:Dados.getSolicitacaoAmizade(Principal.getIdUserLogando())){
            PedidoAmizade p= new PedidoAmizade(e);
            this.jPanelconteudo.add(p);    
            solicitacoes++;
        }
        if(solicitacoes==0){
            jScrollPane1.setVisible(false);
            }else{jScrollPane1.setVisible(true);}
        this.setLocationRelativeTo(null);
        this.show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelconteudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitações de amizade");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(340, 100));
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelconteudo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelconteudo.setLayout(new javax.swing.BoxLayout(jPanelconteudo, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanelconteudo);

        getContentPane().add(jScrollPane1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 30, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<HTML><p>Não possui solicitações</p></html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelconteudo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}