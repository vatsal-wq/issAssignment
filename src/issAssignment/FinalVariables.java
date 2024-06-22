package issAssignment;

import org.apache.logging.log4j.*;

public class FinalVariables {
	
	private static final Logger logger = LogManager.getLogger(FinalVariables.class.getName());
    // Constant variable
    public static final double pi = 3.14159;

    // Instance variable
    private final int id;

    // Constructor to initialize the final instance variable
    public FinalVariables(int id) {
        this.id = id;
    }

    public void display() {
        logger.info(id);
    }

    public static void main(String[] args) {
        FinalVariables obj1 = new FinalVariables(1);
        obj1.display();

        // Uncommenting the following line will cause a compilation error
//         obj1.id = 2;

        logger.info("PI: " + pi);
    }
}

