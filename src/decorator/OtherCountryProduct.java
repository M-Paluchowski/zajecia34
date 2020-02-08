package decorator;

import strategy.Product;

import java.math.BigDecimal;

public class OtherCountryProduct extends Product{

    private Product product;

    public OtherCountryProduct(Product product) {
        super();
        this.product = product;
    }

    @Override
    public BigDecimal getPrice() {
        return product.getPrice().multiply(BigDecimal.valueOf(2));
    }

}
