import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private Map<Integer, Product> productMap = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product getProduct(int productId) {
        return productMap.get(productId);
    }

    @Override
    public void updateProduct(int productId, Product updatedProduct) {
        if(productMap.containsKey(productId)){
            productMap.put(productId, updatedProduct);
        }
    }

    @Override
    public void deleteProduct(int productId) {
        productMap.remove(productId);
    }

    @Override
    public List<Product> displayProducts() {
        return new ArrayList<>(productMap.values());
    }
}
