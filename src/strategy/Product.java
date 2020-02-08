package strategy;

import java.math.BigDecimal;

public class Product {

    private BigDecimal price;

    public Product() {
    }

    public Product(final BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
