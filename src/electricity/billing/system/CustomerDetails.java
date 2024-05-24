package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class CustomerDetails extends JFrame  implements ActionListener {
    Choice ch,ch2;
    JTable table;
    JButton button1,button2;
    
    CustomerDetails(){
        super("Customer Details");
        setLocation(350,10);
        setSize(800,700);
        
        ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/h.jpg"));
         Image set=background.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(set);
         JLabel image1=new JLabel(i1);
         add(image1);
         
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/idea.png"));
        Image set2=icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i2 =new ImageIcon(set2);
         
        JLabel image2=new JLabel(i2);
        image2.setBounds(10, 3, 30, 50);
        image1.add(image2);
        
        
        JLabel headline=new JLabel("FBS");
         headline.setBounds(50, 6, 80, 40);
         headline.setFont(new Font("SAN SERIF",Font.BOLD,23));
         headline.setForeground(Color.white);
         image1.add(headline);
         
        JLabel head=new JLabel("Search By Meter No :");
        head.setBounds(30, 50, 200, 70);
        head.setFont(new Font("SERIF",Font.BOLD,19));
        head.setForeground(Color.WHITE);
        image1.add(head);
         
        
         ch=new Choice();
        
        
        
        try{
            Connect c=new Connect();
             ResultSet rs=(ResultSet) c.s.executeQuery("select * from customer");
             while(rs.next()){
            ch.add(rs.getString("meter"));
        }
            
                    
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
         
         ch.setBounds(230,75,150,50);
         ch.setBackground(Color.ORANGE);
         image1.add(ch);
        
        
        JLabel month=new JLabel("Month :");
        month.setBounds(30, 100, 70, 70);
        month.setFont(new Font("SERIF",Font.BOLD,19));
        month.setForeground(Color.WHITE);
        image1.add(month);
        
         ch2=new Choice();
         ch2.add("January");
         ch2.add("February");
         ch2.add("March");
         ch2.add("April");
         ch2.add("May");
         ch2.add("June");
         ch2.add("July");
         ch2.add("August");
         ch2.add("September");
         ch2.add("October");
         ch2.add("November");
         ch2.add("December");
         ch2.setBounds(230,125,150,70);
         ch2.setBackground(Color.ORANGE);
         image1.add(ch2);
        
        
         
        table=new JTable();
        
        
          try{
              Connect c=new Connect();
              ResultSet rs=c.s.executeQuery("select * from bill");
              table.setModel(DbUtils.resultSetToTableModel(rs));
              
              JScrollPane scroll=new JScrollPane(table);
              scroll.setBounds(100, 200, 600, 400);
             image1.add(scroll);
              
         button1=new JButton("Search");
         button1.setBounds(500, 75, 100, 20);
         button1.setBackground(Color.GRAY);
         button1.setForeground(Color.WHITE);
         button1.setFont(new Font("SAN SERIF",Font.BOLD,16));
         button1.addActionListener(this);
         button1.setBorder(null);
         image1.add(button1);
         
         button2=new JButton("Print");
         button2.setBounds(500, 123, 100, 20);
         button2.setBackground(Color.orange);
         button2.setForeground(Color.DARK_GRAY);
         button2.setFont(new Font("SAN SERIF",Font.BOLD,16));
         button2.addActionListener(this);
         button2.setBorder(null);
         image1.add(button2); 
         
         
         
         
              
              setVisible(true);
              setLayout(null);
              
          }
          catch(Exception e){
              e.printStackTrace();
              
          }
       
    }
    
    
    public static void main(String [] args){
        new CustomerDetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            try{
                String query="select * from bill where meter_no='"+ch.getSelectedItem()+"'and month='"+ch2.getSelectedItem()+"'";
                Connect c=new Connect();
                ResultSet rs=c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
            catch(Exception ae){
               ae.printStackTrace();
            }
        }
        else{
            try {
                table.print();
            } catch (PrinterException ex) {
                Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
        
        
    }
    
}
