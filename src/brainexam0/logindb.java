package brainexam0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
 
public class logindb {
	String id = null;
    String pw = null;
 
    Statement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost/user?serverTimezone=Asia/Seoul"; 
    String sql = null;
    Properties info = null;
    Connection con = null;
 
    int checkIDPW(String id, String pw) {
        this.id = id;
        this.pw = pw;
        int result = 1;
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 알아서 들어간다..conn로
            con = DriverManager.getConnection(url, "root","adminroo"); // 연결할 정보를 가지고있는 드라이버매니저를 던진다
            stmt = con.createStatement();
 
            sql = "select * from userdb where id='" + id + "'";
            rs = stmt.executeQuery(sql); // 읽어오는거라 다르다 비교해    //리턴타입이 ResultSet
 
            if (rs.next() == false || (id.isEmpty()) == true) { // id가 존재x
                result = 1;
            } else {
                sql = "select * from (select * from userdb where id='" + id + "')A;";
                rs = stmt.executeQuery(sql);
                while (rs.next() == true) {         // 다음값의
                    if (rs.getString(2).equals(pw)) { // pw와 같은지 비교
                        result = 0;         // 같으면 로그인 성공
                    } else {                // 아이디는같고 pw가 다른경우
                        result = 1;
                    }
                }
            }
        } catch (Exception ee) {
            System.out.println("문제있음");
            ee.printStackTrace();
        }
        return result;
    }
}
