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
          
//           ---------------1st Option-----------------

          JMenu home=new JMenu("Home");
          home.setFont(new Font("mono spaced",Font.BOLD,15));
          ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
          Image set1=img1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          home.setIcon(new ImageIcon(set1));
          home.setForeground(Color.BLUE);
          menu.add(home);
          
//          ---------------------------------------

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
          
//          -------------------2nd Option--------------------  

          JMenu user=new JMenu("User");
          user.setFont(new Font("mono spaced",Font.BOLD,15));
          user.setForeground(Color.DARK_GRAY);
          ImageIcon imgu=new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
          Image setu=imgu.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
          user.setIcon(new ImageIcon(setu));
          menu.add(user);
          
//          -------------------------------------
          
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
          fifth.setMnemonic('E');
          fifth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
          fifth.setFont(new Font("mono spaced",Font.PLAIN,12));
          user.add(fifth);
          
//          ------------3rd option-------------------
          
          JMenu statistics=new JMenu("Statistics");
          statistics.setFont(new Font("mono spaced",Font.BOLD,15));
          statistics.setForeground(Color.DARK_GRAY);
          ImageIcon img7=new ImageIcon(ClassLoader.getSystemResource("icons/information.png"));
          Image set7=img7.getImage().getScaledInstance(19, 19, Image.SCALE_DEFAULT);
          statistics.setIcon(new ImageIcon(set7));
          menu.add(statistics);
          
//          --------------------------------------
          
          JMenuItem sixth=new JMenuItem("View Statistics");
          ImageIcon img8=new ImageIcon(ClassLoader.getSystemResource("icons/file.png"));
          Image set8=img8.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          sixth.setIcon(new ImageIcon(set8));
          sixth.setMnemonic('R');
          sixth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
          sixth.setFont(new Font("mono spaced",Font.PLAIN,12));
          statistics.add(sixth);
          
          JMenuItem seventh=new JMenuItem("Update Statistics");
          ImageIcon img9=new ImageIcon(ClassLoader.getSystemResource("icons/notes.png"));
          Image set9=img9.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          seventh.setIcon(new ImageIcon(set9));
          seventh.setMnemonic('G');
          seventh.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
          seventh.setFont(new Font("mono spaced",Font.PLAIN,12));
          statistics.add(seventh);
          
//           --------------4th Option-----------------

          JMenu utility=new JMenu("Utility");
          utility.setFont(new Font("SAN SERIF",Font.BOLD,15));
          utility.setForeground(Color.DARK_GRAY);
          ImageIcon img10=new ImageIcon(ClassLoader.getSystemResource("icons/utilization.png"));
          Image set10=img10.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          utility.setIcon(new ImageIcon(set10));
          menu.add(utility);
          
//          ----------------------------------

          JMenuItem eighth=new JMenuItem("Generate Bill");
          eighth.setFont(new Font("mono spaced",Font.PLAIN,12));
          eighth.setForeground(Color.DARK_GRAY);
          ImageIcon img11=new ImageIcon(ClassLoader.getSystemResource("icons/invoice.png"));
          Image set11=img11.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          eighth.setIcon(new ImageIcon(set11));
          eighth.setMnemonic('Q');
          eighth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
          utility.add(eighth);
          
          JMenuItem ninth=new JMenuItem("Calculator");
          ninth.setFont(new Font("mono spaced",Font.PLAIN,12));
          ninth.setForeground(Color.DARK_GRAY);
          ImageIcon img12=new ImageIcon(ClassLoader.getSystemResource("icons/calculator.png"));
          Image set12=img12.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
          ninth.setIcon(new ImageIcon(set12));
          ninth.setMnemonic('B');
          ninth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
          utility.add(ninth);
        
//          -----------5Th Option------------------

          JMenu exit=new JMenu ("Exit");
          exit.setFont(new Font("SAN SERIF",Font.BOLD,15));
          exit.setForeground(Color.DARK_GRAY);
          ImageIcon img13=new ImageIcon(ClassLoader.getSystemResource("icons/exit.png"));
          Image set13=img13.getImage().getScaledInstance(19, 19, Image.SCALE_DEFAULT);
          exit.setIcon(new ImageIcon(set13));
          menu.add(exit);
          
         setVisible(true);
          
    }
        
    
          public static void main(String [] args){
          new Home();
    }
}
