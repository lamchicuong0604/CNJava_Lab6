package tdtu.edu.vn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TextEditor editor = context.getBean(TextEditor.class);
        editor.input("This is a sample text.");
        editor.save("sample", "This is a sample text.");
    }
}

