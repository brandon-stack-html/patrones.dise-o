package builder;


// La clase Product que será construida
public class Product {
    // Atributos del producto
    private String name;
    private int price;
    private String description;

    // Constructor privado para forzar el uso del Builder
    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
    }

    // Clase estática Builder
    public static class ProductBuilder {
        private String name;
        private int price;
        private String description;

        // Constructor del Builder con el atributo obligatorio
        public ProductBuilder(String name) {
            this.name = name;
        }

        // Métodos para configurar los atributos opcionales
        public ProductBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        // Método build para construir el objeto Product
        public Product build() {
            return new Product(this);
        }
    }

    // Métodos getter para acceder a los atributos
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

