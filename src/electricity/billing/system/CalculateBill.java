package electricity.billing.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
public class CalculateBill extends JFrame {
   Choice text0;
    JLabel  text1,text2,text3,text4,text5,text6;
    JButton button1,button2;
    JLabel random;
    String meter;
    
    CalculateBill (String meter){
        setTitle("Calculate Bill");
        setLocation(480,50);
        setSize(600,650);
        this.meter=meter;
  
//        ------------- Background ---------------

        ImageIcon back=new ImageIcon(ClassLoader.getSystemResource("icons/d.jpg"));
        Image set1=back.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon scback=new ImageIcon(set1);
        JLabel label1=new JLabel(scback);
        add(label1);
        
//         ---------- Icon ------------

         ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/idea.png"));
         Image set2=icon.getImage().getScaledInstance(54, 54,Image.SCALE_DEFAULT);
         ImageIcon i2=new ImageIcon(set2);
         JLabel label2=new JLabel(i2);
         label2.setBounds(10, 11, 50, 50);
         label1.add(label2);
         JLabel logotext=new JLabel("FBS");
         logotext.setBounds(62, 14, 80, 40);
         logotext.setFont(new Font("SAN SERIF",Font.BOLD,23));
         logotext.setForeground(Color.white);
         label1.add(logotext);
    
//         HeadLine

         JLabel head=new JLabel("Calculate Bill ");
         head.setBounds(220, 70, 500, 40);
         label1.add(head);
         head.setFont(new Font("Magneta",Font.BOLD,25));
         head.setForeground(Color.white);
            
//         -------------- Text -------------------

          JLabel meter2=new JLabel("Meter No:");
          meter2.setBounds(270, 0, 90, 50);
          meter2.setForeground(Color.white);
          meter2.setFont(new Font("SERIF",Font.BOLD,17));
          label1.add(meter2);
          text0=new Choice();
         
         try{
             Connect c=new Connect();
             ResultSet rs=(ResultSet) c.s.executeQuery("select * from customer");
             while(rs.next()){
                 text0.add(rs.getString("meter"));
             }
            
         }
         catch(Exception e){
             e.printStackTrace();
             
         }
         text0.setBounds(370,15,200,50);
         text0.setBackground(Color.ORANGE);
         label1.add(text0);
         label1.add(text0);
         
         JLabel label3=new JLabel("Name:");
         label3.setBounds(90, 158, 150, 25);
         label1.add(label3);
         label3.setFont(new Font("SERIF",Font.BOLD,19));
         label3.setForeground(Color.white);
         text1=new JLabel();
          text1.setFont(new Font("SERIF",Font.BOLD,17));
         label1.add(text1);
         text1.setBounds(280,159,190,18);
         text1.setForeground(Color.GREEN);
         
         
         JLabel label4=new JLabel("Address");
         label4.setBounds(90, 218, 150, 25);
         label4.setFont(new Font("SERIF",Font.BOLD,19));
         label4.setForeground(Color.white);
         label1.add(label4);
         text2=new JLabel();
         text2.setBounds(280,218,190,18);
          text2.setFont(new Font("SERIF",Font.BOLD,30));
         label1.add(text2);
         text2.setForeground(Color.GREEN);
       
           try{
             Connect c=new Connect();
             ResultSet set=c.s.executeQuery("select * from customer where meter='"+text0.getSelectedItem()+"'");
             while(set.next()){
                 text1.setText(set.getString("name"));
                 text2.setText(set.getString("address"));
   
             }
         }
         catch(Exception e){
             e.printStackTrace();
             
         }
           
            text0.addItemListener(new ItemListener(){
             @Override
            public void itemStateChanged(ItemEvent e) {
                       try{
             Connect c=new Connect();
             ResultSet set=c.s.executeQuery("select * from customer where meter='"+text0.getSelectedItem()+"'");
             while(set.next()){
                 text1.setText(set.getString("name"));
                text1.setText(set.getString("address"));
   
             }
         }
         catch(Exception ae){
             ae.printStackTrace();
             
         }
             
             
         
            }
        });
         
         JLabel label5=new JLabel("Units Consumed:");
         label5.setBounds(90, 279, 150, 25);
         label1.add(label5);
         label5.setFont(new Font("SERIF",Font.BOLD,19));
         label5.setForeground(Color.white);
         text3=new JLabel();
         label1.add(text3);
         text3.setBackground(Color.ORANGE);
         text3.setBounds(280,280,190,18);
      
         
        
       
       

          
         
         JLabel label6=new JLabel("Month:");
         label6.setBounds(90, 341, 150, 25);
         label1.add(label6);
         label6.setFont(new Font("SERIF",Font.BOLD,19));
         label6.setForeground(Color.white);
         text4=new JLabel();
         
         text4.setBackground(Color.ORANGE);
         label1.add(text4);
         text4.setBounds(280,341,190,18);
         
         
       
        
        
//         --------------Buttons-----------------

         
         
         button1=new JButton("SUBMIT");
         button1.setBounds(235, 530, 150, 30);
         button1.setBackground(Color.GRAY);
         button1.setForeground(Color.white);
         button1.setFont(new Font("SAN SERIF",Font.BOLD,19));
//         button1.addActionListener(this);
         button1.setBorder(null);
         label1.add(button1);  
         setVisible(true);
         
         
         
           button2=new JButton("SUBMIT");
         button2.setBounds(220, 530, 150, 30);
         button2.setBackground(Color.GRAY);
         button2.setForeground(Color.white);
         button2.setFont(new Font("SAN SERIF",Font.BOLD,19));
//         button2.addActionListener(this);
         button2.setBorder(null);
         label1.add(button2);  
         setVisible(true);
         
    }
    public static void main(String[] args){
        new CalculateBill("");
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button1){
//           String met=random.getText();
//            String location=text1.getSelectedItem();
//            String type=text2.getSelectedItem();
//            String billty=text3.getSelectedItem();
//            String days="30";
//           
//            String query1="insert into meter_information values( '"+met+"','"+location+"','"+type+"','"+billty+"','"+days+"')";
//            
//            try{
//                Connect c=new Connect();
//                c.s.executeUpdate(query1);
//                
//                JOptionPane.showMessageDialog(null, "Meter Information Added successfully.");
//                setVisible(false);
//                       
//            }
//            
//            catch(Exception ae){
//                ae.getStackTrace();
//                
//            }
//        }
//      
//}
}
