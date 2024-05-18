package issAssignment;

import org.apache.logging.log4j.*;


public class AccessModifiers {
	final Logger lgr = LogManager.getLogger(AccessModifiers.class.getName());
	
	// default/no modifier allows function to be accessed anywhere withing same package
	int testFunction() {
		return 5;
	}
	
	int b = testFunction();
	lgr.info(b);
	System.out.println(b);
}
