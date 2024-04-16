package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame{
    Home(){
        
         //    ---------Creating Panel----------
         
         setTitle("Welcome");
         setSize(1200,800);
         setLocation(180,20);
         
         //   ---------- Background Image ----------
         
         ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/tower.jpg"));
         Image set=background.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(set);
         JLabel image1=new JLabel(i1);
         add(image1);
         
//         --------------- Menu Bar ----------------
          JMenuBar menu=new JMenuBar();
          setJMenuBar(menu);
          setLayout(new FlowLayout ());
           
          JMenu home=new JMenu("Home");
          home.setFont(new Font("mono spaced",Font.BOLD,15));
          ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
          Image set1=img1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          home.setIcon(new ImageIcon(set1));
          home.setForeground(Color.DARK_GRAY);
          menu.add(home);
          
          JMenuItem first=new JMenuItem("New Customer");
          ImageIcon img2=new ImageIcon(ClassLoader.getSystemResource("icons/customer.png"));
          Image set2=img2.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          first.setIcon(new ImageIcon(set2));
          first.setMnemonic('A');
          first.setFont(new Font("mono spaced",Font.PLAIN,12));
          first.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
          home.add(first);
           
          JMenuItem second=new JMenuItem("Customer Details");
          second.setMnemonic('s');
          second.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
          ImageIcon img3=new ImageIcon(ClassLoader.getSystemResource("icons/custd.png"));
          Image set3=img3.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          second.setIcon(new ImageIcon(set3));
          second.setMnemonic('A');
          second.setFont(new Font("mono spaced",Font.PLAIN,12));
          home.add(second);
          
          JMenuItem third=new JMenuItem("Deposit Details");
          third.setMnemonic('s');
          ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("icons/file.png"));
          Image set4=img4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
         
          third.setIcon(new ImageIcon(set4));
          third.setMnemonic('A');
          third.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
          third.setFont(new Font("mono spaced",Font.PLAIN,12));
          home.add(third);
           
          JMenu user=new JMenu("User");
          user.setFont(new Font("mono spaced",Font.BOLD,15));
          user.setForeground(Color.DARK_GRAY);
          menu.add(user);
          
          JMenuItem fourth=new JMenuItem("Pay Bill");
          ImageIcon img5=new ImageIcon(ClassLoader.getSystemResource("icons/pay.png"));
          Image set5=img5.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
          fourth.setIcon(new ImageIcon(set5));
          fourth.setMnemonic('F');
          fourth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
          fourth.setFont(new Font("mono spaced",Font.PLAIN,12));
          user.add(fourth);
          
          JMenuItem fifth=new JMenuItem("Bill Details");
          ImageIcon img6=new ImageIcon(ClassLoader.getSystemResource("icons/bill.png"));
          Image set6=img6.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
          fifth.setIcon(new ImageIcon(set6));
          fifth.setMnemonic('F');
          fifth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
          fifth.setFont(new Font("mono spaced",Font.PLAIN,12));
          user.add(fifth);
         
         
         
         
         setVisible(true);
    }
        
    
    public static void main(String [] args){
        new Home();
    }
}
