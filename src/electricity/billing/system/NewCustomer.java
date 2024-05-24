 package electricity.billing.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;
public class NewCustomer extends JFrame implements ActionListener{
    JTextField text1,text2,text3,text4,text5,text6;
    JButton button1,button2;
    JLabel random;
   
    NewCustomer (){
        setTitle("New Customer");
        setLocation(480,70);
        setSize(600,650);
  
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

          JLabel meter=new JLabel("Meter No:");
          meter.setBounds(400, 0, 90, 50);
          meter.setForeground(Color.white);
          meter.setFont(new Font("SERIF",Font.BOLD,17));
          label1.add(meter);
          random=new JLabel("");
          random.setBounds(475, 1, 50, 50);
          random.setForeground(Color.white);
          random.setFont(new Font("SERIF",Font.BOLD,16));
          label1.add(random);
          Random r=new Random();
          long l=(r.nextLong()%1000000)+1000;
          random.setText(Math.abs(l)+"");
          random.setForeground(Color.ORANGE);
         
//         HeadLine

         JLabel head=new JLabel("⚡ New Customer ⚡ ");
         head.setBounds(185, 70, 500, 40);
         label1.add(head);
         head.setFont(new Font("Magneta",Font.BOLD,23));
         head.setForeground(Color.white);
            
//         --------------Text + Textfield-------------------

         JLabel label3=new JLabel("Customer Name:");
         label3.setBounds(90, 158, 150, 20);
         label1.add(label3);
         label3.setFont(new Font("SERIF",Font.BOLD,19));
         label3.setForeground(Color.white);
         text1=new JTextField();
         label1.add(text1);
         text1.setBounds(280,159,190,18);
         text1.setBorder(null);
         
         JLabel label4=new JLabel("Address:");
         label4.setBounds(90, 218, 150, 20);
         label4.setFont(new Font("SERIF",Font.BOLD,19));
         label4.setForeground(Color.white);
         label1.add(label4);
         text2=new JTextField();
         text2.setBounds(280,218,190,18);
         text2.setBorder(null);
         label1.add(text2);
         
         JLabel label5=new JLabel("City:");
         label5.setBounds(90, 279, 150, 20);
         label1.add(label5);
         label5.setFont(new Font("SERIF",Font.BOLD,19));
         label5.setForeground(Color.white);
         text3=new JTextField();
         label1.add(text3);
         text3.setBounds(280,280,190,18);
         text3.setBorder(null);
         
         JLabel label6=new JLabel("State:");
         label6.setBounds(90, 341, 150, 20);
         label1.add(label6);
         label6.setFont(new Font("SERIF",Font.BOLD,19));
         label6.setForeground(Color.white);
         text4=new JTextField();
         label1.add(text4);
         text4.setBounds(280,341,190,18);
         text4.setBorder(null);
         
         JLabel label7=new JLabel("E-mail:");
         label7.setBounds(90, 400, 150, 20);
         label1.add(label7);
         label7.setFont(new Font("SERIF",Font.BOLD,19));
         label7.setForeground(Color.white);
         text5=new JPasswordField();
         label1.add(text5);
         text5.setBounds(280,400,190,18);
         text5.setBorder(null);
         
         JLabel label8=new JLabel("Phone No:");
         label8.setBounds(90, 460, 150, 20);
         label1.add(label8);
         label8.setFont(new Font("SERIF",Font.BOLD,19));
         label8.setForeground(Color.white);
         text6=new JPasswordField();
         label1.add(text6);
         text6.setBounds(280,460,190,18);
         text6.setBorder(null);
        
//         --------------Buttons-----------------

         button1=new JButton("Back");
         button1.setBounds(155, 530, 120, 25);
         button1.setBackground(Color.GRAY);
         button1.setForeground(Color.WHITE);
         button1.setFont(new Font("SAN SERIF",Font.BOLD,16));
         button1.addActionListener(this);
         button1.setBorder(null);
         label1.add(button1);
         
         button2=new JButton("Next");
         button2.setBounds(295, 530, 120, 25);
         button2.setBackground(Color.orange);
         button2.setForeground(Color.DARK_GRAY);
         button2.setFont(new Font("SAN SERIF",Font.BOLD,16));
         button2.addActionListener(this);
         button2.setBorder(null);
         label1.add(button2);  
         setVisible(true);
         
    }
    public static void main(String[] args){
        new NewCustomer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2){
           String met=random.getText();
            String name=text1.getText();
            String address=text2.getText();
            String city=text3.getText();
            String state=text4.getText();
            String email=text5.getText();
            String phone=text5.getText();
            String query1="insert into customer values( '"+met+"','"+name+"','"+address+"','"+city+"','"+state+"','"+email+"','"+phone+"')";
            String query2="insert  into login values('"+met+"','','"+name+"','','')";
            try{
                Connect c=new Connect();
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Added successfully.");
                setVisible(false);
                  new MeterInformation(met);
                
            }
            
            catch(Exception ae){
                ae.getStackTrace();
                
            }
        }
      
}}
