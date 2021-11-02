import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class JenkinsTestApp {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/text.txt");

        path = path.toAbsolutePath();
        System.out.println(path);
        System.out.println("Welcome to Jenkins!");
        System.out.println();
        Scanner scanner = new Scanner(path);
            System.out.println(scanner.nextLine());


    }
}
