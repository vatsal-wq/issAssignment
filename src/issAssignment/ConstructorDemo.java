package issAssignment;
//creating a similar program to Vehicle.java to show-case constructors and overloading

import org.apache.logging.log4j.*;


class Vehicle2 {
	
	private static final Logger logger = LogManager.getLogger(ConstructorDemo.class.getName());
	
	String brand,model, color;
	
	//no-args constructor
	Vehicle2(){
		this.brand = "NaN";
		this.model = "NaN";
		this.color = "NaN";
		logger.info("Vehicle with no info provided");
	}
	
	//one parameter
	Vehicle2(String brand){
		this.brand = brand;
		this.model = "NaN";
		this.color = "NaN";
		logger.info("Vehicle with only brand provided");
	}
	
	//two parameters
	Vehicle2(String brand, String model){
		this.brand = brand;
		this.model = model;
		this.color = "NaN";
		logger.info("Vehicle with brand & model provided");
	}
	
	//all parameters
	Vehicle2(String brand, String model, String color){
		this.brand = brand;
		this.model = model;
		this.color = color;
		logger.info("Vehicle with brand & model & color provided");
	}
	
	public void printDetails() {
        logger.info("Vehicle Details: Brand = {}, Model = {}, Color = {}", this.brand, this.model, this.color);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Create instances of Vehicle using different constructors
        Vehicle2 veh1 = new Vehicle2(); // invokes no-args constructor
        Vehicle2 veh2 = new Vehicle2("Toyota"); // invokes one parameter constructor
        Vehicle2 veh3 = new Vehicle2("Honda", "Civic"); // invokes two parameter constructor
        Vehicle2 veh4 = new Vehicle2("Ford", "Mustang", "Ded"); // invokes three parameter constructor

        // Printing details using logger
        veh1.printDetails();
        veh2.printDetails();
        veh3.printDetails();
        veh4.printDetails();
    }
}