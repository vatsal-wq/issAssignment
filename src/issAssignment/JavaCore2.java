package issAssignment;

import org.apache.logging.log4j.*;

public class JavaCore2 {
	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(JavaCore2.class.getName());
		
		//some data types explored
		int num1 = 5,num2 = 10 ;
		boolean boolVal = true;
		float floatNum = 234.5f; 
		char character = 'A';
		
		logger.info(num1+num2);
		logger.info(boolVal);
		logger.info(floatNum);
		logger.info(character);
		
		//variable types
		int a,b,c; //DECLARES 3 int variables a,b,c
		int d = 17; //Example of INITIALIZATION
		
	}
	

	public void calculateSum(int n1, int n2) {
		int sum = n1+n2; // here sum is a local variable which can only be accessed within this method block.
		System.out.println(sum);
	}
	
}
