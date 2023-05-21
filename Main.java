package Products;

import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey service, add the products..

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
       
        
        Stream<Product> productStream = service.getProductWithText("Black Table").stream();
        
        
        
        List<Product> a = service.getAllProducts();
        Stream<Product> z= a.stream();
        Stream<Product> o =  z.filter(product->product.getPlace().equals("Black Table"));
        					 o.forEach(product -> System.out.println(product.toString()));
        					 
        					 System.out.println("______________________________");
       
        Stream<Product> i=a.stream();
        Stream<Product> n=i.filter(product->product.getWarranty()<2023);
        				  n.forEach(product -> System.out.println(product.toString()));
    }
}
