package ProgramaColecionadores;

/**
 *
 * @author leticia
 */

import javax.swing.JFrame;
    import javax.swing.*;  
import java.awt.*;  
import java.io.IOException;  
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class DisplayHtml extends JFrame{  
  
    public DisplayHtml() throws IOException {  
        
            Container con = this.getContentPane();
            
            JEditorPane jep = new JEditorPane(Principal.class.getResource("/ProgramaColecionadores/Tutorial.html"));
            JScrollPane jsp = new JScrollPane(jep);
            con.add(jsp);
            
            
            this.setBounds(50, 50, 600, 500);  
            this.setVisible(true);
        
    }  
  
     public static void main(String args[]) {
     
        try {
            DisplayHtml t=new DisplayHtml();
        } catch (IOException ex) {
            Logger.getLogger(DisplayHtml.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

}