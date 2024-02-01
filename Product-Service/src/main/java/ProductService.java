import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    Product getProduct(int productId);
    void updateProduct(int productId, Product updatedProduct);
    void deleteProduct(int productId);

    List<Product> displayProducts();


}
