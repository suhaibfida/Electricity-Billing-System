
package electricity.billing.system;

import java.awt.*;
import javax.swing.*;

public class Register extends JFrame {
    Register(){
         setTitle("Flash Billing System");
        setSize(750,590);
        setLocation(410,100);
   
//       --------1st image background----------
        ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/vivid-blurred-colorful-wallpaper-background.png") );
        Image set1=background.getImage().getScaledInstance(750, 600, Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(set1);
        JLabel image1=new JLabel(i1);
        add(image1);
        setVisible(true);
        setLayout(null);
        
       
    }
    
    
    
    
    public static void main(String args []){
        new Register();
    }
    
}
