
import org.apache.logging.log4j.*;

import java.sql.*;

public class Statements{
	private static final Logger logger = LogManager.getLogger(Statements.class.getName());
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/company";
    private static final String USER = "root";
    private static final String PASS = "root@password";
    		
	public static void main(String args[]){
		Connection conn = null;
		CallableStatement call_statement = null;
		PreparedStatement prep_statement = null;
		ResultSet call_rs = null;
		ResultSet prep_rs = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL,USER, PASS);
			
			
			String call_sql = "{CALL GetEmployeeDetailsByDept(?)}";
			call_statement = conn.prepareCall(call_sql);
			call_statement.setInt(1, 3);
			
			call_rs = call_statement.executeQuery();
			
			while (call_rs.next()){
				logger.info("Employee ID: " + call_rs.getInt("employee_id"));
				logger.info("Name: " + call_rs.getString("first_name") + " " + call_rs.getString("last_name"));
				logger.info("Email: " + call_rs.getString("email"));
				logger.info("Department ID: " + call_rs.getInt("department_id"));
			}
			
			String pre_sql = "SELECT * FROM employees WHERE department_id = ?";
			prep_statement = conn.prepareStatement(pre_sql);
			prep_statement.setInt(1, 3); // Set parameter 
			
			prep_rs = prep_statement.executeQuery();
			
			while (prep_rs.next()) {
				logger.info("Employee ID: " + prep_rs.getInt("employee_id"));
				logger.info("Name: " + prep_rs.getString("first_name") + " " + prep_rs.getString("last_name"));
				logger.info("Email: " + prep_rs.getString("email"));
				logger.info("Department ID: " + prep_rs.getInt("department_id"));
                
            }
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				if (call_rs != null) call_rs.close();
				if (prep_rs != null) prep_rs.close();
				if (call_statement != null) call_statement.close();
				if (prep_statement != null) prep_statement.close();
				if (conn != null) conn.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}
