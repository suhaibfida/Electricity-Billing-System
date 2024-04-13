package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame{
    Home(){
        
         //    ---------Creating Panel----------
         
         setTitle("Home");
         setSize(1200,800);
         setLocation(180,20);
         
         //   ---------- Background Image ----------
         
         ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/tower.jpg"));
         Image set=background.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(set);
         JLabel image1=new JLabel(i1);
         add(image1);
         
//         ---------------            ----------------
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         setVisible(true);
    }
        
    
    public static void main(String [] args){
        new Home();
    }
}
