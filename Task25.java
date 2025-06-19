import java.io. BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task25 {
   public static void main(String[] args) {
      String filename = "br_writer_example.txt";
      String content = "Hello, World!\nThis is a BufferedWriter example.";

      // Initialize BufferedWriter with a FileWriter
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
         // Write content to the file
         writer.write(content);
         System.out.println("Content written to file.");
      } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
      }
   }
}
