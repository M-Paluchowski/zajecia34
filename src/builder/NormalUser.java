package builder;

import java.math.BigDecimal;

public class NormalUser extends User {

    public NormalUser(final String firstName, final String lastName, final String email, final int height, final int weight, final int age,
                      final BigDecimal balance) {
        super(firstName, lastName, email, height, weight, age, balance);
    }

    public static NormalUserBuilder builder() {
        return new NormalUserBuilder();
    }

    public static class NormalUserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private int height;
        private int weight;
        private int age;
        private BigDecimal balance;

        public NormalUserBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public NormalUserBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public NormalUserBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public NormalUserBuilder height(final int height) {
            this.height = height;
            return this;
        }

        public NormalUserBuilder weight(final int weight) {
            this.weight = weight;
            return this;
        }

        public NormalUserBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public NormalUser build() {
            return new NormalUser(firstName, lastName, email, height, weight, age, balance);
        }
    }
}
