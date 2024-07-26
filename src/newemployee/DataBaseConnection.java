package newemployee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection 
{
   public static Connection conn() throws SQLException
   {
	   String url="jdbc:mysql://localhost:3306/newemp";
	   String username="root";
	   String password="jelsiya*2004";
	   Connection conn=DriverManager.getConnection(url,username,password);
	   return conn;
   }
}
