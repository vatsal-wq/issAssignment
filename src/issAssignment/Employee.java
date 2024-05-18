package issAssignment;

//Instance Variable & Static Variable

import org.apache.logging.log4j.*;

public class Employee {
	
		final Logger logger = LogManager.getLogger(Employee.class.getName());
		
		//department variable is a private static varible
		private static String department = "iss-stoxx";
		
	   // this instance variable is visible for any child class.
	   public String name;

	   // salary  variable is visible in Employee class only.
	   private double salary;

	   // The name variable is assigned in the constructor.
	   public Employee (String empName) {
	      name = empName;
	   }

	   // The salary variable is assigned a value.
	   public void setSalary(double empSal) {
	      salary = empSal;
	   }

	   // This method prints the employee details.
	   public void printEmp() {
	      logger.info(name);
	      logger.info(department);
	      logger.info(salary);
	   }

	   public static void main(String args[]) {
	      Employee empOne = new Employee("Vatsal");
	      empOne.setSalary(5000);
	      empOne.printEmp();
	   }
}
