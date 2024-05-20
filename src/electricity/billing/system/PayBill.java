
package electricity.billing.system;
import java.awt.*;
import javax.swing.*;
public class PayBill extends JFrame {
    
    PayBill(){
        
        setTitle("Pay Bill");
        setSize(800,700);
        setLocation(350,10);
        
       setLayout(null);
        JLabel label0=new JLabel("Electricity Bill");
        label0.setBounds(300, 50, 100, 50);
        add(label0);
        
        JLabel label1=new JLabel("Meter Number");
        label1.setBounds(10, 150, 100, 10);
        add(label1);
        
        
        JLabel label2=new JLabel("Name");
        label2.setBounds(10, 240, 100, 10);
        add(label2);
        
        JLabel label3=new JLabel("Month");
        label3.setBounds(10, 290, 50, 50);
        add(label3);
//        
        
        JLabel label4=new JLabel("Units");
        label4.setBounds(10, 350, 100, 50);
        add(label4);
        
        
         JLabel label5=new JLabel("Total Bill");
        label5.setBounds(10, 410, 100, 50);
        add(label5);
        
         JLabel label6=new JLabel("Status");
        label6.setBounds(10, 470, 100, 50);
        add(label6);
        
        
        
        
        
        
        setVisible(true);
        
    }
    
    
    public static void main(String [] args){
        new PayBill();
    }
    
}
