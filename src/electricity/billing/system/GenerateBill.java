
package electricity.billing.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

import java.awt.event.ActionListener;


public class GenerateBill extends JFrame implements ActionListener {
    String meter;
    
    GenerateBill(String meter){
        
        this.meter=meter;
        setTitle("Generate Bill");
        setSize(700,800);
        setLocation(200,10);
        setLayout(new BorderLayout());
        JLabel heading =new JLabel("Generate Bill");
        add(heading);
        JLabel meterno=new JLabel(meter);
        
        
        
        
//        
        setVisible(true);
    }
         
    
    
    public static void main(String [] args){
        new GenerateBill("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
