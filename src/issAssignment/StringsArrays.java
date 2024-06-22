package issAssignment;

import org.apache.logging.log4j.*;

public class StringsArrays {
	
	final static Logger logger = LogManager.getLogger(StringsArrays.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "world";
		
		//concatenation of two strings
		String str3;
		str3 = str1+" "+str2;
		logger.info(str3);
		
		//length and indexing
		int str3_length = str3.length();
		logger.info(str3_length);
		logger.info(str3.charAt(7));
		
		//creating substrings from strings
		String str3_substring = str3.substring(2,7);
		logger.info(str3_substring);
		
		//converting string to an array of characters
		char[] str3_charArray = str3.toCharArray();
		logger.info("Characters in str3: ");
		for(char c : str3_charArray) {
			logger.info(c);
		}
		
		
		
		//creating array of numbers(table of 10 in this case)
		int[] _10table = {10,20,30,40,50,60,70,80,90,95};
		
		//length of the array
		logger.info(_10table.length);
		
		//elements can be accessed at any index (index 2 in this case)
		logger.info(_10table[2]);
		
		//modifying the last value in the array to get correct table of 10
		logger.info(_10table[9]);
		_10table[9]=100;
		logger.info(_10table[9]);
		
		//printing all elements in the array by iterating through it
		for(int num : _10table) {
			logger.info(num);
		}
		
		
		//two dimensional array
		
		int[][] twoArray = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//accessing center element at position 2,2
		logger.info("Element at (2,2) : " + twoArray[2][2]);
		
		//iterating through the two dimensional array
		for(int i = 0; i < twoArray.length; i++){
			for(int j=0; j < twoArray[i].length; j++){
				logger.info(twoArray[i][j]);
			}
			logger.info("");
		}
		
	}
}
