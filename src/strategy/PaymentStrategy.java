package strategy;

import builder.User;

import java.math.BigDecimal;

public interface PaymentStrategy {

    void pay(BigDecimal sum, final User user);
}
