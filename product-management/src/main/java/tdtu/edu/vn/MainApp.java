package tdtu.edu.vn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Load the Spring configuration file
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the Product beans from the Spring container
        Product product1 = (Product) context.getBean("product1");
        Product product2 = (Product) context.getBean("product2");
        Product product3 = (Product) context.getBean("product3");

        // Print the product information
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

        // Test the scope of the beans
        System.out.println("Is product1 a prototype bean? " + context.isPrototype("product1"));
        System.out.println("Is product2 a prototype bean? " + context.isPrototype("product2"));
        System.out.println("Is product3 a singleton bean? " + context.isSingleton("product3"));

    }

}
