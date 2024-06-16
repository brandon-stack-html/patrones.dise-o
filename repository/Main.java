package repository;
public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryImpl();

        productRepository.addProduct(new Product(1, "Laptop", 1000.0));
        productRepository.addProduct(new Product(2, "Smartphone", 500.0));

        System.out.println("Todos los productos:");
        for (Product product : productRepository.getAllProducts()) {
            System.out.println(product);
        }

        System.out.println("Producto con ID 1:");
        System.out.println(productRepository.getProductById(1));

        Product updatedProduct = new Product(1, "Laptop", 900.0);
        productRepository.updateProduct(updatedProduct);
        System.out.println("Producto actualizado con ID 1:");
        System.out.println(productRepository.getProductById(1));

        productRepository.deleteProduct(2);
        System.out.println("Todos los productos después de eliminar el producto con ID 2:");
        for (Product product : productRepository.getAllProducts()) {
            System.out.println(product);
        }
    }
}
