/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaColecionadores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Casa
 */
public class Forum {
    private Integer idRecado;
    private Integer idUsuario;
    private String conteudo;
    private List<Forum> repostas;
    
   
    public Forum(Integer idUsuario, String conteudo) {
        this.idUsuario = idUsuario;
        this.conteudo = conteudo;
        this.idRecado=Dados.getUsuariosBD().get(idUsuario).getNextIdRecado();
    }
     public Forum(boolean resposta, Integer idUsuario, String conteudo) {
        this.idUsuario = idUsuario;
        this.conteudo = conteudo;
        this.idRecado=getNextIdRecado();
    }
    public List<Forum> getRespostas(){ if (repostas == null){
            return repostas = new ArrayList<Forum>();
        }
        return repostas;
    }
    private Integer getNextIdRecado(){return getRespostas().size();}
    
    public void setReposta(Integer idUsuario, String conteudo) {
        Forum e=new Forum(true,idUsuario,conteudo);
        repostas.add(e);
    }
    
  //  int p1 = 0,p2 = 0;
    public JPanel exibeRecado(){
        JPanel painel=new JPanel();
        JLabel usuario=new JLabel(Dados.getUsuariosBD().get(idUsuario).getNomeUsuario());
        JTextArea jTextAreaRecado = new JTextArea(conteudo);
        final JTextArea jTextAreaResposta = new JTextArea();
        JButton jButtonResponder=new JButton("Responder");
       
        jTextAreaRecado.setBounds(100,200, 100, 200);
        jTextAreaRecado.setColumns(10);
        jTextAreaRecado.setRows(2);
       
        jTextAreaResposta.setBounds(400,500, 100, 200);
        jTextAreaResposta.setColumns(10);
        jTextAreaResposta.setRows(2);
        
        painel.add(usuario);
        painel.add(jTextAreaRecado);
        painel.add(jTextAreaResposta);
        painel.add(jButtonResponder);
               
        jButtonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResponderActionPerformed(evt);
            }
            private void jButtonResponderActionPerformed(ActionEvent evt) {
                String recado=jTextAreaResposta.getText();
                setReposta(Principal.getIdUserLogando(),recado);
                jTextAreaResposta.setText("");
            }
        });
        
        if(getRespostas()!=null){
            for (Forum r:getRespostas()){
                JLabel resposta=new JLabel("Respondeu:");
                painel.add(resposta);
                painel.add(r.exibeRecado());
                r.exibeRecado().setBackground(Color.red);
                System.out.println("Usuario:"+r.idUsuario+"REspondeu:"+r.conteudo);
            }
        }
        return painel;
    }
}
