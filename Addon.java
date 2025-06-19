import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Addon {

    public static void main(String[] args) {
        // Define the source and destination file paths
        Path sourcePath = Paths.get("shishimaru.jpg"); // Replace with your source image path
        Path destinationPath = Paths.get("C:\\Users\\Administrator\\Documents\\vvk\\java\\18_06_2025\\copied_image"); // Replace with your desired destination path

        try {
            // Copy the file
            // REPLACE_EXISTING option overwrites the destination file if it already exists
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image copied successfully from " + sourcePath + " to " + destinationPath);
        } catch (IOException e) {
            System.err.println("Error copying image: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
