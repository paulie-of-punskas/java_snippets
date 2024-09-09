import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public void printFileContent(String file_path) {
        // Method checks if file exists and prints it. Otherwise, prints `false`.
        Path path = Paths.get(file_path);
        if (Files.exists(path)) {
            try {
                List<String> readFileContent = new ArrayList<>(Files.readAllLines(path));
                readFileContent.forEach(System.out::println);
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e);
            }
        } else {
            System.out.println(file_path + " does not exist");
        }
    }
}

