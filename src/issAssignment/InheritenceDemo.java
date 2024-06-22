package issAssignment;

import org.apache.logging.log4j.*;

//Animal class will act as the base class or parent class
abstract class Animal {
	static Logger logger = LogManager.getLogger(Animal.class.getName());
	
	private String name;
	
	//constructor
	public Animal(String name){
		this.name = name;
	}
	
	//get method 
	public String getName(){
		return name;
	}
	
	//abstract method to be implemented by subclasses or child classes
	public abstract void sound();
	
	public void sleep(){
		logger.info(name+" is sleeping.");
	}
}


//first subclass or child class Dog inheriting from Animal base class/parent class
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	
	@Override
	public void sound(){ //overriding hte abstract method from base class
		logger.info("woof");
	}
}


//second subclass or child class Cat inheriting from Animal base class/parent class
class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	
	@Override
	public void sound(){ //overriding the abstract method from base class
		logger.info("meow");
	}
}

public class InheritenceDemo{
	
	public static void main(String args[]){
		
		//creating references to Dog and Cat of type Animal
		Animal tommy_dog = new Dog("Tommy");
		tommy_dog.sound();
		tommy_dog.sleep();
		
		Animal luna_cat = new Cat("Luna");
		luna_cat.sound();
		luna_cat.sleep();
		
	}
}


























