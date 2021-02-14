package ProgramaColecionadores;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.swing.ImageIcon;

/**
 *
 * @author casa
 */
public class JPanelAtividadeRede extends javax.swing.JPanel {
        private  int idUserLogando=Principal.getIdUserLogando();
        private List<Atividade> lstMinhasAtividades=Dados.getAtividadesBD();
        private int idAtividade;
        int p;
        private int fim;
        private SortedMap<Integer, Atividade> listImportantes;
        /**
        * Creates new form JPanelAtividadeRede
        */
        public JPanelAtividadeRede() {
            initComponents();
            ////EXIBINDO ATIVIDADE 1///////////////
            this.p=lstMinhasAtividades.size();
            gerarConteudo();
            navegacao();
        }
        private ImageIcon getIconeAtividade(int tipo){
        if (tipo==1){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/iconAdd.png"));
            return Icon;
        }else
        if (tipo==2){
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("/Images/IconRemove.png"));
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
        private void navegacao(){
        if(lstMinhasAtividades.size()<=4){
            jButtonNext.setVisible(false);
            jButtonBack.setVisible(false);
            anterior.setVisible(false);
            proximo.setVisible(false);
        }
        //////////////////
        if(p<=0){
            jButtonNext.setVisible(false);
            proximo.setVisible(false);
        }else{
            jButtonNext.setVisible(true);
            proximo.setVisible(true);
        }
        //////////////
    
        }

        private void gerarConteudo() {
        this.repaint();
        this.jPanelConteudo.removeAll();
        this.jPanelConteudo.repaint();
        if(p>4){fim = p-4;}
            else {fim = 0;}
        if(lstMinhasAtividades.size()<=p){
            jButtonBack.setVisible(false);
            anterior.setVisible(false);
        }else{
            jButtonBack.setVisible(true);
            anterior.setVisible(true);
        }
        while (p>fim) {
            p--;
            Atividade atividade=lstMinhasAtividades.get(p);
            ExibicaoItemAtividade e =new ExibicaoItemAtividade(atividade);
            this.jPanelConteudo.add(e);
        }
        this.jPanelConteudo.revalidate();  
        navegacao();
        }
        private void back(){
        this.repaint();
        if(lstMinhasAtividades.size()%4==0){
            p=p+8; 
        }else{
            p=p+4+(lstMinhasAtividades.size()%4);
        }
        System.out.println(p);
        System.out.println(lstMinhasAtividades.size());
        if(p>4){
            fim = p-4;
        }
        else {
            fim = 0;
        }
        ///////////
        if(lstMinhasAtividades.size()==p){
            jButtonBack.setVisible(false);
            anterior.setVisible(false);
        }else{
            jButtonBack.setVisible(true);
            anterior.setVisible(true);
        }
        ///////////
        this.jPanelConteudo.removeAll();
        this.jPanelConteudo.repaint();
        while (p>fim) {
            p--;
            Atividade atividade=lstMinhasAtividades.get(p);
            ExibicaoItemAtividade e =new ExibicaoItemAtividade(atividade);
            this.jPanelConteudo.add(e);
            e.setVisible(true);
        }
        this.jPanelConteudo.revalidate();  
        navegacao();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelConteudo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNext = new javax.swing.JButton();
        proximo = new javax.swing.JLabel();
        anterior = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConteudo.setBorder(new javax.swing.border.MatteBorder(null));
        jPanelConteudo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelConteudo.setLayout(new javax.swing.BoxLayout(jPanelConteudo, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next.png"))); // NOI18N
        jButtonNext.setToolTipText("Próximo");
        jButtonNext.setBorder(null);
        jButtonNext.setContentAreaFilled(false);
        jButtonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNext.setFocusable(false);
        jButtonNext.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextPress.png"))); // NOI18N
        jButtonNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextOver.png"))); // NOI18N
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        proximo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        proximo.setForeground(new java.awt.Color(0, 0, 51));
        proximo.setText("PROXIMO");

        anterior.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        anterior.setForeground(new java.awt.Color(0, 0, 51));
        anterior.setText("ANTERIOR");

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButtonBack.setToolTipText("Anterior");
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backOver.png"))); // NOI18N
        jButtonBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backPress.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(proximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proximo)
                            .addComponent(anterior))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if(p>0){
            gerarConteudo();
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        back();
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anterior;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JLabel proximo;
    // End of variables declaration//GEN-END:variables
     public void ativadadesUsuario(int idUsuario){
        this.removeAll();
        this.repaint();
    
        this.lstMinhasAtividades=Dados.getAtividadesUsuario(idUsuario);
        initComponents();
         ////EXIBINDO ATIVIDADE 1///////////////
        this.p=lstMinhasAtividades.size();
        gerarConteudo();
        navegacao();
        this.updateUI();
     }

     public void ativadadesRede(){
        this.removeAll();
        this.repaint();
        this.lstMinhasAtividades=Dados.getAtividadesBD();
        initComponents();
        this.p=lstMinhasAtividades.size();
        gerarConteudo();
        navegacao();
        this.updateUI();
    }
    public void ativadadesAmigos(int idUsuario){
        this.removeAll();
        this.repaint();
        this.lstMinhasAtividades=new ArrayList<Atividade>();
        initComponents();
        Usuario usuario=Dados.getUsuariosBD().get(idUsuario);
        for(Atividade atividade:Dados.getAtividadesBD() ){
            if(usuario.amigos.contains(atividade.getIdUsuario())){
                this.lstMinhasAtividades.add(atividade);
            }
        }
    
        this.p=lstMinhasAtividades.size();
        gerarConteudo();
        navegacao();
        this.updateUI();
    }
    public void organizarImportantes(){
        this.listImportantes=new TreeMap<>();
        List<Atividade> temp=new ArrayList<>();
        for(Atividade atividade:lstMinhasAtividades){
            int soma=atividade.getLike()+atividade.getView();
            listImportantes.put(soma,atividade);    
        }  
        for(Atividade atividade:listImportantes.values()){
            int soma=atividade.getLike()+atividade.getView();
            for(Atividade atividade2:lstMinhasAtividades){
                int soma2=atividade2.getLike()+atividade2.getView();
                if(soma==soma2){
                    temp.add(atividade2);
                }
            }
        }
        this.lstMinhasAtividades=new ArrayList<Atividade>();
        this.lstMinhasAtividades.addAll(temp);
        this.removeAll();
        this.repaint();
        initComponents();
        this.p=lstMinhasAtividades.size();
        gerarConteudo();
        navegacao();
        this.updateUI();
    }

    public void organizarRecente(){
        if(listImportantes!=null){
            this.lstMinhasAtividades=new ArrayList<Atividade>();
            listImportantes.entrySet();
            for(Atividade atividade:listImportantes.values()){
                this.lstMinhasAtividades.add(atividade);
            }
        }
        this.removeAll();
        this.repaint();
        initComponents();
        this.p=lstMinhasAtividades.size();
        gerarConteudo();
        navegacao();
        this.updateUI();
    }

    public void muralComunidade(int idComunidade){
        List<Atividade>temp0=new ArrayList<Atividade>();
        for(Atividade atividade:lstMinhasAtividades){
            if((idComunidade==atividade.idComunidade)&&
            (atividade.getTipoMural()==Atividade.tipoMural.comunidade))
            {
                temp0.add(atividade);
            }
        }  
        lstMinhasAtividades=new ArrayList<>(temp0);
        this.listImportantes=new TreeMap<>();
        List<Atividade> temp=new ArrayList<>();
        for(Atividade atividade:lstMinhasAtividades){
            int soma=atividade.getLike()+atividade.getView();
            listImportantes.put(soma,atividade);
        }  
        for(Atividade atividade:listImportantes.values()){
            int soma=atividade.getLike()+atividade.getView();
        for(Atividade atividade2:lstMinhasAtividades){
            int soma2=atividade2.getLike()+atividade2.getView();
            if(soma==soma2){
                temp.add(atividade2);
            }
        }
        }
        this.lstMinhasAtividades=new ArrayList<Atividade>();
        this.lstMinhasAtividades.addAll(temp);
        this.removeAll();
        this.repaint();
        initComponents();
        this.p=lstMinhasAtividades.size();
        gerarConteudo();
        navegacao();
        this.updateUI();
    }
}