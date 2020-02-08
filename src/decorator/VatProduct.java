package decorator;

import strategy.Product;

import java.math.BigDecimal;

public class VatProduct extends Product {

    private Product product;

    public VatProduct(Product product) {
        super();
        this.product = product;
    }

    @Override
    public BigDecimal getPrice() {
        return product.getPrice().multiply(BigDecimal.valueOf(1.2));
    }
}
