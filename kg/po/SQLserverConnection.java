package po;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SQLserverConnection {
/**
* @param args
*/
	@Test
	public SQLserverConnection() throws ClassNotFoundException, SQLException {

	String dburl = "jdbc:sqlserver://vm-customdev/Kidzandgo_test";
	String uname = "Kidzandgo_dev_user";
	String pass = "Kidzandgo_dev_user";
	String query = "select * from users order by id desc"; 
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con = DriverManager.getConnection(dburl, uname, pass);
       Statement stmt = con.createStatement();
   ResultSet rs = stmt.executeQuery(query);
    while(rs.next()){
        String id=rs.getString("id");
        System.out.println(id);
       }
    con.close();
   }

   
}