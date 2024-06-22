package issAssignment;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maps {
	
	private static final Logger logger = LogManager.getLogger(Maps.class.getName());
	
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        // Add elements to the map
        studentMap.put(1, new Student("Virat", 1));
        studentMap.put(2, new Student("Rohit", 2));
        studentMap.put(3, new Student("Rishabh", 3));

        // Access elements
        logger.info("Map elements:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            logger.info("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Get the size of the map
        logger.info("Map size brefore removal: " + studentMap.size());
        
        // Remove an element
        studentMap.remove(2); // Remove the student with key 2 (Rohit)

        // Get the size of the map
        logger.info("Map size after removal: " + studentMap.size());
    }
}
