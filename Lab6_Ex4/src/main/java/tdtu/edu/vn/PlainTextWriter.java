package tdtu.edu.vn;

import java.io.FileWriter;
import java.io.IOException;
import org.springframework.stereotype.Component;

@Component
public class PlainTextWriter implements TextWriter {
    public void write(String fileName, String text) {
        try (FileWriter fileWriter = new FileWriter(fileName + ".txt")) {
            fileWriter.write(text);
            System.out.println("Content written to file " + fileName + ".txt");
        } catch (IOException e) {
            System.err.println("Error writing content to file " + fileName + ".txt");
            e.printStackTrace();
        }
    }
}