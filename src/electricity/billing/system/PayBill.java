
package electricity.billing.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class PayBill extends JFrame {
    String meter;
    PayBill(String meter){
        
        setTitle("Pay Bill");
        setSize(800,700);
        setLocation(350,10);
        this.meter=meter;
       setLayout(null);
        JLabel label0=new JLabel("Electricity Bill");
        label0.setFont(new Font("Serif",Font.BOLD,25));
        label0.setBounds(300, 50, 300, 50);
        add(label0);
        
        JLabel label1=new JLabel("Meter Number");
        label1.setFont(new Font("Serif",Font.BOLD,17));
        label1.setBounds(50, 170, 200, 30);
        add(label1);
        
        JLabel input1=new JLabel("");
        input1.setFont(new Font("Serif",Font.BOLD,17));
        input1.setBounds(170, 170, 200, 30);
        add(input1);
        
        
        
        
        
        JLabel label2=new JLabel("Name");
        label2.setFont(new Font("Serif",Font.BOLD,17));
        label2.setBounds(50, 240, 100, 30);
        add(label2);
        
        JLabel input2=new JLabel("");
        input2.setFont(new Font("Serif",Font.BOLD,17));
        input2.setBounds(170, 240, 100, 30);
        add(input2);
        
        JLabel label3=new JLabel("Month");
        label3.setFont(new Font("Serif",Font.BOLD,17));
        label3.setBounds(50, 310, 50, 30);
        add(label3);
        
        
        
        
        
        Choice choice=new Choice();
        choice.add("JAN");
        choice.add("FEB");
        choice.add("MAR");
        choice.add("APR");
        choice.add("MAY");
        choice.add("JUN");
        choice.add("JUL");
        choice.add("AUG");
        choice.add("SEP");
        choice.add("OCT");
        choice.add("NOV");
        choice.add("DEC");
        
        
        
        
        
        
        choice.setBounds(170, 318, 150, 50);
        add(choice);
        
//        
        
        JLabel label4=new JLabel("Units");
        label4.setFont(new Font("Serif",Font.BOLD,17));
        label4.setBounds(50, 380, 100, 30);
        add(label4);
        
         JLabel input4=new JLabel("");
        input4.setFont(new Font("Serif",Font.BOLD,17));
        input4.setBounds(170, 380, 100, 30);
        add(input4);
        
        
        
         JLabel label5=new JLabel("Total Bill");
        label5.setBounds(50, 440, 100, 30);
        label5.setFont(new Font("Serif",Font.BOLD,17));
        add(label5);
         JLabel input5=new JLabel("");
        input5.setBounds(170, 440, 100, 30);
        input5.setFont(new Font("Serif",Font.BOLD,17));
        add(input5);
        
         JLabel label6=new JLabel("Status");
         label6.setFont(new Font("Serif",Font.BOLD,17));
        label6.setBounds(50, 500, 100, 30);
        add(label6);
        
        JLabel input6=new JLabel("");
         input6.setFont(new Font("Serif",Font.BOLD,17));
        input6.setBounds(170, 500, 100, 30);
        add(input6);
        
        try{
            Connect c=new Connect();
            ResultSet rs =c.s.executeQuery("select * from customer where meter_no='"+meter+"'");
            
            while (rs.next()){
                input1.setText(meter);
                input1.setText(rs.getString("name"));
                
            }
            rs=c.s.executeQuery("select * from bill where meter_no='"+meter+"' AND month='"+choice.getSelectedItem()+"'");
            input4.setText(rs.getString("units"));
            input5.setText(rs.getString("totalBill"));
            input6.setText(rs.getString("status"));
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        setVisible(true);
        
    }
    
    
    public static void main(String [] args){
        new PayBill("");
    }
    
}
