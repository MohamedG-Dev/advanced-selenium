package learning.databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivityDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "databasetesting";
		String dBURL = url + dbName;
		String userName = "root";
		String password = "Osama@0810";
		// Create an object for Mysql JDBC driver class
		// deprecated driver class line 19
		// String driver = "com.mysql.jdbc.Driver";
		// latest driver class - line 21
		String driver = "com.mysql.cj.jdbc.Driver";

		Connection connection = null;
		try {
			Class.forName(driver);
			// Connect to Mysql database system.
			connection = DriverManager.getConnection(dBURL, userName, password);
			if (!connection.isClosed()) {
				System.out.println("Successfully Connected to the " + dbName + " database...");
				// Create a statement
				Statement statement = connection.createStatement();
				// Execute the query to retrieve the information
				ResultSet result = statement.executeQuery("select * from Employee;");

				while (result.next()) {
					System.out.println(result.getString("EmployeeID") + "---" + result.getString("Name") + "---"
							+ result.getString("Location") + "---" + result.getString("Experience"));
				}
				
				//Create a PreparedStatment to retrieve the filtere records from the Employee Table records
				System.out.println("==========Result for Prepared statment=========");
				PreparedStatement preparedStatement = connection.prepareStatement("select * from Employee where Location=? and Experience=?;");
				preparedStatement.setString(1, "New York");
				preparedStatement.setInt(2, 12);
				ResultSet result2 = preparedStatement.executeQuery();
				while(result2.next()) {
					System.out.println(result2.getString("EmployeeID") + "---" + result2.getString("Name") + "---"
							+ result2.getString("Location") + "---" + result2.getString("Experience"));
				}
			} else {
				System.out.println("Connection Failed!!!!!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (connection.isClosed()) {
					System.out.println("Successfully Closed the connection to the database");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
