package builder;

import java.math.BigDecimal;

public class PremiumUser extends User {

    private final String creaditCard;
    private final String telephone;

    public PremiumUser(final String firstName, final String lastName, final String email, final int height, final int weight, final int age1,
                       final String creaditCard, final String telephone, final BigDecimal balance) {
        super(firstName, lastName, email, height, weight, age1, balance);
        this.creaditCard = creaditCard;
        this.telephone = telephone;
    }

    public static PremiumUserBuilder builder() {
        return new PremiumUserBuilder();
    }

    public static class PremiumUserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private int height;
        private int weight;
        private int age;
        private String creaditCard;
        private String telephone;
        private BigDecimal balance;

        public void creaditCard(final String creaditCard) {
            this.creaditCard = creaditCard;
        }

        public void telephone(final String telephone) {
            this.telephone = telephone;
        }

        public PremiumUserBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PremiumUserBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PremiumUserBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public PremiumUserBuilder height(final int height) {
            this.height = height;
            return this;
        }

        public PremiumUserBuilder weight(final int weight) {
            this.weight = weight;
            return this;
        }

        public PremiumUserBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public PremiumUser build() {
            return new PremiumUser(firstName, lastName, email, height, weight, age, creaditCard, telephone, balance);
        }
    }
}
