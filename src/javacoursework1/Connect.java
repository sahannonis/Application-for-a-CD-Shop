package javacoursework1;
import java.sql.*;
/**
 *
 * @author Sahan
 */
public class Connect {
   
    Connection con=null;
    
       public static Connection ConnectDB(){
           try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost/newcdshops","root","");
               System.out.println("Database Connected");
               return con;          
           }
           catch(Exception e){
               System.out.println("Database Not Connected");
               return null;
           }
       }
}


