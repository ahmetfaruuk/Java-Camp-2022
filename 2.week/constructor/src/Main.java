public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",7856,5);

        /*product.setName("Laptop");
        product.setId(1  );
        product.setDescription("Asus Laptop");
        product.setPrice(7850);
        product.setStock(5);*/


        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());


    }

}
