import Product.Product;
import Product.ProductModel;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*Product p1 = new Product();
        p1.setPrice(1.99);
        BigDecimal price = p1.getPrice();
        System.out.println(price);*/

        new ProductModel();

        ProductModel p1 = new ProductModel();
        ProductModel p2 = new ProductModel();
        ProductModel p3 = p2;
        p1.setName("Tea");
        p2.setName("Cake");
        System.out.println(p1.getName()+" in a cup");
        System.out.println(p2.getName()+" on a plate");
        System.out.println(p3.getName()+" to share");
    }
}