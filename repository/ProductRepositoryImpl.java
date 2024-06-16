package repository;
import java.util.ArrayList;

public class ProductRepositoryImpl implements ProductRepository {
    private ArrayList<Product> products = new ArrayList<Product>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; // or throw an exception
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }

    @Override
    public void updateProduct(Product product) {
        Product existingProduct = getProductById(product.getId());
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
        }
    }

    @Override
    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
