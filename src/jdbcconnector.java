import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnector {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/QAdbtest";
		String username = "root";
		String password =  "Manu@1436$";
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		
		Statement s=con.createStatement();
		
		ResultSet rs = s.executeQuery("select * from employeeinfo where name ='Manasa'");
		
		while (rs.next())
		{
			System.out.println(rs.getString("id"));
		}
	
		
	}

}
