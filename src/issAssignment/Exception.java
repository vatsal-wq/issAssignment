package issAssignment;

import org.apache.logging.log4j.*;
import java.io.File;
import java.io.FileReader;

public class Exception {
	
	private static final Logger logger = LogManager.getLogger(Exception.class.getName());
	
	
	public static void main(String[] args) {
		

		//Checked Exception
		//On uncommenting the following 2 lines of code; we get FileNotFoundException upon compilation.
		//File file = new File("E://file.txt");
	    //FileReader fr = new FileReader(file); 
		
		//Unchecked Exceptions
		int num[] = {1,2,3,4};
		logger.info(num[5]);
		//here the program compiles without any issues but upon execution we get ArrayIndexOutOfBoundsException
	}

}
