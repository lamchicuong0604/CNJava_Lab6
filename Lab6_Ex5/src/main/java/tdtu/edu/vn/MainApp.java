package tdtu.edu.vn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean = context.getBean(MyBean.class);
        System.out.println("Name: " + myBean.getName());
        System.out.println("Version: " + myBean.getVersion());
        context.close();
    }
}
