public class ProductManager {
    public void add(Product product){
        String productName = product.name;
        System.out.println(productName + "  eklendi.");

        String productId = product.id;
        System.out.println(productId + "  ürün id'si.");

        System.out.println(product.description + "  ürün açıklaması.");
    }
}
