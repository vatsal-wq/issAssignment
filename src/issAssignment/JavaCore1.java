package issAssignment;

class JavaCore1{
	
	//main function for executing driver code
	public static void main(String[] args) {
			
			//creating objects of class Vehicle
			Vehicle car = new Vehicle();
			Vehicle bike = new Vehicle();
			
			//set attributes of object car and display the details
			car.setType("car");
			car.setBrand("Honda");
			car.setModel("City");
			car.setColor("Silver");
			
			car.printDetails();
			
			//set attributes of object bike and display the details
			bike.setType("bike");
			bike.setBrand("Honda");
			bike.setModel("CBR-1000RR-R");
			bike.setColor("Red");
			
			bike.printDetails();	
	}
}


