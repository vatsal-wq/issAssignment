package issAssignment;

import org.apache.logging.log4j.*;

public class AMTest {
	
	private static final Logger logger = LogManager.getLogger(AMTest.class.getName());
    public static void main(String[] args) {
        // Create an instance of AccessModifiers
        AccessModifiers am = new AccessModifiers();
        
        // Accessing public variable
        logger.info(am.publicVar);
        
        // Accessing protected variable
        logger.info(am.protectedVar);
        
        // Accessing default variable
        logger.info( am.defaultVar);
        
        // Accessing private variable via getter method
        logger.info(am.getPrivateVar());
        
        // Uncommenting the following line will cause a compilation error
        // because privateVar is private in AccessModifiers
        // System.out.println("Private Variable: " + am.privateVar);
    }
}
