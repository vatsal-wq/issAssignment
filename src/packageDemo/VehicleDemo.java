package packageDemo;

import org.apache.logging.log4j.*;
import packageDemoInterface.Bike;
import packageDemoInterface.Car;
import packageDemoInterface.VehicleInterface;


public class VehicleDemo {
	
	private static final Logger logger = LogManager.getLogger(VehicleDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInterface myCar = new Car("Porsche GT3 RS");
		VehicleInterface myBike = new Bike("Honda CBR1000RR-R");
		
		logger.info("Car model:"+(((Car) myCar).getModel()));
		myCar.start();
		myCar.stop();
		logger.info("Number of wheels on car: " + myCar.getNumberOfWheels() );
		
		logger.info("Bike model:"+(((Bike) myBike).getModel()));
		myBike.start();
		myBike.stop();
		logger.info("Number of wheels on bike: " + myBike.getNumberOfWheels() );
	}

}
