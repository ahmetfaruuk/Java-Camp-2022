public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = "001";
        product.description = "Asus Laptop";
        product.price = 7850;
        product.stock = 5;
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }

}
