package issAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.logging.log4j.*;

public class ExceptionHierarchy {
	
	private static final Logger logger = LogManager.getLogger(ExceptionHierarchy.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example of catching a RuntimeException (unchecked exception)
        try {
            int result = 10/0;
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
        	logger.info("Caught ArithmeticException: " + e.getMessage());
        }


        // Example of catching multiple exceptions with hierarchy
        try {
            int[] arr = new int[5];
            logger.info(arr[10]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
        	logger.info("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
        	logger.info("Caught IndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
        	logger.info("Caught RuntimeException: " + e.getMessage());
        } finally {
        	logger.info("This is the finally block, always executed.");
        }
    }

 
}


