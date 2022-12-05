package defult;


import com.mysql.jdbc.Connection;
 
import java.sql.DriverManager;  




public class DBconnect {
    
    
//    public static Connection connect()
//    {
//        Connection con =null;
//        try {
//            String url ="jdbc:mysql://localhost:3306/studentmanagement";
//            String username = "root";
//             String password = "";
//            con = (Connection) DriverManager.getConnection(url, username, password);
//            if (con != null) 
//            {
//                System.out.println("Successfully connected to MySQL database test");
//            
//            }
//            
//            
//            
//          //  Class.forName("com.mysql.jdbc.Driver");
//           // con =DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
//        } 
//        
//        
//        catch (Exception e) {
//        }
//        System.out.println("An error occurred while connecting MySQL databse");
//        
//        return con;
//    }
//    
    
    
    
    
    
    
    
    
    public static Connection connect()
    {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
               
                System.out.println("Successfully connected to MySQL database");
                return con;
                  }
            
      catch (Exception e) {
       
          System.out.println(e);
          System.out.println("Error connecting MySQL databse ");
          return null;
        
                }
            
    }//Connect methord
   
    
}
