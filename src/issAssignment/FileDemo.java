package issAssignment;

import org.apache.logging.log4j.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    private static final Logger logger = LogManager.getLogger(FileDemo.class.getName());

    public static void main(String[] args) {
        // File paths
        String filePathToRead = "file.txt";
        String filePathToWrite = "output.txt";

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathToRead))) {
            String line;
            logger.info("Reading from file: " + filePathToRead);
            while ((line = reader.readLine()) != null) {
                logger.info(line);
            }
        } catch (IOException e) {
            logger.error("Error reading from file: " + filePathToRead, e);
        }

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathToWrite))) {
            logger.info("Writing to file: " + filePathToWrite);
            writer.write("I am 22 years old");
            writer.newLine();
            writer.flush();  // Ensure data is written to file
        } catch (IOException e) {
            logger.error("Error writing to file: " + filePathToWrite, e);
        }

        // Reading from the written file
        try (BufferedReader reader2 = new BufferedReader(new FileReader(filePathToWrite))) {
            String line;
            logger.info("Reading from written file: " + filePathToWrite);
            while ((line = reader2.readLine()) != null) {
                logger.info(line);
            }
        } catch (IOException e) {
            logger.error("Error reading from file: " + filePathToWrite, e);
        }
    }
}

