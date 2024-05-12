
package electricity.billing.system;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;


public class BillDetails extends JFrame{
    
    BillDetails(String meter){
        
        setTitle("Bill Details");
        setSize(700,700);
        setLocation(400,50);
        setVisible(true);
        
        JTable table=new JTable();
        
        try{
            Connect c=new Connect();
            ResultSet rs=c.s.executeQuery("select * from bill where meter_no='"+meter+"'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        JScrollPane sc=new JScrollPane(table);
        sc.setBounds(0,0, 700, 650);
        add(sc);
      
    }
  
    public static void main(String [] args){
        new BillDetails("");
    }
    
}
