package issAssignment;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sets {
	
	private static final Logger logger = LogManager.getLogger(Sets.class.getName());
	
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        // Add elements to the set
        studentSet.add(new Student("Virat", 1));
        studentSet.add(new Student("Rohit", 2));
        studentSet.add(new Student("Rishabh", 3));
        studentSet.add(new Student("Virat", 1)); // Duplicate, will not be added

        // Access elements
        
        for (Student student : studentSet) {
            logger.info(student);
        }
        
        // Get the size of the set
        logger.info("Set size before removal: " + studentSet.size());
        
        // Remove an element
        studentSet.remove(new Student("Rohit", 2));

        // Get the size of the set
        logger.info("Set size after removal: " + studentSet.size());
    }
}
