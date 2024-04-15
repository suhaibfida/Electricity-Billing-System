package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
         
//         --------------- Menu Bar ----------------
          JMenuBar menu=new JMenuBar();
          setJMenuBar(menu);
          setLayout(new FlowLayout ());
           
          JMenu home=new JMenu("Home");
          home.setFont(new Font("mono spaced",Font.BOLD,15));
          menu.add(home);
          
          JMenuItem first=new JMenuItem("New Customer");
          ImageIcon img2=new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
          Image set2=img2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
          first.setIcon(new ImageIcon(set2));
          first.setMnemonic('A');
          first.setFont(new Font("mono spaced",Font.PLAIN,12));
          first.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
          home.add(first);
          

         
         
         
         
        
         
         
         setVisible(true);
    }
        
    
    public static void main(String [] args){
        new Home();
    }
}
