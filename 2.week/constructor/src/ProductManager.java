public class ProductManager {
    public void add(Product product){
        String productName = product.getName();
        System.out.println(productName + "  eklendi.");

        int productId = product.getId();
        System.out.println(productId + "  ürün id'si.");

        System.out.println(product.getDescription() + "  ürün açıklaması.");
    }
}
