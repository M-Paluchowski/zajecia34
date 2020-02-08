package strategy;

import builder.User;

import java.math.BigDecimal;

public class UserAccountStrategy implements PaymentStrategy {

    @Override
    public void pay(final BigDecimal sum, final User user) {
        System.out.println("Fetching user balance: ");
        final BigDecimal balance = user.getBalance();
        if ( sum.compareTo(balance) < 0) {
            System.out.println("Nie można tego kupić");
        } else {
            user.setBalance(balance.min(sum));
            System.out.println("Zakup udany");
        }
    }
}
