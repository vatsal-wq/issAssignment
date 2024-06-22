package issAssignment;

import org.apache.logging.log4j.*;
import java.util.ArrayList;
import java.util.List;

public class Lists {
	
	private static final Logger logger = LogManager.getLogger(Lists.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<>();
		
		
		studentList.add(new Student("Virat",1));
		studentList.add(new Student("Rohit",2));
		studentList.add(new Student("Rishabh",4));
		
		for (Student student : studentList){
			logger.info(student);
		}
		
		studentList.remove(0);
		
		for (Student student : studentList){
			logger.info(student);
		}
	}

}
