package issAssignment;

//importing log4j
import org.apache.logging.log4j.*;


public class Vehicle {
	
	//Create instance of log4j logger.
	private static Logger logger = LogManager.getLogger("Vehicle");
	
	//Declaring and initializing attributes of 'Vehicle'
	String type;	// Whether is a bike or a car
	String brand;	// The brand of the Vehicle
	String model; 	// Model of the vehicle
	String color; 	// Color of the Vehicle
	
	
	//Methods to set the attributes
	public void setType(String type) {
		this.type = type;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//Method to print the attributes
	public void printDetails() {
        logger.info("Vehicle details:");
        logger.info(this.type);
        logger.info(this.brand);
        logger.info(this.model);
        logger.info(this.color);
    }
	
	
}


