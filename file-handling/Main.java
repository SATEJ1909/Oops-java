import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Logger{
  private static String path ;

  public Logger(String path) throws IOException {
    File file = new File(path);

    if(!file.exists()){
        file.createNewFile();
    }
    this.path = path ;
  }

  public void log(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(message); 
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Failed to log this message " + message);
        }
    }
}


public class Main {
    public static void main(String[] args) {
     
        try {
            // Create a Logger instance with a specified log file path
            Logger myLogger = new Logger("application.log");

            // Log some messages
            myLogger.log("Application started...");
            myLogger.log("User logged in.");
            myLogger.log("Error: Unable to connect to the database.");
            myLogger.log("Application closed.");

            System.out.println("Logs have been written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

