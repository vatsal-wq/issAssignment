package issAssignment;

import org.apache.logging.log4j.*;

public class LogDemo {
	private static Logger demoLogger = LogManager.getLogger(LogDemo.class.getName());
	public static void main(String[] args) {
		demoLogger.info("test");
	}

}
