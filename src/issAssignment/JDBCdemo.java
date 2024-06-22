package issAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.*;

public class JDBCdemo {
	private static final Logger logger = LogManager.getLogger(JDBCdemo.class.getName());
	
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/issTestDB";
        String user = "root";
        String password = "root@password";

        // JDBC variables for opening and managing connection
        Connection connection = null;
        Statement statement = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(url, user, password);

            // Execute a query
            statement = connection.createStatement();
            String sql = "SELECT id, name, email FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            // Extract data from result set
            while (resultSet.next()) {
                // Retrieve by column name
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                // Display values
                logger.info("ID: " + id + ", Name: " + name + ", Email: " + email);
                
            }
            
            //insert values
            String nameToInsert = "Steve Jobs";
            String emailToInsert = "jobs.steve@apple.com";
            
            String sql_command = "insert into users (name,email) value ('"+nameToInsert+"','"+emailToInsert+"');";
            logger.info(sql_command);
             statement.execute(sql_command);
            
            ResultSet resultSet2 = statement.executeQuery(sql);
            while (resultSet2.next()) {
                // Retrieve by column name
                int id = resultSet2.getInt("id");
                String name = resultSet2.getString("name");
                String email = resultSet2.getString("email");

                // Display values
                logger.info("ID: " + id + ", Name: " + name + ", Email: " + email);
                
            }
            

            // Clean-up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (ClassNotFoundException e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (statement != null) statement.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
