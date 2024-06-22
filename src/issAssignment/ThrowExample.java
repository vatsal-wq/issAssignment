package issAssignment;
import org.apache.logging.log4j.*;


public class ThrowExample {
	
	private static final Logger logger = LogManager.getLogger(ExceptionHierarchy.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			checkAge(15);
		} catch(IllegalArgumentException e){
			logger.warn("CAught an exception: "+e.getMessage() );
		}
	}
	
	public static void checkAge(int age){
		if (age < 18){
			//throw is used to explicitly throw an exception. It creates and instance of the 'throwable' class; IllegalArgumentException in this case.
			throw new IllegalArgumentException("Must be atleast 18");
		}
		else {
			logger.info("Age is valid");
		}
	}

}
