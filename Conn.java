package travel.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        //JDBC connectivity
        //1.connection of mysql driver(initialise)
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.Establishing the connectivity
//              c=DriverManager.getConnection("jdbc:mysql://localhost:3306/");
            c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Santosh@529");
            //3.creating the statement
            s=c.createStatement();
            //4.establshing the connectivity 
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }
}
