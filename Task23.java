import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task23 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Large_file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
    

