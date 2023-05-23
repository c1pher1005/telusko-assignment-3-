import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        ProductService productService = context.getBean(ProductService.class);

        // Adding products
        productService.addProduct("Product 1", "Type 1", "Place 1", "Red", true);
        productService.addProduct("Product 2", "Type 2", "Place 2", "Blue", false);
        productService.addProduct("Product 3", "Type 1", "Place 3", "Green", true);

        // Displaying products
        productService.displayProducts();
    }
}
