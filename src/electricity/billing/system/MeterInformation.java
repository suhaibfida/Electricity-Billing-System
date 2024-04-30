package electricity.billing.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;
public class MeterInformation extends JFrame implements ActionListener{
    Choice text1,text2,text3,text4,text5,text6;
    JButton button1,button2;
    JLabel random;
    String meter;
    
    
    
     MeterInformation (String meter){
        setTitle("Meter Information"); 
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
         
//         ---------- Random no ----------

          
//         HeadLine

         JLabel head=new JLabel("Meter ");
         head.setBounds(220, 70, 500, 40);
         label1.add(head);
         head.setFont(new Font("Magneta",Font.BOLD,25));
         head.setForeground(Color.white);
            
//         --------------Text + Textfield-------------------
          JLabel meter2=new JLabel("Meter No:");
          meter2.setBounds(400, 0, 90, 50);
          meter2.setForeground(Color.white);
          meter2.setFont(new Font("SERIF",Font.BOLD,17));
          label1.add(meter2);
          random=new JLabel(meter);
          random.setBounds(475, 1, 50, 50);
          random.setForeground(Color.white);
          random.setFont(new Font("SERIF",Font.BOLD,16));
          label1.add(random);
        
          random.setForeground(Color.ORANGE);





         JLabel label3=new JLabel("Meter Location:");
         label3.setBounds(90, 158, 150, 25);
         label1.add(label3);
         label3.setFont(new Font("SERIF",Font.BOLD,19));
         label3.setForeground(Color.white);
         text1=new Choice();
         label1.add(text1);
         text1.setBounds(280,159,190,18);
         text1.setBackground(Color.ORANGE);
         text1.add("Outside");
         text1.add("Inside");
         
         JLabel label4=new JLabel("Meter Type");
         label4.setBounds(90, 218, 150, 25);
         label4.setFont(new Font("SERIF",Font.BOLD,19));
         label4.setForeground(Color.white);
         label1.add(label4);
         text2=new Choice();
         text2.setBounds(280,218,190,18);
         label1.add(text2);
         text2.setBackground(Color.ORANGE);
         text2.add("Smart Meter");
         text2.add("Electric Meter");
         text2.add("Solar Meter");
         
         JLabel label5=new JLabel("Phase Code:");
         label5.setBounds(90, 279, 150, 25);
         label1.add(label5);
         label5.setFont(new Font("SERIF",Font.BOLD,19));
         label5.setForeground(Color.white);
         text3=new Choice();
         label1.add(text3);
         text3.setBackground(Color.ORANGE);
         text3.setBounds(280,280,190,18);
         text3.add("011");
         text3.add("022");
         text3.add("033");
         text3.add("044");
         text3.add("055");
         text3.add("066");
         text3.add("077");
         
         JLabel label6=new JLabel("Bill Type:");
         label6.setBounds(90, 341, 150, 25);
         label1.add(label6);
         label6.setFont(new Font("SERIF",Font.BOLD,19));
         label6.setForeground(Color.white);
         text4=new Choice();
         text4.add("Normal");
         text4.add("Industrial");
         text4.setBackground(Color.ORANGE);
         label1.add(text4);
         text4.setBounds(280,341,190,18);
         
         
         JLabel label7=new JLabel("Days:");
         label7.setBounds(90, 400, 150, 25);
         label1.add(label7);
         label7.setFont(new Font("SERIF",Font.BOLD,19));
         label7.setForeground(Color.white);
         JLabel days=new JLabel("30 Days");
         days.setBounds(280, 395, 150, 30);
         label1.add(days);
         days.setFont(new Font("SERIF",Font.BOLD,19));
         days.setForeground(Color.white);
         
         
         
         JLabel label8=new JLabel("Note:");
         label8.setBounds(90, 460, 150, 25);
         label1.add(label8);
         label8.setFont(new Font("SERIF",Font.BOLD,19));
         label8.setForeground(Color.white);
         
         JLabel Note=new JLabel("Bill is calculated for 30 days only.");
         Note.setBounds(280, 455, 300, 30);
         label1.add(Note);
         Note.setFont(new Font("SERIF",Font.BOLD,19));
         Note.setForeground(Color.white);
        
        
//         --------------Buttons-----------------

         
         
         button1=new JButton("SUBMIT");
         button1.setBounds(235, 530, 150, 30);
         button1.setBackground(Color.GRAY);
         button1.setForeground(Color.white);
         button1.setFont(new Font("SAN SERIF",Font.BOLD,19));
         button1.addActionListener(this);
         button1.setBorder(null);
         label1.add(button1);  
         setVisible(true);
         
    }
    public static void main(String[] args){
        new MeterInformation("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
           String met=random.getText();
            String location=text1.getSelectedItem();
            String type=text2.getSelectedItem();
            String billty=text3.getSelectedItem();
            String days="30";
           
            String query1="insert into meter_information values( '"+met+"','"+location+"','"+type+"','"+billty+"','"+days+"')";
            
            try{
                Connect c=new Connect();
                c.s.executeUpdate(query1);
                
                JOptionPane.showMessageDialog(null, "Meter Information Added successfully.");
                setVisible(false);
                
              
            }
            
            catch(Exception ae){
                ae.getStackTrace();
                
            }
        }
      
}}
