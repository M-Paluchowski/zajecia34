package strategy;

import builder.User;

import java.math.BigDecimal;

public class PayPalStrategy implements PaymentStrategy {

    @Override
    public void pay(final BigDecimal sum, final User user) {
        System.out.println("Fetching user data from paypal: ");
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
        System.out.println("Paying by PayPal");
        System.out.println("Sending information to paypal");
        System.out.println("Done");
    }
}
