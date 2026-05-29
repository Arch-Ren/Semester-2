import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        var filename = "readtest.txt";
        var file = new File(filename);
        try (var reader = new FileReader(filename)) {
            var buffer = new BufferedReader(reader);
            var line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}