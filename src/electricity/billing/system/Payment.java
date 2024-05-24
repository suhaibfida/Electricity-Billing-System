
package electricity.billing.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {
    JButton back;
    String meter;
    Payment(String meter){
        this.meter=meter;
        setTitle("Payment");
        setSize(500,700);
        setLocation(200,10);
        
        JEditorPane panel= new JEditorPane();
        panel.setEditable(false);
        
        try{
            panel.setPage("https://paytm.com/online-payments");
        }
        catch(Exception e){
            panel.setContentType("text/html");
            panel.setText("<html>Error<html>");
        }
       
        back=new JButton("Back");
        back.setBounds(500, 70, 120, 25);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("SAN SERIF",Font.BOLD,16));
        back.addActionListener(this);
        back.setBorder(null);
        panel.add(back);
        
        setVisible(true);
    }
    
    public static void main(String [] args){
        new Payment("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new PayBill(meter);
        }

    }
    
}
