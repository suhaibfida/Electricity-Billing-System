
package electricity.billing.system;

import java.awt.*;
import javax.swing.*;

public class Register extends JFrame {
    Register(){
         setTitle("Register");
        setSize(750,590);
        setLocation(410,100);
   
//       --------1st image background----------
        ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/reg.jpg") );
        Image set1=background.getImage().getScaledInstance(750, 600, Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(set1);
        JLabel image1=new JLabel(i1);
        add(image1);
        JLabel label1=new JLabel("Create Account as:");
        label1.setBounds(90, 182, 150, 16);
        image1.add(label1);
        label1.setFont(new Font("SAN SERIF",Font.BOLD,16));
        label1.setForeground(Color.DARK_GRAY);
        
        Choice reg =new Choice();
         reg.add("Customer");
         reg.add("Admin");
         image1.add(reg);
         reg.setBounds(280, 180, 200, 21);
         reg.setBackground(Color.orange);
       
        setVisible(true);
        setLayout(null);
        
       
    }
    
    
    
    
    public static void main(String args []){
        new Register();
    }
    
}
