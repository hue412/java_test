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
            Class.forName("com.mysql.cj.jdbc.Driver"); // �˾Ƽ� ����..conn��
            con = DriverManager.getConnection(url, "root","adminroo"); // ������ ������ �������ִ� ����̹��Ŵ����� ������
            stmt = con.createStatement();
 
            sql = "select * from userdb where id='" + id + "'";
            rs = stmt.executeQuery(sql); // �о���°Ŷ� �ٸ��� ����    //����Ÿ���� ResultSet
 
            if (rs.next() == false || (id.isEmpty()) == true) { // id�� ����x
                result = 1;
            } else {
                sql = "select * from (select * from userdb where id='" + id + "')A;";
                rs = stmt.executeQuery(sql);
                while (rs.next() == true) {         // ��������
                    if (rs.getString(2).equals(pw)) { // pw�� ������ ��
                        result = 0;         // ������ �α��� ����
                    } else {                // ���̵�°��� pw�� �ٸ����
                        result = 1;
                    }
                }
            }
        } catch (Exception ee) {
            System.out.println("��������");
            ee.printStackTrace();
        }
        return result;
    }
}
