package issAssignment;

import org.apache.logging.log4j.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
	
	private static final Logger logger = LogManager.getLogger(ExceptionHierarchy.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			readFile("file.txt");//File does not exist
		}catch(FileNotFoundException e){
			logger.warn("Caught Exception: "+e.getMessage());
		}

	}
	
	//throws declares that a method can throw exceptions.
	public static void readFile(String file_name) throws FileNotFoundException {
		File file = new File(file_name);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			logger.info(scanner.nextLine());
		}
		scanner.close();
	}

}
