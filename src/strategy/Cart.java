package strategy;

import builder.User;

import java.math.BigDecimal;
import java.util.List;

public class Cart {

    private final List<Product> products;
    private final User user;

    public Cart(final List<Product> products, final User user) {
        this.products = products;
        this.user = user;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        BigDecimal sum = calculatePrice();
        paymentStrategy.pay(sum, user);
    }

    private BigDecimal calculatePrice() {
        return products.stream()
            .map(Product::getPrice)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
