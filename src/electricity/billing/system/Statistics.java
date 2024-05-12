
package electricity.billing.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class Statistics extends JFrame implements ActionListener {
    String meter;
    JButton button1;
    Statistics(String meter){
        this.meter=meter;
        setTitle("Information");
        setSize(1000,800);
        setLocation(220,10);
        
        JLabel inform=new JLabel("Customer Information");
        inform.setBounds(335, 30, 300, 100);
        inform.setFont(new Font("Serif",Font.BOLD,30));
        add(inform);setLayout(null);
        
        JLabel label1=new JLabel("Name:");
        label1.setBounds(70, 120, 300, 100);
        label1.setFont(new Font("Serif",Font.BOLD,19));
        add(label1);
        
         JLabel name=new JLabel("");
        name.setBounds(280, 120, 300, 100);
        name.setFont(new Font("Serif",Font.BOLD,19));
        add(name);
        
        JLabel label2=new JLabel("State:");
        label2.setBounds(550, 120, 300, 100);
        label2.setFont(new Font("Serif",Font.BOLD,19));
        add(label2);
        
        JLabel state=new JLabel("");
        state.setBounds(700, 120, 300, 100);
        state.setFont(new Font("Serif",Font.BOLD,19));
        add(state);
        
        
//        ---------------------
        JLabel label3=new JLabel("Meter Number:");
        label3.setBounds(70, 200, 300, 100);
        label3.setFont(new Font("Serif",Font.BOLD,19));
        add(label3);
        
        JLabel meterno=new JLabel("");
        meterno.setBounds(280, 200, 300, 100);
        meterno.setFont(new Font("Serif",Font.BOLD,19));
        add(meterno);
        
        
        JLabel label4=new JLabel("Email:");
        label4.setBounds(550, 200, 300, 100);
        label4.setFont(new Font("Serif",Font.BOLD,19));
        add(label4);
        
         JLabel email=new JLabel("");
        email.setBounds(700, 200, 300, 100);
        email.setFont(new Font("Serif",Font.BOLD,19));
        add(email);
        
        JLabel label5=new JLabel("Address:");
        label5.setBounds(70, 280, 300, 100);
        label5.setFont(new Font("Serif",Font.BOLD,19));
        add(label5);
        
        
        JLabel address=new JLabel("");
        address.setBounds(280, 280, 300, 100);
        address.setFont(new Font("Serif",Font.BOLD,19));
        add(address);
        
        JLabel label6=new JLabel("Phone:");
        label6.setBounds(550, 280, 300, 100);
        label6.setFont(new Font("Serif",Font.BOLD,19));
        add(label6);
        
        JLabel phone=new JLabel("");
        phone.setBounds(700, 280, 300, 100);
        phone.setFont(new Font("Serif",Font.BOLD,19));
        add(phone);
        
        JLabel label7=new JLabel("City");
        label7.setBounds(70, 360, 300, 100);
        label7.setFont(new Font("Serif",Font.BOLD,19));
        add(label7);
        
         JLabel city=new JLabel("");
        city.setBounds(280, 360, 300, 100);
        city.setFont(new Font("Serif",Font.BOLD,19));
        add(city);
        
        
        try{
            Connect c=new Connect();
            ResultSet rs=c.s.executeQuery("select * from customer where meter='"+meter+"'");
            while(rs.next()){
               name.setText(rs.getString("name"));
               address.setText(rs.getString("address"));
               city.setText(rs.getString("city"));
               state.setText(rs.getString("state"));
               email.setText(rs.getString("email"));
               phone.setText(rs.getString("phone"));
               meterno.setText(rs.getString("meterno"));
               
                   
                   
                
                
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
         button1=new JButton("Cancel");
        button1.setBounds(245, 550, 250, 28);
        button1.setFont(new Font("SAN Serif",Font.BOLD,18));
        button1.setForeground(Color.DARK_GRAY);
        button1.setBackground(Color.ORANGE);
        button1.addActionListener(this);
        button1.setBorder(null);
        add(button1);
        
        
        
        
        
        
        
        setVisible (true);
        
    }
    
    
    
    public static void main(String[] args){
        new Statistics("");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
           setVisible(false);
        }
    }
    
}
