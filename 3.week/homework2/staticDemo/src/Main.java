public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Ahmet Faruk";
        product.price = 456;
        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}