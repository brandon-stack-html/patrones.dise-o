package builder;

public class Main {
    public static void main(String[] args) {
        // Construir un objeto Product utilizando el Builder
        Product product = new Product.ProductBuilder("Laptop")
                .setPrice(1000)
                .setDescription("High-end gaming laptop")
                .build();

        // Imprimir el objeto Product
        System.out.println(product);
    }
}

