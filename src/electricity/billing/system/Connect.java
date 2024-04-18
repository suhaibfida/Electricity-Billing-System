
package electricity.billing.system;
import java.sql.*;



public class Connect {
    
    Connection c;
    Statement s;
   Connect(){
//        ---------- 1) First register the driver -----------
//        ---------- 2) Create Connection         -----------
//        ---------- 3) Create Statement          -----------
//        ---------- 2) Execute mysql queries     -----------
        try{
            
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/EBS","root","keyboardmouse");
           s= c.createStatement();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }





    }
    public static void main(String [] args){
        new Connect();
    } 
    
    
}
