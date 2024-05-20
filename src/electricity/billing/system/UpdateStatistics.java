
package electricity.billing.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.ActiveEvent;

public class UpdateStatistics extends JFrame implements ActionListener{
    
    JTextField input1,input2,input3,input4,input5;
    String meter;
    JButton button2,button3;
    UpdateStatistics(String meter){
        setTitle("Update Information");
        setSize(750,590);
        setLocation(370,100);
        this.meter=meter;
        
         JLabel headline=new JLabel("Update Information");
        headline.setBounds(216, 40, 800, 70);
        headline.setFont(new Font("SAN SERIF",Font.BOLD,30));
        headline.setForeground(Color.BLACK);
        add(headline);
        setLayout(null);
        
        
        
         JLabel label1=new JLabel("Name:");
        label1.setBounds(70, 120, 300, 100);
        label1.setFont(new Font("Serif",Font.BOLD,19));
        add(label1);
        
         JLabel name=new JLabel("");
        name.setBounds(280, 120, 300, 100);
        name.setFont(new Font("Serif",Font.BOLD,19));
        add(name);
        
        
        JLabel label3=new JLabel("Meter Number:");
        label3.setBounds(400, 120, 300, 100);
        label3.setFont(new Font("Serif",Font.BOLD,19));
        add(label3);
        
        JLabel meterno=new JLabel("");
        meterno.setBounds(280, 200, 300, 100);
        meterno.setFont(new Font("Serif",Font.BOLD,19));
        add(meterno);
        
        
        
        JLabel label2=new JLabel("State:");
        label2.setBounds(70, 200, 300, 100);
        label2.setFont(new Font("Serif",Font.BOLD,19));
        add(label2);
        input1=new JTextField();
        input1.setBounds(180, 240, 150, 21);
        input1.setFont(new Font("SAN SERIF",Font.BOLD,11));
        input1.setBorder(null);
        input1.setBackground(Color.WHITE);
         add(input1);
        
        JLabel label4=new JLabel("Email:");
        label4.setBounds(400, 200, 300, 100);
        label4.setFont(new Font("Serif",Font.BOLD,19));
        add(label4);
        
       input2=new JTextField();
        input2.setBounds(500, 240, 150, 21);
        input2.setFont(new Font("SAN SERIF",Font.BOLD,11));
        input2.setBorder(null);
        input2.setBackground(Color.WHITE);
        add(input2);
        
        JLabel label5=new JLabel("Address:");
        label5.setBounds(70, 280, 300, 100);
        label5.setFont(new Font("Serif",Font.BOLD,19));
        add(label5);
        
        
        
        input3=new JTextField();
        input3.setBounds(180, 320, 150, 21);
        input3.setFont(new Font("SAN SERIF",Font.BOLD,11));
        input3.setBorder(null);
        input3.setBackground(Color.WHITE);
         add(input3);
        
       
//        ---------------------
       
        JLabel label6=new JLabel("Phone:");
        label6.setBounds(400, 280, 300, 100);
        label6.setFont(new Font("Serif",Font.BOLD,19));
        add(label6);
        
        
        input5=new JTextField();
        input5.setBounds(500, 320, 150, 21);
        input5.setFont(new Font("SAN SERIF",Font.BOLD,11));
        input5.setBorder(null);
        input5.setBackground(Color.WHITE);
         add(input5);
        
        
        JLabel label7=new JLabel("City");
        label7.setBounds(70, 360, 300, 100);
        label7.setFont(new Font("Serif",Font.BOLD,19));
        add(label7);
        
        
        input5=new JTextField();
        input5.setBounds(180, 400, 150, 21);
        input5.setFont(new Font("SAN SERIF",Font.BOLD,11));
        input5.setBorder(null);
        input5.setBackground(Color.WHITE);
         add(input5);
         
         
         
         
             try{
                 Connect c=new Connect();
                 ResultSet rs=c.s.executeQuery("select * from customer where meter_no='"+meter+"'");
                 while(rs.next()){
                     name.setText(rs.getString("name"));
                     meterno.setText(rs.getString("meter_no"));
                     input1.setText(rs.getString("state"));
                     input2.setText(rs.getString("email"));
                     input3.setText(rs.getString("address"));
                     input4.setText(rs.getString("phone"));
                     input5.setText(rs.getString("City"));
                 }
                 
                 
                 
                            }
                catch(Exception e){
                    e.printStackTrace();
    
} 
             
             
             
        button2=new JButton("Sign Up");
        button2.setForeground(Color.DARK_GRAY);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setBorder(null);
        button2.addActionListener(this);
        button2.setBounds(245, 470, 110, 25);
        button2.setFont(new Font("SAN Serif",Font.BOLD,15));
      add(button2);
        
        button3=new JButton("Forget");
        button3.setForeground(Color.DARK_GRAY);
        button3.addActionListener(this);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setBorder(null);
        button3.setBounds(385, 470, 110, 25);
        button3.setFont(new Font("SAN Serif",Font.BOLD,15));
       add(button3);
        
     
       
       
       
       
       
       
       
       
        setVisible(true);
        
        
    }
    
    public static void main(String [] args){
        new UpdateStatistics("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button2){
            try{
                String state =input1.getText();
                String email =input2.getText();
                String address =input3.getText();
                String phone =input4.getText();
                String city =input5.getText();
                try{
                    Connect c=new Connect();
                   c.s.executeUpdate("update customer set state='"+state+"',email='"+email+"',address='"+address+"',phone='"+phone+"',city='"+city+"'");
                    JOptionPane.showMessageDialog(null,"User Information Updated");
                }
                catch(Exception ae){
                    ae.printStackTrace();
                    
                }
                
                
                
                
                
        }
            
            catch(Exception ae){
                ae.printStackTrace();
            }
                
            }
        else{
            setVisible(false);
        }
        
        
    }
    
}
