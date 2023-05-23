import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name, String type, String place, String color, boolean isOutOfWarranty) {
        Product product = new Product();
        product.setName(name);
        product.setType(type);
        product.setPlace(place);
        product.setColor(color);
        product.setOutOfWarranty(isOutOfWarranty);
        productRepository.save(product);
        System.out.println("Product added successfully!");
    }

    public void displayProducts() {
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Type: " + product.getType());
            System.out.println("Place: " + product.getPlace());
            System.out.println("Color: " + product.getColor());
            System.out.println("Warranty Status: " + (product.isOutOfWarranty() ? "Out of Warranty" : "In Warranty"));
            System.out.println();
        }
    }
}
