package builder;

import java.math.BigDecimal;

public abstract class User {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final int height;
    private final int weight;
    private final int age;
    private BigDecimal balance;

    public User(final String firstName, final String lastName, final String email,
                final int height, final int weight, final int age1, final BigDecimal balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.age = age1;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(final BigDecimal balance) {
        this.balance = balance;
    }
}
