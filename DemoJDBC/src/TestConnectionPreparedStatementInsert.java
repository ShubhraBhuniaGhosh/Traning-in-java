import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*import java.sql.*;
 * this package contain api which helps us to talk to underlying Database
 */
public class TestConnectionPreparedStatementInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		/*Steps
		 * 1. load the driver
		 * 2. obtain the connection
		 * 3. obtain the statement object
		 * 4. fire the query
		 * 5. Fetch the result
		 * 6. Display the result
		 * 7. Close the resources
		 */
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		/* com.mysql.jdbc - package
		 * Driver  - class
		 * Class.forName("Fully qualified driver class name");
		 * forName is static method of class Class 
		 * Fully qualified driver class name given by database vendors for connecting to that database
		 * talking to different database this class name would change
		 * class name is given by vender only
		 */
		
		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emppayroll","root","root");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("connection established");
		System.out.println("---------------------------------------------------------------------");

		/* Connection con = DriverManager.getConnection("JDBCURL","DBUSERNAME","DBPASSWORD");
		 * Connection is an interface
		 * DriverManager is a factory type class
		 * JDBC URL syntax is - jdbc:dbname://IP_of_database_server:port_of_database/schema_name
		 * For us-jdbc:mysql://localhost:3306/emppayroll
		 * DB USERNAME - root
		 *(may not be always root)
		 *DB PASSWORD - root
		 *(may not be always root)
		 * 
		 */
		
		//step 3
//		Statement stmt = con.createStatement();
		/* non static method*/
		/*
		 * it is recommended to use PreparedStatement not statement
		 */
		PreparedStatement stmt = con.prepareStatement("INSERT INTO tbl_emp VALUES (?,?,?,?)");
		stmt.setInt(1, 7);
		stmt.setString(2, "Stuti");
		stmt.setInt(3, 1000);
		stmt.setInt(4, 1);
		/* the  numbers 1, 2, 3, 4 has nothing to do with the column in the real table but it actually the position of ?*/
		
		//step 4
//		ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_emp");
		int recordUpdated = stmt.executeUpdate();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("done");
		System.out.println("---------------------------------------------------------------------");

		/*		ResultSet rs = stmt.executeQuery("SQL QUERY");
		 * this method returns ResultSet
		 */
		// step 5
		System.out.println("no of rows updated: "+recordUpdated);
		// step 7
		stmt.close();
		con.close();
	
	}
}
