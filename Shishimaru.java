import java.io.*;

public class Shishimaru {
    public static void main(String[] args) {
        try (BufferedInputStream br1 = new BufferedInputStream(new FileInputStream("shishimaru.jpg"))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = br1.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead)); 
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}