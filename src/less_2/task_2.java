package less_2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        String pathName = "sample1.json";
        System.out.println(readFile(pathName));
    }

    static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }
}
