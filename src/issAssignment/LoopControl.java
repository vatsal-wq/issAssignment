package issAssignment;

import org.apache.logging.log4j.*;

public class LoopControl {
	
	private static final Logger logger = LogManager.getLogger(LoopControl.class.getName());
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//loop to print odd numbers bw 1-10; continue statement skips over even numbers
		for (int i = 1; i<10; i++) {
			if(i%2==0) {
			continue;
			}
			logger.info(i);
		}	
		
		//searching for an element using break statement
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int target = 3;
		
		for (int i = 0; i < numbers.length ; i++) {
			if(numbers[i]==target) {
				logger.info("{} found at index {}",target,i);
				break;
			}
			if(i==numbers.length-1){
				logger.error("{} is not in given list.",target);
		
			}
		}
		
		
		
	}

}
