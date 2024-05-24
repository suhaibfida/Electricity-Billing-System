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

public class DepositDetails extends JFrame  implements ActionListener {
    
    JTable table;
    JButton button2;
    
    DepositDetails(){
        super("Deposit Details");
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
     
        table=new JTable();
        
        
          try{
              Connect c=new Connect();
              ResultSet rs=c.s.executeQuery("select * from customer");
              table.setModel(DbUtils.resultSetToTableModel(rs));
              
              JScrollPane scroll=new JScrollPane(table);
              scroll.setBounds(100, 100, 600, 400);
             image1.add(scroll);
              
        
         
         button2=new JButton("Print");
         button2.setBounds(550, 550, 100, 20);
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
        new DepositDetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
            try {
                table.print();
            } catch (PrinterException ex) {
                Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
    
}

