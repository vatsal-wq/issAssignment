package issAssignment;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import org.apache.logging.log4j.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONdemo {

	
	private static final Logger logger = LogManager.getLogger(JSONdemo.class.getName());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating JSON object
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Vatsal Gadaria");
		jsonObject.put("age", 22);
		jsonObject.put("Nationality", "Indian");
		
		JSONArray hobbies = new JSONArray();
		hobbies.put("Hobby 1");
		hobbies.put("Hobby 2");
		hobbies.put("Hobby 3");
		
		jsonObject.put("hobbies", hobbies);
		
		logger.info("Created JSON Object: ");
		logger.info(jsonObject.toString(4));
		
		//converting JSON to string
		String jsonString = jsonObject.toString();
		logger.info(jsonString);
		
		//parsing JSON string to create JSON object
		String jsonStringToParse = "{'name':'Virat Kohli','age':35,'hobbies':['Cricket','Gym','Food']}";
		JSONObject parsedObject = new JSONObject(jsonStringToParse);
		logger.info(parsedObject);
		
		//reading a sample json file 
		File file = new File("src/sample.json");
		String file_path = file.getAbsolutePath();
		logger.info(file_path);
		if (!file.exists()){
			logger.error("File does not exists. ");
			return;
		}
		 try (FileReader reader = new FileReader(file)) {
	            JSONTokener tokener = new JSONTokener(reader);
	            JSONObject jsonObjectFromFile = new JSONObject(tokener);

	            System.out.println("\nJSON Object from File:");
	            System.out.println(jsonObjectFromFile.toString(4));
	        } catch (IOException e) {
	            System.err.println("Error reading the file sample.json: " + e.getMessage());
	            e.printStackTrace();
	        }
		
		 
		 //writing json to a file
		 try(FileWriter fileWriter = new FileWriter("output.json")){
			 fileWriter.write(jsonObject.toString(4));
			 logger.info("Succesfully written");
		 }catch(IOException e){
			 logger.error(e.getMessage());
			 e.printStackTrace();
		 }
//		
	}

}
