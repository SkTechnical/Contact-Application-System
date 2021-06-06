import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Titesh
 */

public class MyConnection {
    
     public static Connection ConnectDB(){ 
        
         Connection conn  =null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_application","root","");
             
                     
         }catch (ClassNotFoundException ex){
             System.out.println(ex.getMessage());
             
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        return conn;
    
    }
}

