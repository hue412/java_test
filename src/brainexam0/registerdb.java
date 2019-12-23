package brainexam0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class registerdb {
     
    public static void main(String[] args) {
         
        Connection conn = null;
         
        try {
            String url = "jdbc:mysql://localhost/user?serverTimezone=Asia/Seoul";
             
            conn = DriverManager.getConnection(url, "root", "adminroo");
            System.out.println(conn.toString());
            System.out.println("접속 완료");
 
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}