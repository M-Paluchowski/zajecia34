package decorator;

import strategy.Product;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final Product product = new Product(BigDecimal.valueOf(10));
        final Product vatProduct = new VatProduct(product);
        System.out.println(vatProduct.getPrice());

        final Product otherCountryProduct = new OtherCountryProduct(vatProduct);
        System.out.println(otherCountryProduct.getPrice());
    }
}
