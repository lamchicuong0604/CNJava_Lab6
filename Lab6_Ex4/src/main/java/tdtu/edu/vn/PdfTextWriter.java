package tdtu.edu.vn;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PdfTextWriter implements TextWriter {
    @Override
    public void write(String fileName, String text) {
        try (FileOutputStream fileStream = new FileOutputStream(fileName + ".pdf")) {
            Document document = new Document();
            PdfWriter.getInstance(document, fileStream);
            document.open();
            document.add(new Paragraph(text));
            document.close();
            System.out.println("Content written to file " + fileName + ".pdf");
        } catch (IOException | DocumentException e) {
            System.err.println("Error writing content to file " + fileName + ".pdf");
            e.printStackTrace();
        }
    }
}


