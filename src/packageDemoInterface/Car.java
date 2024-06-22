package packageDemoInterface;

import org.apache.logging.log4j.*;

public class Car implements VehicleInterface {
	
	private static final Logger logger = LogManager.getLogger(Car.class.getName());
	
	private String model;
	
	public Car(String model){
		this.model = model;
	}
	
	@Override
	public void start(){
		logger.info(model +" is starting.");
	}
	
	@Override
	public void stop(){
		logger.info(model +" is stopping.");
	}
	
	@Override
	public int getNumberOfWheels(){
		return 4;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
	}
}
