package test3;

public class Bank {
    public static void main(String[] args) {
        DefaultCard ShuraDefault = new DefaultCard();
        CreditCard ShuraCredit = new CreditCard();

        // default card
        ShuraDefault.setCardId(1234567891);
        ShuraDefault.setName("Shura");
        ShuraDefault.setBalance(0);

        // Shura add his money to Bank to Default Card, nothing more
        ShuraDefault.addBalance(1307.57);

        // Shura try to take more money from Credit Card
        ShuraCredit.subBalance(1200);

        ShuraDefault.displayAll();
        ShuraCredit.displayAll();
    }
}
