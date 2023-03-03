package tdtu.edu.vn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Product product1 = context.getBean("product1", Product.class);
        Product product2 = context.getBean("product2", Product.class);
        Product product3 = context.getBean("product3", Product.class);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        context.close();
    }
}
