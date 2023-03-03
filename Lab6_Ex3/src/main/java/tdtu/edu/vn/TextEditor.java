package tdtu.edu.vn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
    private TextWriter textWriter;

    @Autowired
    public TextEditor(@Qualifier("pdfTextWriter") TextWriter textWriter) {
        this.textWriter = textWriter;
    }

    public void input(String text) {
        // input logic
    }

    public void save(String fileName, String text) {
        textWriter.write(fileName, text);
    }
}
