package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener{
    
    JButton button1,button2,button3; 
    JTextField input1;
    JPasswordField input2;
    Choice login;
    
    Login(){
        //    --------- Creating Panel ----------
        
        setTitle("Flash Billing System");
        setSize(750,590);
        setLocation(370,100);
   
//       -------- Background Image ----------

        ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/blue.png") );
        Image set1=background.getImage().getScaledInstance(750, 600, Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(set1);
        JLabel image1=new JLabel(i1);
        add(image1);
        
//         -------------- 2nd Image Icon -------------------

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/idea.png"));
        Image set2=icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 =new ImageIcon(set2);
         
        JLabel image2=new JLabel(i2);
        image2.setBounds(309, 20, 100, 100);
        image1.add(image2);
        
//         -------- Head Text --------
         
        JLabel headline=new JLabel("Flash Billing System");
        headline.setBounds(216, 110, 800, 70);
        headline.setFont(new Font("SAN SERIF",Font.BOLD,30));
        headline.setForeground(Color.white);
        image1.add(headline);
        
//        ----------- LoggingIn As customer or admin -----------

        login = new Choice();
        image1.add(login);
        login.add("Customer");
        login.add("Admin");
        login.setBounds(10, 10, 100, 21);
        login.setBackground(Color.orange);
        login.setForeground(Color.DARK_GRAY);
      
//         -------------- Input ------------

        JLabel text1=new JLabel("Username:");
        text1.setBounds(245, 210, 300, 30);
        text1.setForeground(Color.DARK_GRAY);
        text1.setFont(new Font("SERIF",Font.BOLD,15));
        image1.add(text1);
        input1=new JTextField();
        input1.setBounds(245, 240, 250, 21);
        input1.setFont(new Font("SAN SERIF",Font.BOLD,11));
        input1.setBorder(null);
        input1.setBackground(Color.WHITE);
        image1.add(input1);
           
        JLabel text2=new JLabel("Password:");
        text2.setBounds(245, 285, 300, 30);
        text2.setForeground(Color.DARK_GRAY);
        text2.setFont(new Font("SERIF",Font.BOLD,15));
        image1.add(text2);
          
        input2=new JPasswordField();
        input2.setBounds(245, 315, 250, 21);
        input2.setBorder(null);
        input2.setBackground(Color.WHITE);
        image1.add(input2);
        
        
        
       
        
//           ------------ Buttons ----------

        button1=new JButton("Sign In");
        button1.setBounds(245, 385, 250, 28);
        button1.setFont(new Font("SAN Serif",Font.BOLD,18));
        button1.setForeground(Color.DARK_GRAY);
        button1.setBackground(Color.ORANGE);
        button1.addActionListener(this);
        button1.setBorder(null);
        image1.add(button1);
        
        button2=new JButton("Sign Up");
        button2.setForeground(Color.DARK_GRAY);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setBorder(null);
        button2.addActionListener(this);
        button2.setBounds(245, 420, 110, 25);
        button2.setFont(new Font("SAN Serif",Font.BOLD,15));
        image1.add(button2);
        
        button3=new JButton("Forget");
        button3.setForeground(Color.DARK_GRAY);
        button3.addActionListener(this);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setBorder(null);
        button3.setBounds(385, 420, 110, 25);
        button3.setFont(new Font("SAN Serif",Font.BOLD,15));
        image1.add(button3);
           
//       ------------------ Bottom -------------------

        JLabel bottom=new JLabel("Created and designed by Suhaib Fida");
        bottom.setBounds(267, 485, 500, 100);
        bottom.setForeground(Color.white);
        image1.add(bottom);
           
           setVisible(true);
          
          
       }
        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){

            String suser=input1.getText();
            String spass=input2.getText();
            String ssuser=login.getSelectedItem();


            try{
                Connect c=new Connect();
                String query="select * from login where username='"+suser+"'and password='"+spass+"'and user='"+ssuser+"'";

                ResultSet rs=c.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Home().setVisible(true);
                   
               }
               else{
                   JOptionPane.showMessageDialog(null, "Invalid credentials");
                   input1.setText("");
                   input2.setText("");
               }
                
            }
            catch(Exception ae){
                ae.printStackTrace();
            }
            
      }
        else if(e.getSource() == button2){
        setVisible(false);
        new Register().setVisible(true);
       }
        else {
        setVisible(false);
        
     }
    
     }
        public static void main(String [] args){
         new Login(); 
     }
    }
