package issAssignment;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;

public class MultiThreadingExample {
    
	private static final Logger logger = LogManager.getLogger(MultiThreadingExample.class.getName());
    // Volatile keyword ensures visibility of changes to variables across threads
    private volatile boolean running = true;
    private int instanceCounter = 0;

    public static void main(String[] args) {
        MultiThreadingExample example = new MultiThreadingExample();
        example.execute();
    }

    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for (int i = 0; i < 10; i++) {
            executor.submit(new Task(i, this));
        }
        
        // Gracefully shutdown the executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        
        logger.info("All tasks completed.");
    }

    // Thread-safe method using synchronized keyword
    public synchronized void incrementInstanceCounter() {
        instanceCounter++;
        logger.info("Instance Counter: " + instanceCounter);
    }

    public void stopRunning() {
        running = false;
    }

    // A task class that implements Runnable
    static class Task implements Runnable {
        private int id;
        private MultiThreadingExample example;

        public Task(int id, MultiThreadingExample example) {
            this.id = id;
            this.example = example;
        }

        @Override
        public void run() {
            logger.info("Task " + id + " is running.");

            // Local variable thread safety: each thread gets its own copy of local variables
            int localCounter = 0;

            for (int i = 0; i < 5; i++) {
                localCounter++;
                synchronizedBlockExample();

                // Accessing the shared instance variable
                example.incrementInstanceCounter();

                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    logger.info("Task " + id + " was interrupted.");
                }
            }
            
            logger.info("Task " + id + " localCounter: " + localCounter);
        }

        // Synchronized block example
        private void synchronizedBlockExample() {
            synchronized (example) {
                // Critical section code
                if (example.running) {
                    logger.info("Running is true for task " + id);
                } else {
                    logger.info("Running is false for task " + id);
                }
            }
        }
    }
}
