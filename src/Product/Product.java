package Product;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    public BigDecimal getPrice(){
        return price;
    }
    public  void setPrice(double value) {
        price = BigDecimal.valueOf(value);
    }
}
