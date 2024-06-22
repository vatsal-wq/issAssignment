package packageDemoInterface;

import org.apache.logging.log4j.*;

public class Bike implements VehicleInterface {
	
	private static final Logger logger = LogManager.getLogger(Bike.class.getName());
	
	private String model;

    public Bike(String model) {
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
		return 2;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
	}

}
