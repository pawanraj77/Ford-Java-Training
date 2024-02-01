import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();

        productService.addProduct(new Product(01, "laptop", 1000));
        productService.addProduct(new Product(02, "keyboard", 600));
        productService.addProduct(new Product(03, "mouse", 500));
        productService.addProduct(new Product(04, "camera", 400));

        List<Product> allProducts = productService.displayProducts();
        System.out.println("Products: " + allProducts);

        Product product = productService.getProduct(01);
        System.out.println("Product with id 01: " + product);

        Product updatedProduct = new Product(02, "dell laptop", 1200);
        productService.updateProduct(02, updatedProduct);
        System.out.println("Updated product: " + productService.getProduct(02));

        productService.deleteProduct(03);
        System.out.println("After deleting product with id 03: " + productService.displayProducts());

    }
}
