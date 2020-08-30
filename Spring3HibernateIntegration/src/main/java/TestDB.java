import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class TestDB {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		try
		{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=indhu";
		String user = "sample";
		String password = "sample";

		// Load the Connector/J driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		// Establish connection to MySQL
		Connection conn = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
