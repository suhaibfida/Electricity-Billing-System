
package electricity.billing.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionListener;


public class GenerateBill extends JFrame implements ActionListener {
    String meter;
    Choice month;
    JTextArea area;
    
    GenerateBill(String meter){
        
        this.meter=meter;
        setTitle("Generate Bill");
        setSize(700,800);
        setLocation(200,10);
        setLayout(new BorderLayout());
        JPanel panel=new JPanel();
        JLabel heading =new JLabel("Generate Bill");
        JLabel meterno=new JLabel(meter);  
        month=new Choice();
        month.add("JAN");
        month.add("FEB");
        month.add("MAR");
        month.add("APR");
        month.add("MAY");
        month.add("JUN");
        month.add("JUL");
        month.add("AUG");
        month.add("SEP");
        month.add("OCT");
        month.add("NOV");
        month.add("DEC");
        panel.add(month);
        
        area=new JTextArea(50,15);
        area.setText("\tGenerate Bill by clicking on the generate bill button");
        area.setFont(new Font("Senserif",Font.BOLD,18));
        JScrollPane pane=new JScrollPane(area);
        JButton b1=new JButton("Generate Bill");
        b1.addActionListener(this);
        panel.add(heading);
        panel.add(meterno);
        panel.add(month);
        add(panel,"North");
        add(pane,"Center");
        add(b1,"South");
        
        
        
        
        
        
//        
        setVisible(true);
    }
         
    
    
    public static void main(String [] args){
        new GenerateBill("");
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        
        try{
           
            String ymonth=month.getSelectedItem();
            Connect c =new Connect();
            area.setText("\t\tGovt. of India Energy Limited \n\t\t Bill for the month of '"+ymonth+"'2024");
            ResultSet rs=c.s.executeQuery("select * from customer where meter_no='"+meter+"'");
            if(rs.next()){
                
                area.append("\n Customer :"+ rs.getString("name"));
                area.append("\n Meterno:"+ rs.getString("meter"));
                area.append("\n Address:"+ rs.getString("address"));
                area.append("\n City:"+ rs.getString("city"));
                area.append("\n State:"+ rs.getString("state"));
                area.append("\n Email:"+ rs.getString("email"));
                area.append("\n Phone:"+ rs.getString("phone"));
       }
             rs=c.s.executeQuery("select * from meter_infromation where meter_no='"+meter+"'");
        
            if(rs.next()){
                
                area.append("\n Location:"+ rs.getString("location"));
                area.append("\n Type:"+ rs.getString("type"));
                area.append("\n Bill:"+ rs.getString("bill"));
                area.append("\n Days:"+ rs.getString("days"));
            
            }
            
             rs=c.s.executeQuery("select * from bill where meter_no='"+meter+"'");
            if(rs.next()){
                
                area.append("\n Month:"+ rs.getString("month"));
                area.append("\n Units:"+ rs.getString("units"));
                area.append("\n Total Bill:"+ rs.getString("total_bill"));
                area.append("\n Status:"+ rs.getString("status"));
                
            }
   
        }
        catch(Exception ae){
            ae.printStackTrace();
            
        }
       
    }
    
}
